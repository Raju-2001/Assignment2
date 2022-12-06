package week2.day1assignment;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int emId) {
		System.out.println("employeeName :"+empName);
		System.out.println("employeeID :"+emId);
	}
	public void printGetEmployeeAddress(String empAddress) {
		System.out.println("employee Adreess : " +empAddress);

	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("employee Salary : " +empSalary);
	}
	public void printEmployeeMobileNumber(Long mobNum) {
		System.out.println("employee Number : "+mobNum);
	}


	public static void main(String[] args) {
		EmployeeDetails employee=new EmployeeDetails();
		employee.printEmployeeName("Raju", 1);
        employee.printGetEmployeeAddress("Chennai");
        employee.printEmployeeSalary(30000.00);
        employee.printEmployeeMobileNumber(789456123L);

}
}
