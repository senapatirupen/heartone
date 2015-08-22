package com.teddygu.treedomain.api.domain;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.teddygu.treedomain.api.domain.TreeDetail;
import com.teddygu.treedomain.api.util.SessionManager;

@RunWith(JUnit4.class)
public class TreeDetailTest {

	@Test
	public void testTreeDetailCreate() {
		SessionManager sessionManager = new SessionManager();
		Session session = sessionManager.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		TreeDetail treeDetail = new TreeDetail();
		treeDetail.setName("Rose");
		treeDetail.setLifeDuration("10 Years");
		session.save(treeDetail);
		transaction.commit();
	}
}
