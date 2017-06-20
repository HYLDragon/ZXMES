package com.zx.mes.service.impl.mes;

import com.zx.mes.dao.mes.RfidcardMapper;
import com.zx.mes.model.mes.Rfidcard;
import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.mes.Prfidcard;
import com.zx.mes.service.mes.RFIDCardServiceI;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Administrator on 2017/6/19.
 */
@Service
public class RFIDCardServiceImpl implements RFIDCardServiceI {

    @Autowired
    private RfidcardMapper rfidcardMapper;

    @Override
    public DataGrid datagrid(Prfidcard card, PageHelper ph) {
        DataGrid datagrid=new DataGrid();
        List<Prfidcard> prfidcardList=new ArrayList<>();
        if (ph.getPage()==0){
            ph.setPage(1);
            ph.setRows(10);
        }
        com.github.pagehelper.PageHelper.startPage(ph.getPage(),ph.getRows());
        Rfidcard rfidcard=new Rfidcard();
        if (card.getPalletNo()!=null && ! card.getPalletNo().equalsIgnoreCase("")){
            rfidcard.setPalletno(card.getPalletNo());
        }
        if(card.getDept()!=null && ! card.getDept().equalsIgnoreCase("")){
            rfidcard.setDept(card.getDept());
        }

        List<Rfidcard> rfidcardList= rfidcardMapper.getAllByRFID(rfidcard);
        datagrid.setRows(changeModel(rfidcardList,prfidcardList));
        datagrid.setTotal(rfidcardMapper.count(rfidcard));
        return datagrid;
    }

    private List<Prfidcard> changeModel(List<Rfidcard> rfidcardList, List<Prfidcard> prfidcardList) {
        //double ddddd;
        //SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for(int i=0;i<rfidcardList.size();i++){
            Prfidcard prfidcard=new Prfidcard();
            Rfidcard rfidcard=rfidcardList.get(i);
            BeanUtils.copyProperties(rfidcard,prfidcard);
            //ddddd=( rfidcard.getLastbindtime().doubleValue()-3)*24*60*60*1000-(70*365*24+10)*60*60*1000;
            //Date date=new Date((long) ddddd);
            prfidcard.setPalletNo(rfidcard.getPalletno());
            prfidcard.setCreateTime(rfidcard.getCreatetime());
            prfidcard.setLastBindTime(rfidcard.getLastbindtime());
            prfidcard.setPalletType(rfidcard.getPallettype());
            prfidcard.setDept(rfidcard.getDept());
            prfidcardList.add(prfidcard);
        }
        return prfidcardList;
    }
}
