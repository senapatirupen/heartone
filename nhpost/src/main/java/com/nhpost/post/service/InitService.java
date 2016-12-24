package com.nhpost.post.service;

import java.util.List;

import com.nhpost.post.domain.Post;
import com.nhpost.post.web.model.PostModel;

public interface InitService {
	public List<Post> getAll();
	public void add(PostModel postModel);
}
