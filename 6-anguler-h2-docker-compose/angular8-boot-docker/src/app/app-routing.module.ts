
import { CreateStudentComponent } from './create-student/create-student.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { StudentListComponent } from './student-list/student-list.component';
import { StudentUpdateComponent } from './student-update/student-update.component';

const routes: Routes = [
  { path: '', redirectTo: 'students', pathMatch: 'full' },
  { path: 'students', component: StudentListComponent },
  { path: 'getall', component: StudentListComponent },
  { path: 'add', component: CreateStudentComponent },
  { path: 'update/:id', component: StudentUpdateComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

