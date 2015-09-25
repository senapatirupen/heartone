/**
 *
 */
package com.teddygu.treedomain.api.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;
import com.teddygu.treedomain.api.domain.TreeDetail;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

/**
 * @author Rupen
 *
 */
@Repository
@Transactional
public class TreeDetailDaoImpl implements TreeDetailDao {

	Logger logger = LoggerFactory.getLogger(TreeDetailDaoImpl.class);

	@PersistenceContext(unitName="treeweb")
	protected EntityManager entityManager;

	@Transactional(value = "transactionManager",propagation = Propagation.REQUIRED)
	public void list() {
		logger.info("Entering application.");
		logger.debug("Entering application.");
		List<TreeDetail> treeDetails = entityManager.createQuery(
				"from TreeDetail").getResultList();
		System.out.println(treeDetails);
	}

	@Override
	@Transactional(value = "transactionManager",propagation = Propagation.REQUIRED)
	public void add(TreeDetail treeDetail) {
		entityManager.persist(treeDetail);
		entityManager.flush();
	}
}
