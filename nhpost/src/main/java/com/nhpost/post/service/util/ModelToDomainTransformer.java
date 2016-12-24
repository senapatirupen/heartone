package com.nhpost.post.service.util;

import com.nhpost.post.domain.Post;
import com.nhpost.post.web.model.PostModel;

public class ModelToDomainTransformer {

	public static Post modelToDomain(PostModel postModel) {
		Post post = new Post();
		post.setPostTitle(postModel.getPostTitle());
		post.setPostText(postModel.getPostText());
		return post;
	}
}
