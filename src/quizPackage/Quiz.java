/*
Authors: Chuka Ebi, Joseph Giambarresi
Username: cebi, jlgiambarresi
*/
package quizPackage;
import java.util.ArrayList;
import java.util.Scanner;


public class Quiz {
	/**
	 * An ArrayList containing a list of Questions
	 * @author cebi
	 * 
	 * 
	 */
	ArrayList<Question> quiz = new ArrayList<Question>();

	/** A method that adds a question to the quiz ArrayList
	 * @author cebi
	 * 
	 * @param Q
	 */
	public void addQuestion(Question Q){
		quiz.add(Q);
	}
	
	/** A void method that gives the quiz containing all the questions.
	 * Grades and gives the score of the quiz 
	 * 
	 * @author cebi
	 */
	public void giveQuiz(){
			float i = 0; // increment for final score
			for(Question que : quiz){ // index through the array
				Scanner ans = new Scanner(System.in);
				System.out.print(que.getQuestion());
				String answe = ans.next();
				if(answe .equalsIgnoreCase(que.getAnswer())){ // compare users answer to the answer in the ArrayList
					System.out.println("You are right!!! ");
					System.out.println();
					i++;
				}
				else{
					System.out.println("You are wrong");
					System.out.println();
				}
			}
			float Score =  (i/(quiz.size()))*100; // Calculate Score
			System.out.println();
			System.out.println("Your Score is: " + Score + "%"); //Give Score
		}
	
	/** Get the size of the array that contains only quiz with the eff difficulty
	 * @author cebi
	 * @param enum  
	 * @return int the number of questions that possess the Difficulty eff
	 */
	public int getSize(Difficulty eff){
		int count = 0;
		for(Question quet : quiz){
			if(eff == quet.getDifficulty()){
				count++;
			}
		}
		return count;
	}
	
	/** A void method that gives a quiz of a certain difficulty D, and evaluates the result
	 * @author cebi
	 * 
	 * @param D
	 */
	public void giveQuiz1(Difficulty D){
				float i = 0;
				for(Question ques: quiz){
					if(D == Difficulty.EASY){
						if(ques.getDifficulty() == Difficulty.EASY){ // give easy quiz
							Scanner ans = new Scanner(System.in);
							System.out.print(ques.getQuestion());
							String answe = ans.next();
							if(answe .equalsIgnoreCase(ques.getAnswer())){
							System.out.println("You are right!!!");
							System.out.println();
							i++;
							}
							else{
								System.out.println("You are wrong");
							}
						}
					}
					if(D == Difficulty.HARD){
						if(ques.getDifficulty() == Difficulty.HARD){ // give hard quiz
							Scanner ans = new Scanner(System.in);
							System.out.print(ques.getQuestion());
							String answe = ans.next();
							if(answe .equalsIgnoreCase(ques.getAnswer())){
							System.out.println("You are right!!!");
							System.out.println();
							i++;
							}
							else{
								System.out.println("You are wrong");
								System.out.println();
							}
						}
				}
		}
				float Score =  (i/(getSize(D)))*100;
				System.out.println();
				System.out.println("Your Score is:   " + Score + "%");
	}
}

