package cn.itcast.dao;

import java.util.List;

import cn.itcast.dao.ICustomerDao;
import cn.itcast.entity.Customer;
import cn.itcast.utitls.HibernateUtil;


public class CustomerDaoImpl implements ICustomerDao {

    //查询所有的客户
    @Override
    public List<Customer> findAllCustomer() {
        return HibernateUtil.getCurrentSession().createQuery("from Customer").list();//hibernate链式写法
    }

}
