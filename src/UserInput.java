import java.util.Scanner;

public class UserInput {

	String name;
	String address;
	String salary;
	String unique_Id;

	String Employee_ID;
	String Manager_ID;
	String SM_ID;
	String CEO_ID;

	int identifier;


	Scanner ip=new Scanner(System.in);

	public UserInput(int identifier)
	{
		this.identifier=identifier;
	}

	public void reading()
	{
		do{
			name=ip.nextLine();
			if(name.matches(".*[0-9].*"))
			{
				try{
					throw new StringContainsNumberException();
				}
				catch(StringContainsNumberException e)
				{
					e.stringContainsNumberException();
				}
				continue;
			}
			else if(name.isEmpty())
			{
				System.out.println("Name cannot be empty!!!");
				continue;
			}
			else break;
		}while(true);

		address=ip.nextLine();

		do{
			salary=ip.nextLine();
			if(salary.matches(".*[^0-9].*"))
			{
				System.out.print("Salary must have only numbers. Please try again!!!");
				continue;
			}
			else break;
		}while(true);

		unique_Id=ip.nextLine();

		if(identifier==1)
			CEO_ID=ip.nextLine();
		else if(identifier==2)
			SM_ID=ip.nextLine();
		else if(identifier==3)
			Manager_ID=ip.nextLine();
		else
			Employee_ID=ip.nextLine();
	}
}
