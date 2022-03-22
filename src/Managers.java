//array of SE

public class Managers extends Employee{
	private String managers_Id;

	public Managers(String name, String address, String salary, String unique_Id, String managers_Id) {
		super(name, address, salary, unique_Id);
		this.managers_Id = managers_Id;
	}

	protected String getManagers_Id() {
		return managers_Id;
	}

	protected void setManagers_Id(String managers_Id) {
		this.managers_Id = managers_Id;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"\nManager ID"+managers_Id;
	}
	
	@Override
	void display()
	{
		super.display();
		System.out.println("Manager ID:"+managers_Id);
	}
}
