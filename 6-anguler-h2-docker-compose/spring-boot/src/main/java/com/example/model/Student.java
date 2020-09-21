package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    Long rollNumber;
    String studentName;
    String Email;
    
//    int Standard;
//    String Divison;
//    String DOB;
//    String Gender;
//    String City;
//    String pinCode;
//    String Contact;
}
