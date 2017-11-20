package com.sample.pagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.sample.pagination.dao.PeopleManangementRepository;
import com.sample.pagination.model.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManangementRepository peopleManangementRepository;

	public List<Person> findByFirstName(String firstName, PageRequest pageRequest) {
		return peopleManangementRepository.findByFirstName(firstName, pageRequest);
	}
}
