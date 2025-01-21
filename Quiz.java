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

        public String getQuestionText() {
            return questionText;
        }

        public String[] getOptions() {
            return options;
        }

        public char getCorrectAnswer() {
            return correctAnswer;
        }
    }


    public static void main(String[] args) {


        //general catagory
        ArrayList<Question> GeneralquizQuestions = new ArrayList<>();
        GeneralquizQuestions.add(new Question(
            "What is the capital of France?",
            new String[] {"A. Berlin", "B. Madrid", "C. Paris", "D. Rome"},
            'C'
        ));
        GeneralquizQuestions.add(new Question(
            "Which planet is known as the Red Planet?",
            new String[] {"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"},
            'B'
        ));
        GeneralquizQuestions.add(new Question(
            "What is the largest ocean on Earth?",
            new String[] {"A. Atlantic Ocean", "B. Indian Ocean", "C. Pacific Ocean", "D. Arctic Ocean"},
            'C'
        ));
        GeneralquizQuestions.add(new Question(
            "Who wrote the play 'Romeo and Juliet'?",
            new String[] {"A. William Wordsworth", "B. Charles Dickens", "C. William Shakespeare", "D. Mark Twain"},
            'C'
        ));
        GeneralquizQuestions.add(new Question(
            "What is the smallest prime number?",
            new String[] {"A. 0", "B. 1", "C. 2", "D. 3"},
            'C'
        ));
        
        //technology catagory
        ArrayList<Question> TechnologyquizQuestions = new ArrayList<>();
        TechnologyquizQuestions.add(new Question(
            "What does HTML stand for?",
            new String[] {"A. HyperText Markup Language", "B. HyperText Markdown Language", "C. HighText Markup Language", "D. Hyper Transfer Markup Language"},
            'A'
        ));
        TechnologyquizQuestions.add(new Question(
            "Who is known as the father of computers?",
            new String[] {"A. Alan Turing", "B. Charles Babbage", "C. Ada Lovelace", "D. John von Neumann"},
            'B'
        ));
        TechnologyquizQuestions.add(new Question(
            "What does RAM stand for in computers?",
            new String[] {"A. Random Access Memory", "B. Read-Only Memory", "C. Read and Access Memory", "D. Randomized Array Memory"},
            'A'
        ));
        TechnologyquizQuestions.add(new Question(
            "Which company developed the Windows operating system?",
            new String[] {"A. Apple", "B. Microsoft", "C. IBM", "D. Google"},
            'B'
        ));
        TechnologyquizQuestions.add(new Question(
            "What is the name of the first electronic general-purpose computer?",
            new String[] {"A. ENIAC", "B. UNIVAC", "C. Colossus", "D. IBM 701"},
            'A'
        ));


        //science catagory
        ArrayList<Question> ScienceQuizQuestions = new ArrayList<>();
        ScienceQuizQuestions.add(new Question(
            "What planet is known as the 'Red Planet'?",
            new String[] {"A. Venus", "B. Mars", "C. Jupiter", "D. Mercury"},
            'B'
        ));
        ScienceQuizQuestions.add(new Question(
            "What is the chemical symbol for water?",
            new String[] {"A. O2", "B. H2O", "C. CO2", "D. H2"},
            'B'
        ));
        ScienceQuizQuestions.add(new Question(
            "Which gas do plants primarily use during photosynthesis?",
            new String[] {"A. Oxygen", "B. Nitrogen", "C. Carbon dioxide", "D. Hydrogen"},
            'C'
        ));
        ScienceQuizQuestions.add(new Question(
            "What is the closest star to Earth?",
            new String[] {"A. Proxima Centauri", "B. Sirius", "C. Alpha Centauri", "D. The Sun"},
            'D'
        ));
        ScienceQuizQuestions.add(new Question(
            "What force keeps objects grounded on Earth?",
            new String[] {"A. Friction", "B. Gravity", "C. Magnetism", "D. Inertia"},
            'B'
        ));

        // History category
        ArrayList<Question> HistoryQuizQuestions = new ArrayList<>();
        HistoryQuizQuestions.add(new Question(
            "Who was the first President of the United States?",
            new String[] {"A. George Washington", "B. Thomas Jefferson", "C. John Adams", "D. Abraham Lincoln"},
            'A'
        ));
        HistoryQuizQuestions.add(new Question(
            "In which year did World War II end?",
            new String[] {"A. 1942", "B. 1945", "C. 1948", "D. 1950"},
            'B'
        ));
        HistoryQuizQuestions.add(new Question(
            "What was the name of the ship that carried the Pilgrims to America in 1620?",
            new String[] {"A. Santa Maria", "B. HMS Beagle", "C. Mayflower", "D. Titanic"},
            'C'
        ));
        HistoryQuizQuestions.add(new Question(
            "Which ancient civilization built the pyramids?",
            new String[] {"A. Greeks", "B. Romans", "C. Egyptians", "D. Mesopotamians"},
            'C'
        ));
        HistoryQuizQuestions.add(new Question(
            "Who was known as the 'Maid of Orleans'?",
            new String[] {"A. Joan of Arc", "B. Marie Antoinette", "C. Catherine the Great", "D. Eleanor of Aquitaine"},
            'A'
        ));

        //game logic
        Scanner keyboard = new Scanner(System.in);
        int score = 0;


        System.out.println("welcome to the quiz!");
        System.out.print("Pick a catagory of questions: A. General, B. Technology, C. Science, D. History (A/B/C/D): ");
        String choice = keyboard.nextLine().toUpperCase();


        ArrayList<Question> selectedQuestions;
        switch (choice) {
            case "A":
                selectedQuestions = GeneralquizQuestions;
                break;
            case "B":
                selectedQuestions = TechnologyquizQuestions;
                break;
            case "C":
                selectedQuestions = ScienceQuizQuestions;
                break;
            case "D":
                selectedQuestions = HistoryQuizQuestions;
            default:
                System.out.println("invalid choice. defaulting to general questions");
                selectedQuestions = GeneralquizQuestions;
                break;
        }

        for(int i = 0; i < selectedQuestions.size(); i++){
            Question question = selectedQuestions.get(i);
            System.out.println("\n" + question.getQuestionText());

            for (int j = 0; j < question.getOptions().length; j++) {
                System.out.println(question.getOptions()[j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char answer = keyboard.nextLine().toUpperCase().charAt(0);  

            if (answer == question.getCorrectAnswer()) {
                System.out.println("Correct!");
                score++;  // Increment score for correct answer
            } else {
                System.out.println("Wrong! The correct answer is: " + question.getCorrectAnswer());
            }

        }
        System.out.println("\nYour final score is: " + score + "/" + selectedQuestions.size());
        System.out.println("Thanks for playing!");
        keyboard.close();

    }
}
