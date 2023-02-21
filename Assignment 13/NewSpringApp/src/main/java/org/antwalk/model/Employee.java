package org.antwalk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.antwalk.validation.Organization;


@Entity
@Table(name="EmployeeDatas")
public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id")
	private int empId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;

	@Column(name="phone")
	private String phone;
	
	@Column(name="organization")
	@Organization
	private String organization;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="age")
	private int age;
	

	public int getId() {
		return empId;
	}

	public void setId(int id) {
		this.empId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Employee(int id, String name, String email, String organization, int salary, int age, String phone) {
		super();
		this.empId = id;
		this.name = name;
		this.email = email;
		this.organization = organization;
		this.salary = salary;
		this.age = age;
		this.phone = phone;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
