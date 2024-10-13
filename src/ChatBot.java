import java.util.Scanner;
/**
 * ChatBot
 * --------
 * Description: This is a simple chatbot which sole purpose
 * was to practice good javadox comments and very simple
 * programming.
 *
 * PRE: You must type in the console "hello" or "how are you?"
 * or the bot will respond "I'm not sure how to respond to that.
 * Can you ask something else?"
 * POST: The bot will respond to you with the programmed
 * answers.
 *
 * @author Ava Calpe
 * @version 07/24/24
 */
public class ChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I am a simple chatbot. How can I assist you today?");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye! Have a nice day!");
                break;
            }

            String response = generateResponse(userInput);
            System.out.println(response);
        }

        scanner.close();
    }

    /*
     * generateResponse
     * --------
     * Description: This method takes in the users input and
     * returns the prompted responses.
     *
     * PRE: The parameters must be "hello" or "how are you?"
     * or the following will be returned: "I'm not sure how to
     * respond to that. Can you ask something else?"
     * POST: This method returns the bots responses.
     */
    private static String generateResponse(String input) {
        String response;

        if (input.toLowerCase().contains("hello")) {
            response = "Hello! How can I help you?";
        } else if (input.toLowerCase().contains("how are you")) {
            response = "I'm just a bot, but I'm doing great! How about you?";
        } else {
            response = "I'm not sure how to respond to that. Can you ask something else?";
        }

        return response;
    }
}
