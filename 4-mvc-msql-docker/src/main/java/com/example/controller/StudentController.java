package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Student;
import com.example.service.StudentServiceImpl;


@Controller
public class StudentController {

	@Autowired
	public StudentServiceImpl studser;
	
	List<Student> stud=new ArrayList<>();
	
    @GetMapping("/")
    public String homePage(Model model) 
    {
    	model.addAttribute("listStudent",studser.getAllStudents());
        return "studentadd";
    }
    
    @PostMapping("/studentInsert")
    public String studentInsert(@ModelAttribute("StudentModelAttribute") Student StudentModel,Model model) 
    {
    	studser.createStudent(StudentModel);
    	model.addAttribute("listStudent",studser.getAllStudents());
        return "studentadd";
    }
    
    @GetMapping("edit/{rollNumber}")
    public String studentUpdate(@PathVariable("rollNumber") long id, Model model) {
    	
    	Student student = studser.getStudent(id);
        model.addAttribute("student", student);
        return "updated-student";
    }
    @PostMapping("update/{rollNumber}")
    public String studentUpdate(@PathVariable("rollNumber") long id, Student student, BindingResult result, Model model) {

    	studser.createStudent(student);
    	model.addAttribute("listStudent",studser.getAllStudents());

        return "studentadd";
    }
    
    @GetMapping(value = "/delete/{rollNumber}")//, method = RequestMethod.DELETE)
    public String studentDelete(@PathVariable(value = "rollNumber") Long id,Model model)
    {
    	studser.deleteStudent(id);
        return "redirect:/getAll";
    }
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String listPersons(Model model) {
    	model.addAttribute("listStudent",studser.getAllStudents());
    	return "studentadd";
	}
}