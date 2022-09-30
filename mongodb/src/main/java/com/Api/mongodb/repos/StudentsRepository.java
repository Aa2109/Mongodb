package com.Api.mongodb.repos;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.Api.mongodb.models.Student;

public interface StudentsRepository extends MongoRepository<Student, Integer> {

}
