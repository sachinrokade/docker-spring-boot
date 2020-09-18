import { StudentService } from './../student.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../Student';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent implements OnInit {

  submitted = false;
  student: Student = new Student();

  constructor(private studentService: StudentService,
    private router: Router) { }


  ngOnInit() {
  }

  newEmployee(): void {
    this.submitted = false;
    this.student = new Student();
  }

  save() {
    this.studentService
    .studentAdd(this.student).subscribe(data => {
      console.log(data)
      this.student = new Student();
      this.gotoList();
    }, 
    error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    this.router.navigate(['/getall']);
  }


}
