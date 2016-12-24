package com.nhpost.post.dao.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import com.nhpost.post.common.exception.DataAccessException;
import com.nhpost.post.dao.PostInitDao;
import com.nhpost.post.domain.Post;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/nhpost-test-context-config.xml", "/nhpost-test-transaction-config.xml" })
public class PostInitDaoImplTest {

	@Autowired
	private PostInitDao postInitDao;
	
	@Test  
    public void testGetEmployeeById() throws DataAccessException {  
		postInitDao.create();  
    }
	
	@Test
	public void testGetAll() throws DataAccessException{
		List<Post> posts = postInitDao.getAll();
		if(CollectionUtils.isEmpty(posts)){
			System.out.println("empty posts");
		} else{
		System.out.println(posts.get(0).getPostText());}
		
	}

}
