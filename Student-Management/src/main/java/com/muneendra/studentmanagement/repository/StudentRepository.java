package com.muneendra.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muneendra.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository <Student, Integer>{

}
