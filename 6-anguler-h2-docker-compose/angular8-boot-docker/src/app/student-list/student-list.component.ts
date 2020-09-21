import { Student } from './../Student';
import { StudentService } from './../student.service';
import { Component, OnInit,ViewChild, HostListener, AfterViewInit, ChangeDetectorRef } from '@angular/core';
import { Observable } from "rxjs";
import { Router } from '@angular/router';
import { MdbTablePaginationComponent, MdbTableDirective } from 'ng-uikit-pro-standard';



@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit{

  students: Observable<any>;



  constructor(private studentService: StudentService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }
  reloadData() {
    this.students = this.studentService.getStudentList()
  }

  deleteStudent(rollNumber: number) {
    this.studentService.deleteStudent(rollNumber)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  employeeDetails(rollNumber: number){
    this.router.navigate(['details', rollNumber]);
  }

  updateStudent(rollNumber: number){
    this.router.navigate(['update', rollNumber]);
  }
}
