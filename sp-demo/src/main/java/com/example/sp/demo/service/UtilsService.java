package com.example.sp.demo.service;

import java.io.Serializable;
import java.util.List;

import com.example.sp.demo.entity.RftDistrict;
import com.example.sp.demo.entity.RftMajor;
import com.example.sp.demo.entity.RftProvince;
import com.example.sp.demo.entity.RftSchool;
import com.example.sp.demo.entity.RftSubDistrict;
import com.example.sp.demo.entity.RftTitleName;

public interface UtilsService extends Serializable {

	public List<RftProvince> getProvinces();

	public List<RftDistrict> getDistricts();

	public List<RftSubDistrict> getSubDistricts();

	public List<RftSchool> getSchools();

	public List<RftMajor> getMajors();

	public List<RftTitleName> getTitleNames();

}
