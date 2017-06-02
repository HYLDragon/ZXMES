package com.zx.mes.service.impl.bar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zx.mes.dao.bar.BarrfidDaoI;
import com.zx.mes.model.bar.Tbar;
import com.zx.mes.model.bar.TbarTrfid;
import com.zx.mes.service.bar.BarrfidServiceI;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.User;
import com.zx.mes.pageModel.bar.Barrfid;

@Service
public class BarrfidServiceImpl implements BarrfidServiceI {
	@Autowired
	private BarrfidDaoI barrfidDao;
	
	@Override
	public DataGrid datagrid(Barrfid barrfid, PageHelper pageHelper) {
		DataGrid datagrid=new DataGrid();
		Map<String, Object> params=new HashMap<String, Object>();
		String hql=" from TbarTrfid  where  rfidId = :rfidId order by createdDateTime desc";
		//String hql=" from Tbarrfid t where  t.TRfid = :TRfid order by t.createdDateTime desc";
		params.put("rfidId", barrfid.getRfidId());
		List<Barrfid> barrfids=new ArrayList<Barrfid>();
		List<TbarTrfid> tbarrfids=barrfidDao.find(hql, params, pageHelper.getPage(), pageHelper.getRows());
		
		for (TbarTrfid tbarrfid : tbarrfids) {
			barrfids.add(changeModel(tbarrfid));
		}
		datagrid.setRows(barrfids);
		datagrid.setTotal((long)barrfids.size());
		return datagrid;
	}

	private Barrfid changeModel(TbarTrfid tbarrfid) {
		Barrfid barrfid=new Barrfid();
		BeanUtils.copyProperties(tbarrfid, barrfid);
		
		//json转换
//		 String s = "{\"id\":\"0375\",\"city\":\"平顶山\"}";  
//	        //一个简单方便 的方法将Json文本信息转换为JsonObject对象的同时转换为JavaBean对象！  
//	        Weibo weibo = JSON.parseObject(s, Weibo.class);//Weibo类在下边定义  
//	        System.out.println(weibo.getId());  
//	        System.out.println(weibo.getCity()); 
		if (tbarrfid!=null && tbarrfid.getRemark()!=null && !"".equals(tbarrfid.getRemark()) ) {
			User user=JSON.parseObject(tbarrfid.getRemark(), User.class);
			barrfid.setName(user.getName());
		}
		
		if (tbarrfid!=null && tbarrfid.getTrfid()!=null) {
			barrfid.setPalletNo(tbarrfid.getTrfid().getPalletNo());
		}
		
		if (tbarrfid!=null && tbarrfid.getTbar()!=null) {
			Tbar bar=tbarrfid.getTbar();
			barrfid.setShortbar(bar.getShortBar());
			barrfid.setOldbar(bar.getMatName()+"-"+bar.getMatLot().substring(4)+"-"+bar.getStarBatch()+"-"+bar.getEndBatch());
		}
		return barrfid;
	}
	
	private String whereHql(Barrfid barrfid,Map<String, Object> params){
		String hql="";
		
		return hql;
	}

}
