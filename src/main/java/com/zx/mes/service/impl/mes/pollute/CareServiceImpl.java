package com.zx.mes.service.impl.mes.pollute;

import com.zx.mes.dao.mes.CareMapper;
import com.zx.mes.model.mes.Care;
import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.mes.pollute.Pcare;
import com.zx.mes.service.mes.pollute.CareServiceI;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/23.
 */
@Service
public class CareServiceImpl implements CareServiceI {

    @Autowired
    private CareMapper careMapper;

    @Override
    public void add(Pcare pcare) {
        Care care=new Care();
        BeanUtils.copyProperties(pcare,care);
        //添加保养记录的时间
        care.setCreatedatetime(new Date());
        care.setCaretypeId(pcare.getCareTypeId());
        //if (pcare.getCareTypeId()!=null && !pcare.getCareTypeId().equalsIgnoreCase("")){
        //
        //}
        careMapper.insertSelective(care);
    }

    @Override
    public void edit(Pcare pcare) {
        Care care=new Care();
        BeanUtils.copyProperties(pcare,care);
        care.setCaretypeId(pcare.getCareTypeId());
        care.setModifydatetime(new Date());
        careMapper.updateByPrimaryKeySelective(care);
    }

    @Override
    public void delete(Pcare pcare) {
        careMapper.deleteByPrimaryKey(pcare.getId());
    }

    @Override
    public DataGrid datagrid(Pcare pcare, PageHelper ph) {
        DataGrid datagrid=new DataGrid();
        Care care=new Care();
        BeanUtils.copyProperties(pcare,care);
        com.github.pagehelper.PageHelper.startPage(ph.getPage(),ph.getRows());
        care.setCreatedatetime(pcare.getCreatedatetimeStart());
        care.setModifydatetime(pcare.getCreatedatetimeEnd());
        if (pcare.getCareTypeId()!=null){
            care.setCaretypeId(pcare.getCareTypeId());
        }
        List<Care> careList=careMapper.getAllWithCareType(care);

        datagrid.setRows(changeModel(careList));
        datagrid.setTotal(careMapper.getCount(care));

        return datagrid;
    }

    @Override
    public Pcare get(String id) {
        Care care=new Care();
        Pcare pcare=new Pcare();
        care.setId(id);
        care=careMapper.getAllWithCareType(care).get(0);
        BeanUtils.copyProperties(care,pcare);

        if (care.getCareType()!=null) {
            pcare.setCareTypeId(care.getCareType().getId());
            pcare.setCareTypeName(care.getCareType().getName());
        }
        return pcare;
    }

    private List changeModel(List<Care> careList) {
        List<Pcare> pcareList=new ArrayList<>();
        for (int i=0;i<careList.size();i++){
            Pcare pcare=new Pcare();
            BeanUtils.copyProperties(careList.get(i),pcare);
            if (careList.get(i).getCareType()!=null) {
                pcare.setCareTypeId(careList.get(i).getCareType().getId());
                if (careList.get(i).getCareType().getName()!=null){
                    pcare.setCareTypeName(careList.get(i).getCareType().getName());
                }
            }
            pcareList.add(pcare);
        }
        return pcareList;
    }
}
