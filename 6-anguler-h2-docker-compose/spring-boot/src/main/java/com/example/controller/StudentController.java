package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	public StudentServiceImpl studser;

	List<Student> stud = new ArrayList<>();

	@PostMapping("/studentadd")
	public Student studentAdd(@RequestBody Student StudentModel) {
		System.out.println(StudentModel);
		return studser.createStudent(StudentModel);

	}

	@GetMapping("/getall")
	public List<Student> getAllEmployees() {
		return studser.getAllStudents();
	}

	@GetMapping("/edit/{rollNumber}")
	public Student getAllEmployeesID(@PathVariable(value = "rollNumber") Long employeeId) {
		return studser.getStudent(employeeId);
	}

	@PutMapping("/edit/{rollNumber}")
	public ResponseEntity<Student> updateEmployee(@PathVariable(value = "rollNumber") Long employeeId,
			@Valid @RequestBody Student employeeDetails) {
	
		
		return	 ResponseEntity.ok(studser.editStudent(employeeId,employeeDetails));
	}

	@DeleteMapping("/delete/{rollNumber}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "rollNumber") Long employeeId) {

		studser.deleteStudent(employeeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}