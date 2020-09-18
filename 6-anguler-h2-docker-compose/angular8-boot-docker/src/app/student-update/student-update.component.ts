import { Component, OnInit } from '@angular/core';
import { Student } from '../Student';
import { StudentService } from './../student.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-student-update',
  templateUrl: './student-update.component.html',
  styleUrls: ['./student-update.component.css']
})
export class StudentUpdateComponent implements OnInit {


  rollNumber: number;
  student: Student;


  constructor(private route: ActivatedRoute,private router: Router,
    private studentService: StudentService) { }

  ngOnInit(): void {
    this.student = new Student();
    
    this.rollNumber = this.route.snapshot.params['id'];

    this.studentService.getStudent(this.rollNumber)
      .subscribe(data => {
        console.log(data)
        this.student = data;
      }, error => console.log(error));
  }

  
  updateEmployee() {
    this.studentService.updateStudent(this.rollNumber, this.student)
      .subscribe(data => {
        console.log(data);
        this.student = new Student();
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updateEmployee();    
  }

  gotoList() {
    this.router.navigate(['/getall']);
  }

}
