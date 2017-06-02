package com.zx.mes.service.impl.bar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.mes.dao.bar.RfidDaoI;
import com.zx.mes.model.bar.Trfid;
import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.bar.Rfid;
import com.zx.mes.service.bar.RfidServiceI;
@Service
public class RfidServiceImpl implements RfidServiceI {
	@Autowired
	private RfidDaoI rfidDao;
	
	@Override
	public DataGrid datagrid(Rfid rfid,PageHelper pageHelper) {
		DataGrid datagrid=new DataGrid();
		Map<String, Object> params=new HashMap<String, Object>();
		String hql="from Trfid t ";
		List<Rfid> rfids=new ArrayList<Rfid>();
		List<Trfid> trfids=rfidDao.find(hql+whereHql(rfid, params), params, pageHelper.getPage(), pageHelper.getRows());
		for (Trfid trfid : trfids) {
			rfids.add(changeModel(trfid));
		}
		datagrid.setRows(rfids);
		params.clear();
		datagrid.setTotal(count(rfid, params));
		return datagrid;
	}

	private Rfid changeModel(Trfid trfid) {
		Rfid rfid=new Rfid();
		BeanUtils.copyProperties(trfid, rfid);
		
		return rfid;
	}

	@Override
	public void add(Rfid rfid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Rfid rfid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Rfid rfid) {
		// TODO Auto-generated method stub

	}
	
	private long count(Rfid rfid,Map<String, Object>params){
		String hql="select count(*) from Trfid t ";
		return rfidDao.count(hql+whereHql(rfid, params), params);
	}
	
	private String whereHql(Rfid rfid,Map<String, Object> params){
		String hql="";
		if (rfid!=null) {
			hql+=" where 1=1 ";
			if (rfid.getPalletNo()!=null) {
				hql+=" and t.palletNo like :palletNo";
				params.put("palletNo", rfid.getPalletNo());
			}
		}
		return hql;
	}

}
