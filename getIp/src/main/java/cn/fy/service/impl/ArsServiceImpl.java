package cn.fy.service.impl;

import cn.fy.dao.ArsDao;
import cn.fy.domain.Ars;
import cn.fy.service.ArsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("arsService")
public class ArsServiceImpl implements ArsService {

    @Autowired
    private ArsDao arsDao;

    public void setArsDao(ArsDao arsDao) {
        this.arsDao = arsDao;
    }


    @Override
    public void addIp(Ars ars) {
        if (arsDao.countIp()>200){
            deleteAll();
        }
         arsDao.addArsIp(ars);


    }

    @Override
    public void deleteAll() {
        List<Ars> all = arsDao.findAll();
        for (Ars ars : all) {
            arsDao.delByid(ars.getId());
        }
    }
}
