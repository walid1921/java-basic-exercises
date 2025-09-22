import java.util.Scanner;

//
// Create a Java chatbot program (using if/else statement) that:
// 1️⃣ Prompts the user for input
// 2️⃣ Recognizes the following inputs and responds accordingly:
//
// - Greetings (hello, hi → "Hello! How can I help you today?")
// - Well-being inquiries (how are you, how’s it going → "I'm just a bot, but I'm here to help you!")
// - Weather questions (what’s the weather like, weather → "I don’t have real-time weather data, but it's always sunny in the digital world!")
// - Farewells (bye, goodbye → "Goodbye! Have a great day!")
// 3️⃣ Responds with a default message if the input is unrecognized.

// 4️⃣ after finishing the first part, improve your chatbot
// Allow continuous interaction until the user types "exit" (using while()).

public class Chatbot {
    public static void main(String[] args) {
        String message;

        Scanner sc = new Scanner(System.in);


        System.out.println("Start chat: ");


        while (true) {

            message = sc.nextLine();

            if (message.equalsIgnoreCase("hello") || message.equalsIgnoreCase("hi")) {

                System.out.println("Chatbot: Hello! How can I help you today?");

            } else if (message.equalsIgnoreCase("how are you") || message.equalsIgnoreCase("how’s it going")) {

                System.out.println("Chatbot: I'm just a bot, but I'm here to help you!");

            } else if (message.equalsIgnoreCase("weather") || message.equalsIgnoreCase("what’s the weather like")) {

                System.out.println("Chatbot: I don’t have real-time weather data, but it's always sunny in the digital world!");

            } else if (message.equalsIgnoreCase("bye") || message.equalsIgnoreCase("goodbye") || message.equalsIgnoreCase("exit")) {

                System.out.println("Chatbot: Have a great day!");
                break;

            } else {

                System.out.println("I didn't understand your message, can you please rewrite it");

            }
        }

        sc.close();

    }
}
