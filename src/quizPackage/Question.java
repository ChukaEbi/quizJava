/*
Authors: Chuka Ebi, Joseph Giambarresi
Username: cebi, jlgiambarresi
*/
package quizPackage;

/**Contains the constructor and methods pertaining to the Question class
 * 
 * 
 * @author cebi
 *
 */
public class Question {
	private String question;
	private Difficulty diff;
	private String answer;

	/**
	 * The Question constructor 
	 * 
	 * @param question String
	 * @param diff enum
	 * @param answer String
	 */
	public Question(String question, Difficulty diff, String answer){ // constructor for the Question class 
		this.question = question;
		this.diff = diff;
		this.answer = answer;
		
	}
	
	/** allows the question to be read somewhere else
	 * @author cebi 
	 * 
	 * @return the question string within the Question class 
	 */
	public String getQuestion(){ // returns the question
		
		return this.question;
	}
	
	/** allows the answer to be read somewhere else
	 * @author cebi 
	 * 
	 * @return the answer string within the Question class
	 */
	public String getAnswer(){ // returns the answer
		return this.answer;
	}
	
	/** allows the difficulty to be used somewhere else
	 * @author cebi
	 * 
	 * @return the enum difficulty 
	 */
	public Difficulty getDifficulty(){ //returns the difficulty
		return this.diff;
	}
	
	/** Overrirde the toString()
	 * @author cebi
	 * 
	 * @return the contents of the question class in its' entirity
	 */
	public String toString(){ // to override the toString() method
		return "Question: " + this.question + "Difficulty: " + this.diff + "Answer: " + this.answer;
	}
	
}