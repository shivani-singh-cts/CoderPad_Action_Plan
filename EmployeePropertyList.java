package com.coderpad.preparation;

class Employee {
	private long empID;
	private String empName;
	private String contactNo;
	Employee(long empID, String empName, String contactNo){
		this.empID = empID;
		this.empName = empName;
		this.contactNo = contactNo;
	}
	public long getEmpID() {
		return empID;
	}
	public String getEmpName() {
		return empName;
	}
	public String getContactNo() {
		return contactNo;
	}
	
}
public class EmployeePropertyList {

	static String fetchEmpProperties(Employee e) {
		String result = "";
		result += e.getEmpID();
		result += ", ";
		result += e.getEmpName();
		result += ", ";
		result += e.getContactNo();
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(865807, "Vani", "8447161857");
		
		System.out.println("Properties of employee are: "+fetchEmpProperties(emp));
		
	}

}
