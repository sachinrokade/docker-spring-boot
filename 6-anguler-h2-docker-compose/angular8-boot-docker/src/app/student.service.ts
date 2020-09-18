import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseUrl = 'http://localhost:8091/api/getall';

 
  constructor(private http: HttpClient) { }


  studentAdd(Student: Object): Observable<Object> {
    return this.http.post(`http://localhost:8091/api/studentadd`, Student);
  }

  getStudentList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }


  getStudent(rollNumber: number): Observable<any> {
    return this.http.get(`http://localhost:8091/api/edit/${rollNumber}`);
  }


  updateStudent(rollNumber: number, value: any): Observable<Object> {
    return this.http.put(`http://localhost:8091/api/edit/${rollNumber}`, value);
  }

  deleteStudent(rollNumber: number): Observable<any> {
    return this.http.delete(`http://localhost:8091/api/delete/${rollNumber}`, { responseType: 'text' });
  }

}
