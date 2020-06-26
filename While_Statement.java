import java.util.Scanner;
public class While_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
System.out.println("Please type yes.");
String answer = input.nextLine();

while (!answer.equals("yes"))
{
	System.out.println("Please try again, please type yes");
	answer = input.nextLine();
}
System.out.println("Thank you for typing 'yes'");
	}

}
