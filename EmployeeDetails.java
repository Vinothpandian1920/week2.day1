package week2.day1;

public class EmployeeDetails {
	public void prientEmployeeDetails(String empName , int empId) {
		System.out.println("EmployeeDetails :"+ empName);
		System.out.println("Employee Id :" + empId);
	}
	public void employeeAddress(String empAdress) {
		System.out.println("EmployeeAddress :"+ empAdress);
	}
	public void employeeSalary( Double empSalary) {
		System.out.println("Employee Salary :" + empSalary);
	}
	public void employeeMobileNumber(long mobNum) {
		System.out.println("EmployeeMobileNumber :" +mobNum );
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails employee=new EmployeeDetails();
		employee.prientEmployeeDetails("vinoth Pandian",12345);
		employee.employeeAddress("Chennai");
		employee.employeeSalary(25000.47);
		employee.employeeMobileNumber(9940810382l);
		
		

	}

}
