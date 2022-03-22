public class Ceo extends Employee{
	private String ceo_Id;

	public Ceo(String name, String address, String salary, String unique_Id, String ceo_Id) {
		super(name, address, salary, unique_Id);
		this.ceo_Id = ceo_Id;
	}

	protected String getCeo_Id() {
		return ceo_Id;
	}

	protected void setCeo_Id(String ceo_Id) {
		this.ceo_Id = ceo_Id;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"\nCEO ID"+ceo_Id;
	}
	
	@Override
	void display()
	{
		super.display();
		System.out.println("Ceo ID:"+ceo_Id);
	}
}
