package week5.day1;import io.opentelemetry.sdk.metrics.internal.aggregator.EmptyMetricData;

public class EmployeeDetails {

	public void getEmployeeDetails(int empNumber) {
System.out.println(empNumber);
	}
	public void getEmployeeDetails(String empName) {
System.out.println(empName);
	}
	public void getEmployeeDetails(int empNumber,String empEmailId) {
System.out.println(empNumber+"  "+empEmailId);
	}
	public void getEmployeeDetails(String empName,int empNumber) {
System.out.println(empName+"  "+empNumber);
	}
	public static void main(String[] args) {
		EmployeeDetails employee=new EmployeeDetails();
		employee.getEmployeeDetails(1002);
		employee.getEmployeeDetails("Kani");
		employee.getEmployeeDetails(1002,"Kani@gmail.com");
		employee.getEmployeeDetails("kani",1002);
	}
}
