package com.yash.formvalidation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.pojo.User;


@Controller
public class Usercontroller {
	
	
	@RequestMapping("/addUser.ds")
	
public ModelAndView showAddUserForm(){
		ModelAndView mav = new ModelAndView("addUser");
		return mav;
		
	}
	@RequestMapping(value="/processUserForm.ds" ,method=RequestMethod.POST)
	
	
	public ModelAndView processUserForm(@Valid @ModelAttribute ("user") User user, BindingResult result){
		
	    if(result.hasErrors()){
	    	ModelAndView mav = new ModelAndView("addUser");
	    	return mav;
	    }
		ModelAndView mav = new ModelAndView("welcome");
		return mav;
	}
	
	
	
}