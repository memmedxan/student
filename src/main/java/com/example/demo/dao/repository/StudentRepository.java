package com.example.demo.dao.repository;

import com.example.demo.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
}
