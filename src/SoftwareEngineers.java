//implement comparable
//toString

public class SoftwareEngineers extends Employee{
	private String softwareEngineer_Id;

	
	public SoftwareEngineers(String name, String address, String salary, String unique_Id, String softwareEngineer_Id) {
		super(name, address, salary, unique_Id);
		this.softwareEngineer_Id = softwareEngineer_Id;
	}

	protected String getSoftwareEngineer_Id() {
		return softwareEngineer_Id;
	}

	protected void setSoftwareEngineer_Id(String softwareEngineer_Id) {
		this.softwareEngineer_Id = softwareEngineer_Id;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"\nSoftware Engineer ID"+softwareEngineer_Id;
	}
	
	@Override
	void display()
	{
		super.display();
		System.out.println("Software Engineer ID:"+softwareEngineer_Id);
	}
	
}
