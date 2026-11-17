package spooqueen;

import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. What is the capital of India?",
                "2. Which keyword is used to create an object in Java?",
                "3. Which data structure follows FIFO?",
                "4. What is the extension of a Java bytecode file?",
                "5. Which company developed Java?"
        };

        String[][] options = {
                {"A. Mumbai", "B. Delhi", "C. Chennai", "D. Kolkata"},
                {"A. create", "B. object", "C. new", "D. class"},
                {"A. Stack", "B. Queue", "C. Linked List", "D. Tree"},
                {"A. .java", "B. .class", "C. .exe", "D. .txt"},
                {"A. Microsoft", "B. Google", "C. Apple", "D. Sun Microsystems"}
        };

        char[] answers = {'B', 'C', 'B', 'B', 'D'};

        int score = 0;

        System.out.println("================================");
        System.out.println("      JAVA QUIZ APPLICATION");
        System.out.println("================================");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct answer: " + answers[i]);
            }
        }

        System.out.println("\n================================");
        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + "/" + questions.length);

        double percentage = ((double) score / questions.length) * 100;
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
