package com.capgemini.trg.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.trg.model.User;

import java.util.List;

@Controller
@RequestMapping(value="/userc")
public class UserController {
	@RequestMapping(value="/newuser",method=RequestMethod.GET)
	public ModelAndView showUserForm() {
		return new ModelAndView("add_user","user",new User());
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView processForm( @Valid @ModelAttribute("user") User user,
			BindingResult result){
		
		try {
			if(result.hasErrors()) {
				List<ObjectError> errorList=result.getAllErrors();
				System.out.println(errorList);
				return new ModelAndView("add_user","user",new User());
			}else {
				System.out.println(user.getUsername()+","+user.getBirthdate());
				//persist into database, call service class method
				return new ModelAndView("status","status","User added to database"); 
			}
		} catch (Exception e) {			
			return new ModelAndView("status","status",e.getMessage()); 
		}		
		
	}
}