import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateStudentComponent } from './create-student/create-student.component';
import { StudentListComponent } from './student-list/student-list.component';
import { StudentUpdateComponent } from './student-update/student-update.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    CreateStudentComponent,
    StudentListComponent,
    StudentUpdateComponent
  ],
  imports: [
    
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
