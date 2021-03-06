package com.example.sp.demo.service;

import java.io.Serializable;
import java.util.List;

import com.example.sp.demo.form.RegisterForm;

public interface RegisterService extends Serializable {

	public void createUser(RegisterForm registerForm);

	public List<RegisterForm> doSearch(RegisterForm registerForm);

	public void updateUser(RegisterForm registerForm);

	public void deleteUser(RegisterForm registerForm);

}
