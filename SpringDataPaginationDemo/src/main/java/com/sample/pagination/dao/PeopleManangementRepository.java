package com.sample.pagination.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sample.pagination.model.Person;

public interface PeopleManangementRepository extends PagingAndSortingRepository<Person, Integer> {
	List<Person> findByFirstName(String firstFame, Pageable pageable);
}
