package com.teddygu.treedomain.api.dao;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teddygu.treedomain.api.domain.TreeDetail;

public class TreeDetailDaoImplTest {
	public static void main(String[] args) {

		/*try {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring-transaction.xml");
			TreeDetailDaoImpl treeDetailDaoImpl = (TreeDetailDaoImpl)context.getBean("treeDetailDao");
			treeDetailDaoImpl.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring-transaction-v2.xml");
			TreeDetailDaoImplV2 treeDetailDaoImpl = (TreeDetailDaoImplV2)context.getBean("treeDetailDaoImpl");
			treeDetailDaoImpl.list();
//			TreeDetail treeDetail = new TreeDetail();
//			treeDetail.set
//			treeDetailDaoImpl.add(treeDetail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

