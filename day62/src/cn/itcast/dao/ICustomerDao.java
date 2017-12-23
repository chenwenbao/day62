package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.Customer;

/**
 * 持久层接口
 * @author Johnny.Chen
 *
 */
public interface ICustomerDao {

    List<Customer> findAllCustomer();

}
