package cn.itcast.test;

import java.util.List;

import cn.itcast.entity.Customer;
import cn.itcast.service.ICustomerService;
import cn.itcast.service.impl.CustomerServceImpl;


public class HibernateTest {

    public static void main(String[] args) {
        ICustomerService cs = new CustomerServceImpl();
        List<Customer> list = cs.findAllCustomer();
        for (Customer customer : list) {
            System.out.println(customer);
        }

    }

}
