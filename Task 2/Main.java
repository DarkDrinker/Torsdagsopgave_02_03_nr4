import java.util.Scanner;

class Main{

public static void main(String[] args) {

	System.out.println("Please type your name:");
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	System.out.println("Greetings " + input +"!");

	System.out.println("please type your age:");
	int age = scan.nextInt();
	System.out.println("you are " + age + "!");

	int pension = 67 - age;
	System.out.println("there is only " +pension+" years until retirement"); 





    }

}