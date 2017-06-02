package com.zx.mes.service.impl.bar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.zx.mes.dao.bar.BarDaoI;
import com.zx.mes.model.bar.Tbar;
import com.zx.mes.model.bar.TbarTrfid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.mes.model.bar.TbarTrepertory;
import com.zx.mes.model.bar.Trepertory;
import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.bar.Bar;
import com.zx.mes.service.bar.BarServiceI;
@Service
public class BarServiceImpl implements BarServiceI {
	@Autowired
	private BarDaoI barDao;
	
	@Override
	public DataGrid dataGrid(Bar bar,PageHelper pHelper) {
		DataGrid dataGrid=new DataGrid();
		String hql="from Tbar t ";
		HashMap<String, Object> params=new HashMap<String, Object>();
		List<Tbar> l=new ArrayList<Tbar>();
		List<Bar> l2=new ArrayList<Bar>();
		l=barDao.find(hql+whereHql(bar, params), params,pHelper.getPage(),pHelper.getRows());
		
		for (Tbar tbar : l) {
			Bar bar2=new Bar();
			changeModel(tbar,bar2);
			l2.add(bar2);
		}
		dataGrid.setRows(l2);
		//重新生成SQL
		params.clear();
		dataGrid.setTotal(countBar(bar, params));
		return dataGrid;
	}

	private void changeModel(Tbar tbar, Bar bar2) {
		BeanUtils.copyProperties(tbar, bar2);
		//显示库位 //有可能一个条码对就多个记录(改变库位)
		if (tbar!=null) {
			Set<TbarTrepertory> tbarrepertories=tbar.getTbarTrepertories();
			Boolean b=false;
			String kuweis="";
			String kuweiDates="";
			if (tbarrepertories!=null && !tbarrepertories.isEmpty()) {
				for (TbarTrepertory tbarrepertory : tbarrepertories) {
					Trepertory trepertory= tbarrepertory.getTrepertory();
					if (b) {
						kuweis+=","+trepertory.getRepertoryName();
						kuweiDates+=","+tbarrepertory.getCreatedDateTime();
					}else {
						kuweis=trepertory.getRepertoryName();
						kuweiDates=""+tbarrepertory.getCreatedDateTime();
						b=true;
					}
				}
				bar2.setKuWei(kuweis);
				bar2.setKuWeiDate(kuweiDates);
			}
		}
		
		//显示何种胶料
		if (tbar.getTmattype()!=null) {
			bar2.setMatType(tbar.getTmattype().getMatTypeName());
		}
		//显示是试，量，正
		if (tbar.getTmattypeslz()!=null) {
			bar2.setMatTypeSLZ(tbar.getTmattypeslz().getMatName());
		}
		//显示栈板编号
		if (tbar!=null) {
			Set<TbarTrfid> tbarrfids=tbar.getTbarTrfids();
			String palletNo="";
			String palletNoDate="";
			boolean b=false;
			if (tbarrfids!=null && !tbarrfids.isEmpty()) {
				for (TbarTrfid tbarrfid : tbarrfids) {
					if (b) {
						palletNo+=",";
						palletNoDate+=",";
					}else {
						b=true;
					}
					palletNo+=tbarrfid.getTrfid().getPalletNo();
					palletNoDate+=tbarrfid.getCreatedDateTime();
				}
				bar2.setPalletNo(palletNo);
				bar2.setPalletNoDate(palletNoDate);
			}
		}

	}
	
	//拼接限制条件
	private String whereHql(Bar bar,Map<String, Object> params){
		String hql="";
		if (bar!=null) {
			hql += " where 1=1 ";
			if (bar.getShortBarCX()!=null) {
				hql += " and t.shortBar like :shortBar";
				params.put("shortBar", "%%" + bar.getShortBarCX() + "%%");
			}
			if (bar.getMatName() != null) {
				hql += " and t.matName like :matName";
				params.put("matName", "%%"+bar.getMatName()+"%%");
			}
			if (bar.getMatType()!=null) {
				String matType=bar.getMatType();
				String matTypeId="";
				switch (matType) {
					case "加促" :
						matTypeId="4";
						break;
					case "未促" :
						matTypeId="3";
						break;
					case "药品" :
						matTypeId="5";
						break;
					default :
						break;
				}
				
				if ("".equals(matTypeId)) {
					//此条件无效，不作添加
				}else {
					hql+=" and t.TMattype.id = :TMattype";
					params.put("TMattype", ""+matTypeId+"");
				}
				
			}
			if (bar.getMatLotCX()!=null) {
				hql+=" and t.matLot like :matLotCX";
				params.put("matLotCX", "%%"+bar.getMatLotCX()+"%%");
			}
			if (bar.getCreatedDateTimeStart() != null) {
				hql += " and t.createdDateTime >= :createdDateTimeStart";
				params.put("createdDateTimeStart", bar.getCreatedDateTimeStart());
			}
			if (bar.getCreatedDateTimeEnd() != null) {
				hql += " and t.createdDateTime <= :createdDateTimeEnd";
				params.put("createdDateTimeEnd", bar.getCreatedDateTimeEnd());
			}
			if (bar.getModifyDateTimeStart() != null) {
				hql += " and t.modifyDateTime >= :modifyDateTimeStart";
				params.put("modifyDateTimeStart", bar.getModifyDateTimeStart());
			}
			if (bar.getModifyDateTimeEnd() != null) {
				hql += " and t.modifyDateTime <= :modifyDateTimeEnd";
				params.put("modifyDateTimeEnd", bar.getModifyDateTimeEnd());
			}
		}
		
		return hql;
	}
	//排序
	@SuppressWarnings("unused")
	private String orderHql(PageHelper pHelper) {
		String orderString = "";
		if (pHelper.getSort() != null && pHelper.getOrder() != null) {
			orderString = " order by t." + pHelper.getSort() + " " + pHelper.getOrder();
		}
		return orderString;
	}
	
	//统计总量(有限制条件)
	private long countBar(Bar bar,Map<String, Object> params){
		String hql="select count(*) from Tbar t";
		return barDao.count(hql+whereHql(bar, params), params);
	}
	
	@Override
	public void add(Bar bar) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Bar bar) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Bar bar) {
		// TODO Auto-generated method stub

	}

}
