package com.example.sp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sp.demo.entity.RftDistrict;
import com.example.sp.demo.entity.RftMajor;
import com.example.sp.demo.entity.RftProvince;
import com.example.sp.demo.entity.RftSchool;
import com.example.sp.demo.entity.RftSubDistrict;
import com.example.sp.demo.service.UtilsService;

@RestController
@RequestMapping("/utils")
public class UtilsController {

	@Autowired
	private UtilsService utilsService;

	@RequestMapping(value = "/getProvinces")
	public List<RftProvince> getProvinces() {
		return utilsService.getProvinces();
	}

	@RequestMapping(value = "/getDistricts")
	public List<RftDistrict> getDistricts() {
		return utilsService.getDistricts();
	}

	@RequestMapping(value = "/getSubDistricts")
	public List<RftSubDistrict> getSubDistricts() {
		return utilsService.getSubDistricts();
	}

	@RequestMapping(value = "/getSchools")
	public List<RftSchool> getSchools() {
		return utilsService.getSchools();
	}

	@RequestMapping(value = "/getMajors")
	public List<RftMajor> getMajors() {
		return utilsService.getMajors();
	}

}
