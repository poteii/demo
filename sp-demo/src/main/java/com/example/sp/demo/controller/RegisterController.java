package com.example.sp.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sp.demo.form.RegisterForm;
import com.example.sp.demo.service.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public void createUser(@RequestBody RegisterForm form) {
		registerService.createUser(form);
	}

	@RequestMapping(value = "/doSearch", method = RequestMethod.POST)
	public List<RegisterForm> doSearch(@RequestBody RegisterForm form) {
		return registerService.doSearch(form);
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public void updateUser(@RequestBody RegisterForm form) {
		registerService.updateUser(form);
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public ResponseEntity deleteUser(@RequestBody RegisterForm form) throws IOException {
		registerService.deleteUser(form);

		return new ResponseEntity("Remove Success!", HttpStatus.OK);
	}

}
