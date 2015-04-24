
public class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee(String name, int idNumber, Object department, String position) {
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Name: " + name + ", ID: " + idNumber
				+ ", Department: " + department + ", Position: " + position;
	}
	
	
}
