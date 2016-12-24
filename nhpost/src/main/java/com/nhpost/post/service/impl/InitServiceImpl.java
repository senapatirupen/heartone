package com.nhpost.post.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhpost.post.common.exception.DataAccessException;
import com.nhpost.post.dao.PostInitDao;
import com.nhpost.post.dao.impl.PostInitDaoImpl;
import com.nhpost.post.domain.Post;
import com.nhpost.post.service.InitService;
import com.nhpost.post.service.util.ModelToDomainTransformer;
import com.nhpost.post.web.model.PostModel;

@Service
public class InitServiceImpl implements InitService {
	Logger logger = LoggerFactory.getLogger(InitServiceImpl.class);
	@Autowired
	public PostInitDao postInitDao;

	public List<Post> getAll() {
		try {
			return postInitDao.getAll();
		} catch (DataAccessException e) {
			logger.error("error on saving records", e.getMessage());
			e.printStackTrace();
		} catch (Throwable e) {
			logger.error("error on saving records", e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	public void add(PostModel postModel) {
		try {
			postInitDao.add(ModelToDomainTransformer.modelToDomain(postModel));
		} catch (DataAccessException e) {
			logger.error("error on saving records", e.getMessage());
			e.printStackTrace();
		} catch (Throwable e) {
			logger.error("error on saving records", e.getMessage());
			e.printStackTrace();
		}
	}

}
