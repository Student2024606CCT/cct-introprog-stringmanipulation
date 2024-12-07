import java.util.Scanner;

public class InputUtilities {


    /**
     * Ask user to enter some  text - if they enter non-text (like numbers)
     * then ask them again
     * @param prompt - the question or prompt to ask the user
     * @return a String containing whatever text the user entered
     */
    public String askUserForText(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine() ;
        //userinput must be valid text
        while(!userInput.matches("[a-zA-Z .!@?\"]+")){
            System.out.println("You must enter text only. Enter again:");
            userInput = scanner.nextLine() ;
        }
        return (userInput);
    }

}
