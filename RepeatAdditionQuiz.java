//U10416011 謝秉瑾
import java.util.ArrayList;

public class RepeatAdditionQuiz {
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    int answer;
    ArrayList<Integer> Answers = new ArrayList<>();
    //arraylist to store answer
    public boolean checkAnswer() {//check the answer and whether repeat the answer
    	while (number1 * number2 != answer) {
            if (Answers.contains(answer)) {
                System.out.println("You already answered " + answer);
            }
            return false;
        }
		return true;
    }
}
