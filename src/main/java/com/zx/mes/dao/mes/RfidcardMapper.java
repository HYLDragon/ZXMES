package com.zx.mes.dao.mes;

import com.zx.mes.model.mes.Rfidcard;

public interface RfidcardMapper {
    int insert(Rfidcard record);

    int insertSelective(Rfidcard record);
}