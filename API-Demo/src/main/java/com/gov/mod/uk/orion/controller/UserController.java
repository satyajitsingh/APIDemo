package com.gov.mod.uk.orion.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.gov.mod.uk.orion.model.*;

@Controller
public class UserController {
	
	@RequestMapping(method = RequestMethod.GET, value="/user/allusers")

	  @ResponseBody
	  public List<User> getAllUsers() {
	  return UserRegistration.getInstance().getUserRecords();
	  }

	
	@RequestMapping(method = RequestMethod.POST, value="/register/user")

	  @ResponseBody
	  public UserRegistrationResponse registerStudent(@RequestBody User user) {
	  System.out.println("In registerStudent");
	  UserRegistrationResponse userregdres = new UserRegistrationResponse();           
	        UserRegistration.getInstance().add(user);
	        //We are setting the below value just to reply a message back to the caller
	        userregdres.setName(user.getName());
	        userregdres.setAge(user.getAge());
	        userregdres.setRegistrationNumber(user.getUserID());
	        userregdres.setRegistrationStatus("Successful");

	        return userregdres;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/update/user")


	@ResponseBody
	public String updateStudentRecord(@RequestBody User user) {
	System.out.println("In updateUserRecord");   
	    return UserRegistration.getInstance().upDateUser(user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/user/{userID}")

	@ResponseBody
	public String deleteStudentRecord(@PathVariable("userID") String userID) {
	System.out.println("In deleteStudentRecord");   
	    return UserRegistration.getInstance().deleteStudent(userID);
	}


}
