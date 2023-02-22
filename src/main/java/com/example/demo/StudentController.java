package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class StudentController {
@Value("${value.name}")
String value1;
//
//@value("${value.check}")
//String value2;
@GetMapping("/home")
	public String studisplay() {
		return "welocome "+value1;
	}
@GetMapping("/Student")
	public List<Student> getlist(){
		List<Student> stu_list=new ArrayList<>();
		stu_list.add(new Student(1,"Nandhini","B"));
		stu_list.add(new Student(2,"Atchaya","A"));
		stu_list.add(new Student(3,"Suriya","A"));
		return stu_list;
	}
}
