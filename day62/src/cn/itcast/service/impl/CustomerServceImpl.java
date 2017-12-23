package cn.itcast.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.itcast.dao.CustomerDaoImpl;
import cn.itcast.dao.ICustomerDao;
import cn.itcast.entity.Customer;
import cn.itcast.service.ICustomerService;


import cn.itcast.utitls.HibernateUtil;

public class CustomerServceImpl implements ICustomerService {
	
	
	private ICustomerDao  customerdao = new CustomerDaoImpl();
	
	
	//查询所有客户
	@Override
	public List<Customer> findAllCustomer() {
		Session s = null;
		Transaction tx = null;
		
		try{
			//1获取当前线程session
			s = HibernateUtil.getCurrentSession();
			
			//2开启事物
			tx = s.beginTransaction();
			
			//3查询
			List<Customer> list = customerdao.findAllCustomer();
			
			//提交事务
			tx.commit();
			
			//返回值
			return list;
			
		}catch(Exception e){
			
			 //6、回滚事务
            tx.rollback();
            e.printStackTrace();
            throw new RuntimeException("查询出错");
		}
	}

}
