import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Intro
        System.out.println("Welcome to the Goal Review Bot.");
        System.out.println("You will be asked a series of questions about a goal that is important to you.");
        System.out.println("When you see a new question, type your answer and press Enter.");
        System.out.println("The program will record your response and, at the end, give you a custom roadmap for your goal.\n");

        System.out.println("Take some time now to think about a goal you would like to work on.");
        System.out.println("When you are ready to begin, press Enter...");
        scanner.nextLine();

        // Section headers
        String[] sections = {
            "Motivations",
            "Social Impact",
            "Strategies for Success",
            "Obstacles",
            "Monitoring Progress"
        };

        // Questions grouped by section
        String[][] questions = {
            { "Is pursuing this goal truly important? If so, why?" },
            {
                "How would disciplined success change the way that you see yourself?",
                "How would this affect the way that others perceive you?"
            },
            {
                "What concrete daily or weekly things might you do to further your goal?",
                "When will you work on your goal? How often? Where? Be specific."
            },
            {
                "How might you interfere with your own plans? How can you ensure this won't happen?",
                "Will the people you know help you, or interfere? How will you get their support?",
                "Think of realistic and worst-case scenarios."
            },
            {
                "What benchmarks will allow you to evaluate your performance?",
                "When would you like to achieve this goal? Be specific.",
                "What evidence will show you're making progress?",
                "How must your life change, measurably, for you to feel satisfied?",
                "How often will you track your progress?",
                "How will you balance effort: not too hard to burn out, not too easy to get bored?"
            }
        };

        // To store answers
        String[][] answers = new String[questions.length][];

        // Ask questions
        for (int i = 0; i < sections.length; i++) {
            System.out.println("\n=== " + sections[i] + " ===");
            answers[i] = new String[questions[i].length];

            for (int j = 0; j < questions[i].length; j++) {
                System.out.println("\n" + questions[i][j]);
                System.out.print("Your answer: ");
                answers[i][j] = scanner.nextLine();
            }
        }

        // Print final roadmap
        System.out.println("\n\n==== Your Personal Goal Roadmap ====");
        for (int i = 0; i < sections.length; i++) {
            System.out.println("\n--- " + sections[i] + " ---");
            for (int j = 0; j < questions[i].length; j++) {
                System.out.println("Q: " + questions[i][j]);
                System.out.println("A: " + answers[i][j] + "\n");
            }
        }

        System.out.println("Thank you for using Goal Review Bot. Keep working toward your vision!");
        scanner.close();
    }
}
