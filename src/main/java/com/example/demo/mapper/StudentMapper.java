package com.example.demo.mapper;

import com.example.demo.dao.entity.StudentEntity;
import com.example.demo.model.request.StudentDto;

public enum StudentMapper {
    STUDENT_MAPPER;

    public StudentEntity mapToStudentEntity(StudentDto studentDto){
        return StudentEntity.builder().
                studentNumber(studentDto.getStudentNumber()).
                name(studentDto.getName()).
                surname(studentDto.getSurname()).
                major(studentDto.getMajor()).
                scholarShip(studentDto.getScholarship()).
                build();
    }

    public StudentDto mapToStudentDto(StudentEntity studentEntity){
        return StudentDto.builder().
                studentNumber(studentEntity.getStudentNumber()).
                name(studentEntity.getName()).
                surname(studentEntity.getSurname()).
                major(studentEntity.getMajor()).
                scholarship(studentEntity.getScholarShip()).
                build();
    }
}
