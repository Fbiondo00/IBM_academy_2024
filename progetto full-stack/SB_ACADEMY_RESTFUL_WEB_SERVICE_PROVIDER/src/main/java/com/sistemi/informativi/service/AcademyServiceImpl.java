package com.sistemi.informativi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sistemi.informativi.entity.Academy;
import com.sistemi.informativi.repository.AcademyRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
//@CacheConfig(cacheNames="academies")
public class AcademyServiceImpl implements AcademyService {

	private AcademyRepository academyRepository;

	public AcademyServiceImpl(AcademyRepository academyRepository) {

		this.academyRepository = academyRepository;
	}

	@Override
	public List<Academy> getAcademies() {

		List<Academy> academies = new ArrayList<>();

		try {

			academies = academyRepository.findAll();

		} catch (Exception ex) {

			ex.printStackTrace();

		}

		return academies;

	}

	//@Cacheable(value = "code", key = "#code")
	@Override
	public Academy getAcademyByCode(String code) {

		return academyRepository.findById(code).orElseThrow(() -> new EntityNotFoundException("not existing code"));

	}

	@Override
	public Academy saveOrUpdateAcademy(Academy academy) {

		try {

			academyRepository.save(academy);
		}

		catch (Exception ex) {

			ex.printStackTrace();
		}

		return academy;

	}

	@Override
	public Map<String, Boolean> removeAcademy(String code) {

		try {

			academyRepository.deleteById(code);

		}

		catch (Exception ex) {

			ex.printStackTrace();

		}

		Map<String, Boolean> map = new HashMap<>();
		map.put(code + " elimination", true);

		return map;

	}

}
