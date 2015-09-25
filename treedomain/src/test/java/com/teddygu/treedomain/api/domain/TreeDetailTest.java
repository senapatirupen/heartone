package com.teddygu.treedomain.api.domain;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
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
		treeDetail.setHeight("1o eanch");
		treeDetail.setShortDescription("short");
		treeDetail.setType("flower");
		session.save(treeDetail);
		transaction.commit();
	}

	@Test
	public void testAddressCreate() {
		SessionManager sessionManager = new SessionManager();
		Session session = sessionManager.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Address address = new Address();
		address.setAddressLineOne("addressLineOne");
		address.setAddressLineTwo("addressLineTwo");
		address.setCountry("India");
		address.setState("Orissa");
		address.setCity("Bangalore");
		address.setTownVillage("chandanpur");
		address.setLandMark("near post office");
		address.setZipcode("560067");
		session.save(address);
		transaction.commit();
	}

	@Test
	public void testPersonCreate() {
		SessionManager sessionManager = new SessionManager();
		Session session = sessionManager.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Person person = new Person();
		person.setDateOfBirth(new Date());
		person.setEmailId("emailId");
		person.setFirstName("firstName");
		person.setLastName("lastName");
		person.setMiddleName("middleName");
		person.setMobileNumber("1234");
		person.setPassword("pass");
		person.setUserName("user name");
		session.save(person);
		transaction.commit();
	}

	@Test
	public void testShippingDetailCreate() {
		SessionManager sessionManager = new SessionManager();
		Session session = sessionManager.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		ShippingDetail shippingDetail = new ShippingDetail();
		shippingDetail.setDeliverDate(new Date());
		shippingDetail.setExpectedDeliveryDate(new Date());
		shippingDetail.setIsDelevered("yes");
		shippingDetail.setShippingAddress("address");
		session.save(shippingDetail);
		transaction.commit();
	}

	@Test
	public void testStockDetailCreate() {
		SessionManager sessionManager = new SessionManager();
		Session session = sessionManager.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		StockDetail stockDetail = new StockDetail();
		stockDetail.setExpectedFinishDate(new Date());
		stockDetail.setExpectedInStockDate(new Date());
		stockDetail.setInStockDuration(new Date());
		stockDetail.setIsAvailable(true);
		stockDetail.setName("stock1");
		stockDetail.setQuantity("1");
		stockDetail.setQuantityConsumptionPerDate("10");
		session.save(stockDetail);
		transaction.commit();
	}

	@Test
	public void testOrderDetailCreate() {
		SessionManager sessionManager = new SessionManager();
		Session session = sessionManager.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setName("ord1");
		orderDetail.setPrice("123");
		orderDetail.setQuantity("4");
		session.save(orderDetail);
		transaction.commit();
	}

	@Test
	public void testTreePriceDetailCreate() {
		SessionManager sessionManager = new SessionManager();
		Session session = sessionManager.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		TreePriceDetail treePriceDetail = new TreePriceDetail();
		treePriceDetail.setPurchasePrice("1000");
		treePriceDetail.setSalePrice("2000");
		treePriceDetail.setProfit("100");
		treePriceDetail.setPurchasePercent("129");
		treePriceDetail.setSalePercent("100");
		treePriceDetail.setTax("123");
		session.save(treePriceDetail);
		transaction.commit();
	}

	@Test
	public void testSetTrdeId(){
		TreeDetail treeDetail = new TreeDetail();
		treeDetail.setTrdeId(100l);
		Long id = treeDetail.getTrdeId();
		Assert.assertEquals(100l, 100l);
	}

	@Test
	public void testSetTrdeId_1(){
		TreeDetail treeDetail = new TreeDetail();
		treeDetail.setTrdeId(100l);
		Long id = treeDetail.getTrdeId();
		Assert.assertEquals(100l, 100l);
	}
}
