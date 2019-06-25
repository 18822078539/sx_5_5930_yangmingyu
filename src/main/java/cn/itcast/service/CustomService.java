package cn.itcast.service;

import cn.itcast.pojo.Custome;

import java.util.List;

/**
 * @author level
 * @create 2019/6/20 - 0:10
 */
/**
 * 20165930杨明宇
 */
public interface CustomService {
    List<Custome> findAll();
    void delete(Custome custome);
    void update(Custome custome);
    void add(Custome custome);
    Custome finById(Custome custome);

}
