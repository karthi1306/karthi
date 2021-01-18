package org.emp;

public class Employee {
 public void empname() {
	 System.out.println("empName venki");
	 
 }
 public void empId() {
	 System.out.println("empId 555");
	 
 }
 public void empDob() {
	 System.out.println("empDob 2-2-2020");
	 
 }
 public void empPhone() {
	 System.out.println("empPhone 956618");
	 
 }
 public void empEmail() {
	 System.out.println("empEmail v.venk@gmail.com");
	 
 }
 public void empAdress() {
	 System.out.println("chenai-32");
 }
public static void main(String[] args) {
	Employee e=new Employee();
			e.empAdress();
	        e.empDob();
	        e.empEmail();
	        e.empname();
	        e.empPhone();
	        e.empId();
}
}

