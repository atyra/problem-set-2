/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */
import java.util.Scanner;
public class ProblemSet2 {
	
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		Scanner sc = new Scanner(System.in);
		System.out.print("This is sayHello. Please input your first and last name: ");
		String name = sc.nextLine();
		System.out.println("Hello, " + name + "!");
		//sc.close();
	}
	
	public void gradeMe() {
		Scanner sc = new Scanner(System.in);
		System.out.print("This is gradeMe. Please input your homework grade: ");
		Double homework = sc.nextDouble();
		System.out.print("Please input your quiz grade: ");
		Double quiz = sc.nextDouble();
		System.out.print("Please input your test grade: ");
		Double test = sc.nextDouble();
		Double final_grade = (homework * .15) + (quiz * .3) + (test * .55);
		System.out.printf("%.2f", final_grade);
		System.out.println("%");
		//sc.close();
	}
	
	public void groupUs() {
		Scanner sc = new Scanner(System.in);
		System.out.print("This is groupUs. Please input the number of students: ");
		int students = sc.nextInt();
		System.out.print("This is groupUs. Please input the number of teachers: ");
		int teachers = sc.nextInt();
         	boolean full;
		int buses;
		if (((students + teachers) % 47) == 0) {
			full = true;
		}
		else {
			full = false;
		}
		
		if (full == true) {
			buses = (students + teachers) / 47;
			System.out.println(buses + " buses will be needed. They will all carry 47 people.");
		}
		else {
			buses = ((students + teachers) / 47) + 1;
			System.out.print(buses + " buses will be needed. The last bus will carry ");
			int leftOver = (students + teachers) % 47;
			//System.out.println(leftOver);
			System.out.println(leftOver + " people. All others will carry 47.");
			//sc.close();
		}

	}
	
	public void info() {
		Scanner sc = new Scanner(System.in);
		System.out.print("This is info. Please input your first name: ");
		String firstName = sc.nextLine();
		System.out.print("Please input your last name: ");
		String lastName = sc.nextLine();
		System.out.print("Please input your current grade: ");
		int grade = sc.nextInt();
		System.out.print("Please input your current age: ");
		int age = sc.nextInt();
		System.out.print("Please input your hometown: ");
		sc.nextLine();
		String hometown = sc.nextLine();
		System.out.println("NAME     : " + firstName + " " + lastName + "\nGRADE    : " + grade + "\nAGE      : " + age + "\nHOMETOWN : " + hometown);
		//sc.close();
	}
	
	public void initials() {
		Scanner sc = new Scanner(System.in);
		System.out.print("This is initials. Please enter your first name: ");
		String firstName = sc.nextLine();
		char firstInitial = firstName.charAt(0);
		System.out.print("Please enter your middle name: ");
		String middleName = sc.nextLine();
		char middleInitial = middleName.charAt(0);
		System.out.print("Please enter your last name: ");
		String lastName = sc.nextLine();
		char lastInitial = lastName.charAt(0);
		System.out.print("Your initials are ");
		System.out.print(firstInitial);
		System.out.print(middleInitial);
		System.out.print(lastInitial);
		sc.close();
	}
}