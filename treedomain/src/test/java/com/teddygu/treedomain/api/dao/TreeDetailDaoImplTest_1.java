/**
 *
 */
package com.teddygu.treedomain.api.dao;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.teddygu.treedomain.api.domain.TreeDetail;

/**
 * @author Rupen
 *
 */
@TransactionConfiguration(defaultRollback=true)
//@ContextConfiguration({"classpath:treedomain-dao.xml", "classpath:test-treedomain-transaction.xml"})
@ContextConfiguration({"classpath*:spring-transaction-v2.xml.xml"})
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
public class TreeDetailDaoImplTest_1 {


	TreeDetailDaoImplV2 treeDetailDao = new TreeDetailDaoImplV2();

	@Test
	public void testShow(){
		System.out.println("output");
	}

	@Test
	public void testShow_1(){
		treeDetailDao.list();
		System.out.println("output list");
	}

	@Test
	public void testAdd(){
		TreeDetail treeDetail = new TreeDetail();
		treeDetail.setName("Rose");
		treeDetail.setLifeDuration("10 Years");
		treeDetail.setHeight("1o eanch");
		treeDetail.setShortDescription("short");
		treeDetail.setType("flower");
		treeDetailDao.add(treeDetail);
		System.out.println("output add");
	}


}
