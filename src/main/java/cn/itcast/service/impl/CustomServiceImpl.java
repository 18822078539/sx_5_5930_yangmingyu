package cn.itcast.service.impl;

import cn.itcast.dao.CustomDao;
import cn.itcast.pojo.Custome;
import cn.itcast.service.CustomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author level
 * @create 2019/6/20 - 0:10
 */
/**
 * 20165930杨明宇
 */
@Service
public class CustomServiceImpl implements CustomService {
    @Resource
    CustomDao customDao;


    @Override
    public List<Custome> findAll() {
        return customDao.findAll();
    }

    @Override
    public void delete(Custome custome) {
        customDao.delete(custome);
    }

    @Override
    public void update(Custome custome) {
        customDao.update(custome);
    }

    @Override
    public void add(Custome custome) {
        customDao.add(custome);
    }

    @Override
    public Custome finById(Custome custome) {
        Custome custome1 = customDao.finById(custome);
        return custome1;
    }
}
