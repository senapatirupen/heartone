/**
 *
 */
package com.teddygu.tree.api.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.teddygu.tree.api.domain.Person;

/**
 * @author Rupen
 *
 */

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao{

	Logger logger = LoggerFactory.getLogger(PersonDaoImpl.class);

//	@Autowired
//	@Qualifier(value="entityManagerFactory")
//	private EntityManagerFactory entityManagerFactory;
//
//    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
//        this.entityManagerFactory = entityManagerFactory;
//    }

	@Autowired
	@PersistenceContext(unitName="treeweb")
	private EntityManager entityManager;

	public void save(Person person) {
		// TODO Auto-generated method stub

	}

	public Person findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Person findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(value = "transactionManager",propagation = Propagation.REQUIRED)
	public Collection<Person> list() {
		List<Person> personList = entityManager.createQuery("FROM Person").getResultList();
//		List<Person> personList = emf.createEntityManager().createQuery("FROM Person").getResultList();
		if(!CollectionUtils.isEmpty(personList)){
			logger.info("we get the personList");
			return personList;
		}
		List<Person> personLists = entityManager.createNativeQuery("Person.list").getResultList();
//		List<Person> personLists = emf.createEntityManager().createNativeQuery("Person.list").getResultList();
		if(!CollectionUtils.isEmpty(personList)){
			logger.info("we get the personLists");
		}
		return personLists;
	}

	public void delete(Person person) {
		// TODO Auto-generated method stub

	}
}
