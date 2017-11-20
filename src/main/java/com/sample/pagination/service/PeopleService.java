package com.sample.pagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.sample.pagination.dao.PeopleRepository;
import com.sample.pagination.model.Person;

@Service
public class PeopleService {

	@Autowired
	private PeopleRepository peopleRepository;

	public List<Person> findByFirstName(String firstName, PageRequest pageRequest) {
		return peopleRepository.findByFirstName(firstName, pageRequest);
	}
}
