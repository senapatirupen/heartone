package com.nhpost.post.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.engine.spi.SessionEventListenerManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nhpost.post.common.exception.DataAccessException;
import com.nhpost.post.dao.PostInitDao;
import com.nhpost.post.domain.Post;

// TODO: Auto-generated Javadoc
/**
 * The Class PostInitDaoImpl.
 */
@Repository
@Transactional
public class PostInitDaoImpl implements PostInitDao {

	Logger logger = LoggerFactory.getLogger(PostInitDaoImpl.class);
	@PersistenceContext
	protected EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nhpost.post.dao.PostInitDao#create()
	 */
	@Transactional(value = "transactionManager", propagation = Propagation.REQUIRED)
	public void create() throws DataAccessException {
		Post post = new Post();
		post.setPostText(
				"Home sweet home you always going to miss it. And your office became your home one day. You always need to learn from office work. Work hard to get trained and then enter into the business world Home sweet home you always going to miss it. And your office became your home one day.");
		post.setPostTitle("Home");
		post.setIsActive("true");
		post.setCreatedDate(new Date());
		entityManager.persist(post);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nhpost.post.dao.PostInitDao#get()
	 */
	public void get() throws DataAccessException {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nhpost.post.dao.PostInitDao#delete()
	 */
	public void delete() throws DataAccessException {
		// TODO Auto-generated method stub

	}

	@Transactional(value = "transactionManager", propagation = Propagation.REQUIRED)
	public List<Post> getAll() throws DataAccessException {
		// Session session = entityManager.unwrap(Session.class);
		// Criteria criteria = session.createCriteria("from Post");
		// criteria.list();
		Query query = entityManager.createQuery("from Post");
		return query.getResultList();
	}

	@Transactional(value = "transactionManager", propagation = Propagation.REQUIRED)
	public void add(Post post) throws DataAccessException {
		post.setIsActive("true");
		post.setCreatedDate(new Date());
		try {
			entityManager.persist(post);
		} catch (DataIntegrityViolationException dive) {
			logger.error("error on saving the records", dive.getMessage());
		} catch (Exception e) {
			logger.error("error on saving records", e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			logger.error("error on saving records", e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
