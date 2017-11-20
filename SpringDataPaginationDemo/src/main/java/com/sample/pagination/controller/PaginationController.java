package com.sample.pagination.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.pagination.dao.PeopleRepository;
import com.sample.pagination.model.Person;

@RestController
@RequestMapping("/api/")
public class PaginationController {

	@Autowired
	private PeopleRepository peopleRepository;

	@GetMapping("/pagination")
	public ResponseEntity<?> getPaginatedResults(@PathParam("limit") int limit, @PathParam("offset") int offset,
			@PathParam("firstname") String firstname) {
		List<Person> person = peopleRepository.findByFirstName(firstname,
				new PageRequest(offset, limit, Direction.DESC, "firstName"));
		return new ResponseEntity<>(person, HttpStatus.OK);
	}

}
