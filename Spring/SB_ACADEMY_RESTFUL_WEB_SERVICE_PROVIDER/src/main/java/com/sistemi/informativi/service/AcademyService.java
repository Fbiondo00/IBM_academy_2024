package com.sistemi.informativi.service;

import java.util.List;
import java.util.Map;

import com.sistemi.informativi.entity.Academy;

public interface AcademyService {
	
	public List<Academy> getAcademies();
	
	public Academy getAcademyByCode(String code);
	
	public Academy saveOrUpdateAcademy(Academy academy);
	
	public Map<String,Boolean> removeAcademy(String code);

}
