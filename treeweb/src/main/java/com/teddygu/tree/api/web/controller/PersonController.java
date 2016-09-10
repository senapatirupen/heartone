/**
 *
 */
package com.teddygu.tree.api.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teddygu.tree.api.service.PersonService;
import com.teddygu.tree.api.service.PersonServiceImpl;

/**
 * @author Rupen
 *
 */
@Controller
@RequestMapping(value="/person")
public class PersonController {

	Logger logger = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	@Qualifier(value="personService")
	private PersonService personService;

	@RequestMapping(value="/list")
	public String viewList(){
		personService.list();
		return "list";
	}

}
