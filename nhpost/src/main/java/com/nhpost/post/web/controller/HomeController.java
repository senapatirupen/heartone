package com.nhpost.post.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nhpost.post.domain.Post;
import com.nhpost.post.service.InitService;
import com.nhpost.post.web.model.PostModel;
import com.nhpost.post.web.util.DomainToBoTransfor;


@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@Autowired
	public InitService initService;

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index_new");
		List<Post> posts = initService.getAll();
		List<PostModel> postModels = new DomainToBoTransfor().postToPostModel(posts);
		modelAndView.addObject("postList",postModels);
		modelAndView.addObject("NewPost", new PostModel());
//		modelAndView.addObject("welcome", "Hello Alok !");
//		modelAndView.addObject("postValue", posts.get(0));
		return modelAndView;
	}
	
	@RequestMapping(value="index_new", method=RequestMethod.POST)
	public ModelAndView index(@ModelAttribute("NewPost")PostModel postModel,BindingResult result, 
			ModelAndView model){
		PostModel newPostModel = new PostModel();
		newPostModel.setPostTitle(postModel.getPostTitle());
		newPostModel.setPostText(postModel.getPostText());
		initService.add(newPostModel);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index_new");
		List<Post> posts = initService.getAll();
		List<PostModel> postModels = new DomainToBoTransfor().postToPostModel(posts);
		modelAndView.addObject("postList",postModels);
		return modelAndView;
	}
	
}
