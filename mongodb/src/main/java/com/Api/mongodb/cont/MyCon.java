package com.Api.mongodb.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Api.mongodb.models.Student;
import com.Api.mongodb.repos.StudentsRepository;

@RestController
@RequestMapping("/persons")
public class MyCon {

	@Autowired
	private StudentsRepository sr;
	@PostMapping("/")
	public ResponseEntity<?> addStudents(@RequestBody Student st){
		Student save=this.sr.save(st);
		return ResponseEntity.ok(save);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getStudents(){
		return ResponseEntity.ok(this.sr.findAll());
	}
}
