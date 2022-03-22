//array of M
public class SeniorManagers extends Employee{
	private String seniorManagers_Id;

	public SeniorManagers(String name, String address, String salary, String unique_Id, String seniorManagers_Id) {
		super(name, address, salary, unique_Id);
		this.seniorManagers_Id = seniorManagers_Id;
	}

	protected String getSeniorManagers_Id() {
		return seniorManagers_Id;
	}

	protected void setSeniorManagers_Id(String seniorManagers_Id) {
		this.seniorManagers_Id = seniorManagers_Id;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"\nSenior Manager ID"+seniorManagers_Id;
	}
	
	@Override
	void display()
	{
		super.display();
		System.out.println("Senior Manager ID:"+seniorManagers_Id);
	}
}
