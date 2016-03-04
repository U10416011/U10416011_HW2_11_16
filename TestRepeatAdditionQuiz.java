//U10416011 謝秉瑾
import java.util.Scanner;

public class TestRepeatAdditionQuiz {
	public static void main(String[] args) {
		RepeatAdditionQuiz RAQ = new RepeatAdditionQuiz();
		//new RepeatAdditionQuiz
        Scanner input = new Scanner(System.in);
        // Create a Scanner
        
        System.out.print( "What is " + RAQ.number1 + " * " + RAQ.number2 + "? ");
        RAQ.answer = input.nextInt();
        while(!RAQ.checkAnswer()) {//while wrong answer
        	System.out.print("Wrong answer. Try again. What is " + RAQ.number1 + " * " + RAQ.number2 + "? ");
        	RAQ.Answers.add(RAQ.answer);
        	RAQ.answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
}
