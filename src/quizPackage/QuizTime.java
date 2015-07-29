/*
Authors: Chuka Ebi, Joseph Giambarresi
Username: cebi, jlgiambarresi
*/
package quizPackage;

import java.util.Scanner;

/**A class that populates the quiz ArrayList and gives the quiz in response to the users input
 * 
 * 
 * @author cebi
 *
 */
public class QuizTime {
	
	public static void main(String[] args) {
		
		// Create questions for the quiz
		Question q0 = new Question("Can a class possess more than one Interface? (Y/N)", Difficulty.EASY, "Y");
		Question q1 = new Question("How old is Chuka?",Difficulty.EASY, "22");
		Question q2 = new Question("What is the square root of 169?", Difficulty.HARD, "13");
		Question q3 = new Question("Is Jetro his real name (yes/no)", Difficulty.HARD, "no");
		Question q4 = new Question("An interface can contain error definitions (T/F) ", Difficulty.EASY, "F");
		Question q5 = new Question("What keyword is used in Java to indicate that a field is accessible by name only to objects in the same class?", Difficulty.HARD, "public");
		
		Quiz exam = new Quiz();
		
		// add the questions to the exam ArrayList
		exam.addQuestion(q0);
		exam.addQuestion(q1);
		exam.addQuestion(q2);
		exam.addQuestion(q3);
		exam.addQuestion(q4);
		exam.addQuestion(q5);
		
		System.out.println("This program Administers a Quiz");
		System.out.println("Type A to see All questions in the quiz");
		System.out.println("Type E to see only the Easy questions");
		System.out.println("Type H to see only the Hard questions");
		Scanner keybd = new Scanner(System.in);
		System.out.print("Enter your choice (A, E, H) now: ");
		String choice = keybd.next(); // wait for user
	
		
		if(choice .equalsIgnoreCase("A")){ // Quiz contains all questions
			System.out.println();
			exam.giveQuiz();
		}
		else if(choice .equalsIgnoreCase("E")){ // Quiz contains easy questions
			System.out.println();
			exam.giveQuiz1(Difficulty.EASY);
		}
		else if(choice .equalsIgnoreCase("H")){ // Quiz contains Hard questions
			System.out.println();
			exam.giveQuiz1(Difficulty.HARD);
		}
		else{ // If another input is detected print error message
			System.out.println("Please enter either A, E, or H");
		}
	}

}
