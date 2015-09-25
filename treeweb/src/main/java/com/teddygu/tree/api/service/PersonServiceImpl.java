/**
 *
 */
package com.teddygu.tree.api.service;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.teddygu.tree.api.dao.PersonDao;
import com.teddygu.tree.api.dao.PersonDaoImpl;
import com.teddygu.tree.api.domain.Person;

/**
 * @author Rupen
 *
 */
@Service
public class PersonServiceImpl implements PersonService{

	Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

	@Autowired
	private PersonDao personDao;

//	public void setPersonDaoImpl(PersonDaoImpl personDao){
//		this.personDao = personDao;
//	}

	public Collection<Person> list() {
		Collection<Person> personList = personDao.list();
		if(!CollectionUtils.isEmpty(personList)){
			logger.info("we found the personList");
			return personList;
		}
		return null;
	}
}
