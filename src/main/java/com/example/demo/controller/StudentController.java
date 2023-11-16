package com.example.demo.controller;


import com.example.demo.model.request.StudentDto;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @PostMapping()
    @ResponseStatus(CREATED)
    public void createStudent(@RequestBody @Valid StudentDto studentDto){
        studentService.createStudent(studentDto);
    }

    @GetMapping
    public List<StudentDto> getAllStudents(){
      return  studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDto getById(@PathVariable Long id){
     return   studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        studentService.deleteStudent(id);
    }



}
