package com.nhpost.post.web.util;

import java.util.ArrayList;
import java.util.List;

import com.nhpost.post.domain.Post;
import com.nhpost.post.web.model.PostModel;

public class DomainToBoTransfor {
	public List<PostModel> postToPostModel(List<Post> posts) {
		List<PostModel> postModels = new ArrayList<PostModel>();
		for (Post post : posts) {
			PostModel postModel = new PostModel();
			postModel.setPostTitle(post.getPostTitle());
			postModel.setPostText(post.getPostText());
			postModels.add(postModel);
		}
		return postModels;
	}
}
