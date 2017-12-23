package cn.itcast.utitls;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * @author Administrator
 * 
 * 工具类
 * */
public class HibernateUtil {
	private static SessionFactory factory;
	
	//静态代码块
	static{
		Configuration cfg = new Configuration();
		cfg.configure();
		
		factory  = cfg.buildSessionFactory();
		
	}
	public static Session getCurrentSession(){
		return factory.getCurrentSession();
		
	}

}
