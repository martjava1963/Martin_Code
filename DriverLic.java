/*----------------------------------------------------------------------------------------------------------------------------------
                **Martin Batista - C, C++ and Java Programmer**

                                  Mar.29.2016
                                *DOCUMENTATION*
Java Programming Challenge Part 2: Driver's License Test Evaluation (Java arrays, loops) CONSOLE APP
We finish the project by creating necessary Java conditional statements to evaluate the input and compare Java arrays.
Driver’s License Office asked you to write a program that grades the written portion of the driver’s license exam.
The exam has 20 multi choice questions. Here are the correct answers:
1. B 2. D 3. A 4. A
5. C 6. A 7. B 8. A
9. C 10. D 11.B 12. C
13. D 14. A 15. D 16. C
17. C 18. B 19. D 20. A

Your app should store the correct answers in an array. It should ask the user to enter the student’s answers for each of the
20 questions and the answers should be stored in another array.
After the answers have been entered, the program should display a message indicating whether the student passed or failed the exam.
Student must answer 15 of the 20 questions to pass the exam. It should then display the total number of correctly answered questions,
the total number of incorrectly answered questions, and a list showing the question numbers of the incorrectly answered questions.
Input validation: Only accept the letters A, B, C or D as answers.

-----------------------------------------------------------------------------------------------------------------------------------*/
package driverlic;

/**
 * youtube.com video java tutorial (arrays, loops) length: 21:11
 * @adapted by Marty Batista
 */

import java.util.Scanner;

public class DriverLic {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int SIZE = 20;
        char [] correctAnswers = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A',};
        char singleAnswer = ' ';
        Scanner scan = new Scanner(System.in);
        char [] incorrectAnswers = new char [SIZE];
        int wrongAnswersCounter = 0;
        boolean wrongAnswer;

        for (int i = 0; i < SIZE; i++)
        {
            do
            {
               wrongAnswer = false;
               System.out.print("Please enter your answer to question #" + (i+1) + ": ");
               singleAnswer = scan.nextLine().toUpperCase().charAt(0);

               if (singleAnswer != 'A' && singleAnswer != 'B' && singleAnswer !='C' && singleAnswer !='D')
               {
                   System.out.print("Invalid Input Please re-enter your answer.\n");
                   wrongAnswer = true;
               }
            }while (wrongAnswer); // loop while wrongAnswer is true...

            if (correctAnswers[i] != singleAnswer)
            {
                incorrectAnswers[i] = singleAnswer;
                wrongAnswersCounter++;
            }
        }  // end of for loop...

        scan.close();
        // if (wrongAnswersCounter >= 5)
        // System.out.println();                    Tinary if statement below:
        System.out.println(wrongAnswersCounter >= 5 ? "Sorry, you failed." : "Correct! Congrats! you passed.");
        System.out.println("You have answered " + (SIZE - wrongAnswersCounter) + " Correctly and " +
              wrongAnswersCounter + " incorrectly. "  );

        for (int i = 0; i < SIZE; i++)
        {
            if (incorrectAnswers[i] != '\u0000')  // null character
            {
                System.out.println("You answered question #" + (i+1) + " incorrectly. Your anwer was " +
                        incorrectAnswers[i] + ". Correct answer is " + correctAnswers[i] + ".");

            }

        }
    }
}
