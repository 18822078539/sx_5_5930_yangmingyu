package cn.itcast.dao.impl;

import cn.itcast.dao.CustomDao;
import cn.itcast.pojo.Custome;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author level
 * @create 2019/6/20 - 0:05
 */

/**
 * 20165930杨明宇
 */
@Repository
public class CustomDaoImpl extends HibernateDaoSupport implements CustomDao {
    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }


    @Override
    public List<Custome> findAll() {
        List<Custome> list = (List<Custome>) this.getHibernateTemplate().find("from Custome");
        return list;
    }

    @Override
    public void delete(Custome custome) {
        try {
            // 获取对象的id
            Custome d = (Custome) this.getHibernateTemplate().get(Custome.class, custome.getCustomid());
            // 执行删除方法 删除id
            this.getHibernateTemplate().delete(d);
            // 删除成功 return 1;
        } catch (Exception e) {
        }
    }

    @Override
    public void update(Custome custome) {
        try {
            // 调用我们定义的接口 增加数据
            this.getHibernateTemplate().update(custome);

        } catch (Exception e) {
            // TODO: handle exception

        }
    }

    @Override
    public void add(Custome custome) {
// TODO Auto-generated method stub
        try {
            // 调用我们定义的接口 增加数据
            this.getHibernateTemplate().setCheckWriteOperations(false);
            this.getHibernateTemplate().save(custome);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

    }

    @Override
    public Custome finById(Custome custome) {
        // TODO Auto-generated method stub
        // 查询出对象的id
        Custome dd = (Custome) this.getHibernateTemplate().get(Custome.class, custome.getCustomid());
        return dd;
    }
    }
