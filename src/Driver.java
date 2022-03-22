import java.util.ArrayList;
import java.util.Scanner;

//have an array for each class
//



public class Driver {
	public static void main(String[] args) {
		Scanner d_ip=new Scanner(System.in);
		
		ArrayList<SoftwareEngineers> all_SoftwareEngineers=new ArrayList<>();
		ArrayList<SoftwareEngineers> all_Managers=new ArrayList<>();
		ArrayList<SoftwareEngineers> all_SeniorManagers=new ArrayList<>();
		ArrayList<SoftwareEngineers> all_CEO=new ArrayList<>();
		
		System.out.println("Welcome to Management System!");
		System.out.println("Instructions: (Type the number to get more options");
		System.out.println("1.Software Engineer\n2.Manager\n3.Senior Manager\n4.CEO");
		int choice1=d_ip.nextInt();
		System.out.println("1.Create\n2.Edit\n3.Delete\n4.Display");
		int choice2=d_ip.nextInt();
		switch (choice1) {
		case 1:
			switch (choice2){
			case 1:
			case 2:
			case 3:
				default:
					break;
			}
			break;
		case 2:
			switch (choice2){
			case 1:
			case 2:
			case 3:
				default:
					break;
			}
			break;
		case 3:
			switch (choice2){
			case 1:
			case 2:
			case 3:
				default:
					break;
			}
			break;
		case 4:
			switch (choice2){
			case 1:
			case 2:
			case 3:
				default:
					break;
			}
			break;
		default:
			break;
		}
	}
}
