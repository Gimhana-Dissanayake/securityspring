package com.securityspring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.securityspring.domain.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
