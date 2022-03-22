public class Employee {
	private String name;
	private String address;
	private String salary;
	private String unique_Id;
	public Employee(String name, String address, String salary, String unique_Id) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.unique_Id = unique_Id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	protected String getSalary() {
		return salary;
	}
	protected void setSalary(String salary) {
		this.salary = salary;
	}
	protected String getUnique_Id() {
		return unique_Id;
	}
	protected void setUnique_Id(String unique_Id) {
		this.unique_Id = unique_Id;
	}
	
	public String toString()
	{
		return "Name:"+name+"\nAddress:"+address+"\nSalary"+salary+"\nEmployee ID:"+unique_Id;
	}
	
	void display()
	{
		System.out.println("Name:"+name+"\nAddress:"+address+"\nSalary"+salary+"\nEmployee ID:"+unique_Id);
	}
}
