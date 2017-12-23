package cn.itcast.service;

import java.util.List;

import cn.itcast.entity.Customer;

/**
 * 业务层
 * @author Johnny.Chen
 *
 */
public interface ICustomerService {
    
    /**
     * 查询所有客户
     * @return
     */
    public List<Customer> findAllCustomer();

}
