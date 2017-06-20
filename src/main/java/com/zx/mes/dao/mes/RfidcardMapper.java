package com.zx.mes.dao.mes;

import com.zx.mes.model.mes.Rfidcard;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RfidcardMapper {
    int insert(Rfidcard record);

    int insertSelective(Rfidcard record);

    List<Rfidcard> getAllByRFID(Rfidcard rfidcard);

    long count(Rfidcard rfidcard);
}