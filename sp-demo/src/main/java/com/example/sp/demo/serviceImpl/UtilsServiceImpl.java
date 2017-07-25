package com.example.sp.demo.serviceImpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sp.demo.entity.RftDistrict;
import com.example.sp.demo.entity.RftMajor;
import com.example.sp.demo.entity.RftProvince;
import com.example.sp.demo.entity.RftSchool;
import com.example.sp.demo.entity.RftSubDistrict;
import com.example.sp.demo.entity.RftTitleName;
import com.example.sp.demo.query.RftDistrictQuery;
import com.example.sp.demo.query.RftMajorQuery;
import com.example.sp.demo.query.RftProvinceQuery;
import com.example.sp.demo.query.RftSchoolQuery;
import com.example.sp.demo.query.RftSubDistrictQuery;
import com.example.sp.demo.query.RftTitleNameQuery;
import com.example.sp.demo.service.UtilsService;

@Service
@Repository
@Transactional
public class UtilsServiceImpl implements UtilsService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager em;

	@Override
	public List<RftProvince> getProvinces() {
		List<RftProvince> provinces = new ArrayList<RftProvince>();
		provinces = RftProvinceQuery.getProvinces(em);
		return provinces;
	}

	@Override
	public List<RftDistrict> getDistricts() {
		List<RftDistrict> districts = new ArrayList<RftDistrict>();
		districts = RftDistrictQuery.getDistricts(em);
		return districts;
	}

	@Override
	public List<RftSubDistrict> getSubDistricts() {
		List<RftSubDistrict> subDistricts = new ArrayList<RftSubDistrict>();
		subDistricts = RftSubDistrictQuery.getSubDistricts(em);
		return subDistricts;
	}

	@Override
	public List<RftSchool> getSchools() {
		List<RftSchool> schools = new ArrayList<RftSchool>();
		schools = RftSchoolQuery.getSchools(em);
		return schools;
	}

	@Override
	public List<RftMajor> getMajors() {
		List<RftMajor> majors = new ArrayList<RftMajor>();
		majors = RftMajorQuery.getMajors(em);
		return majors;
	}

	@Override
	public List<RftTitleName> getTitleNames() {
		List<RftTitleName> titleNames = new ArrayList<RftTitleName>();
		titleNames = RftTitleNameQuery.getTitleNames(em);
		return titleNames;
	}

}
