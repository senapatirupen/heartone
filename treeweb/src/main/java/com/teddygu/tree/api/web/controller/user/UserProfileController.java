/**
 *
 */
package com.teddygu.tree.api.web.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teddygu.tree.api.web.dto.SignUpDto;

/**
 * @author Rupen
 *
 */
@Controller
@RequestMapping(value="/user/")
public class UserProfileController {

	@Autowired
	private SignUpDto signUpDto;

	@RequestMapping(value="/signUp")
	public void create(Model model) {
		model.addAttribute("signUp", signUpDto);


	}

	@RequestMapping(value="/show")
	public void show() {

	}

	@RequestMapping(value="/update")
	public void update() {

	}

	@RequestMapping(value="/delete")
	public void delete() {

	}
}
