import java.util.Scanner;
import java.util.ArrayList;

public class Quiz {
    
    static class Question{
        String questionText;
        String[] options;
        char correctAnswer;

        public Question(String questionText, String[] options, char correctAnswer){
            this.questionText = questionText;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }
    }

    public static void main(String[] args) {
        
        ArrayList<Question> quizQuestions = new ArrayList<>();
        quizQuestions.add(new Question(
            "What is the capital of France?",
            new String[] {"A. Berlin", "B. Madrid", "C. Paris", "D. Rome"},
            'C'
        ));
        quizQuestions.add(new Question(
            "Which planet is known as the Red Planet?",
            new String[] {"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"},
            'B'
        ));
        quizQuestions.add(new Question(
            "What is the largest ocean on Earth?",
            new String[] {"A. Atlantic Ocean", "B. Indian Ocean", "C. Pacific Ocean", "D. Arctic Ocean"},
            'C'
        ));
        quizQuestions.add(new Question(
            "Who wrote the play 'Romeo and Juliet'?",
            new String[] {"A. William Wordsworth", "B. Charles Dickens", "C. William Shakespeare", "D. Mark Twain"},
            'C'
        ));
        quizQuestions.add(new Question(
            "What is the smallest prime number?",
            new String[] {"A. 0", "B. 1", "C. 2", "D. 3"},
            'C'
        ));
        

        Scanner keyboard = new Scanner(System.in);
        System.out.println("welcome to the quiz!");
        System.out.println("answer the following questions: ");
    }
}
