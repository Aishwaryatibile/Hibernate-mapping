package com.hibernatetutorial.hibernate_tutorial.entity;

import javax.persistence.Entity;

import org.hibernate.annotations.Table;

@Entity
@Table("")
public class Student {

	private int id;
	private String name;
	private String about;
}
