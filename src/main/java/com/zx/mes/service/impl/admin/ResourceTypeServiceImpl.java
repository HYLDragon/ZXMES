package com.zx.mes.service.impl.admin;

import com.zx.mes.dao.admin.ResourceTypeMapper;
import com.zx.mes.model.admin.Resource;
import com.zx.mes.model.admin.ResourceType;
import com.zx.mes.pageModel.PresourceType;
import com.zx.mes.service.admin.ResourceTypeServiceI;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/14.
 */
@Service
public class ResourceTypeServiceImpl implements ResourceTypeServiceI {
    @Autowired
    private ResourceTypeMapper resourceTypeMapper;
    @Override
    @Cacheable(value = "resourceTypeServiceCache", key = "'resourceTypeList'")
    public List<PresourceType> getResourceTypeList() {
        List<ResourceType> l=resourceTypeMapper.getAll(new ResourceType());
        List<PresourceType> rl = new ArrayList<PresourceType>();
        if (l != null && l.size() > 0) {
            for (ResourceType t : l) {
                PresourceType rt = new PresourceType();
                BeanUtils.copyProperties(t, rt);
                rl.add(rt);
            }
        }
        return rl;
    }
}
