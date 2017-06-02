package com.zx.mes.service.impl.bar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zx.mes.dao.bar.RepertoryDaoI;
import com.zx.mes.model.bar.Trepertory;
import com.zx.mes.service.bar.RepertoryServiceI;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.bar.Repertory;

@Service
public class RepertoryServiceImpl implements RepertoryServiceI {
	@Autowired
	private RepertoryDaoI repertoryDao;
	
	@Override
	public DataGrid datagrid(Repertory repertory,PageHelper pageHelper) {
		DataGrid datagrid=new DataGrid();
		Map<String, Object> params=new HashMap<String, Object>();
		String hql="from Trepertory t ";
		List<Repertory> lRepertories=new ArrayList<Repertory>();
		List<Trepertory> lTrepertories=repertoryDao.find(hql+whereHql(repertory, params), params, pageHelper.getPage(), pageHelper.getRows());
		for (Trepertory trepertory : lTrepertories) {
			lRepertories.add(changeModel(trepertory));
		}
		datagrid.setRows(lRepertories);
		params.clear();
		datagrid.setTotal(count(repertory,params));
		return datagrid;
	}

	private Repertory changeModel(Trepertory trepertory) {
		Repertory repertory=new Repertory();
		BeanUtils.copyProperties(trepertory, repertory);
		return repertory;
	}

	@Override
	public void add(Repertory repertory) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Repertory repertory) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Repertory repertory) {
		// TODO Auto-generated method stub

	}
	
	private long count(Repertory repertory,Map<String, Object> params){
		String hql="select count(*) from Trepertory t ";
		return repertoryDao.count(hql+whereHql(repertory, params), params);
	}
	
	private String whereHql(Repertory repertory,Map<String, Object> params){
		String hql="";
		if (repertory!=null) {
			hql="where 1=1 ";
			
		}
		
		return hql;
	}

}
