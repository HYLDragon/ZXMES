package com.zx.mes.service.impl.admin;

import com.zx.mes.dao.admin.BugMapper;
import com.zx.mes.dao.admin.BugTypeMapper;
import com.zx.mes.model.admin.Bug;
import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.Pbug;
import com.zx.mes.service.admin.BugServiceI;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/14.
 */
@Service
public class BugServiceImpl implements BugServiceI {

    @Autowired
    private BugMapper bugDao;

    @Autowired
    private BugTypeMapper bugTypeDao;


    @Override
    public DataGrid dataGrid(Pbug bug, PageHelper ph) {
        DataGrid dg = new DataGrid();
        List<Pbug> bl = new ArrayList<Pbug>();
        com.github.pagehelper.PageHelper.startPage(ph.getPage(),ph.getRows());

        List<Bug> l=bugDao.getAllWithBugType(new Bug());

        if (l != null && l.size() > 0) {
            for (Bug t : l) {
                Pbug b=new Pbug();
                BeanUtils.copyProperties(t, b, new String[] { "note" });
                b.setTypeId(t.getBugtypeId());
                b.setTypeName(bugTypeDao.selectByPrimaryKey(b.getTypeId()).getName());
                bl.add(b);

            }
        }
        dg.setRows(bl);
        dg.setTotal(bugDao.getCount(new Bug()));
        return dg;
    }

    @Override
    public void add(Pbug bug) {

    }

    @Override
    public Pbug get(String id) {
        return null;
    }

    @Override
    public void edit(Pbug bug) {

    }

    @Override
    public void delete(String id) {

    }
}
