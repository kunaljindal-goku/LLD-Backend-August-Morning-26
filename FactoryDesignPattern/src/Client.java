import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String modelName = sc.next();
        ChatService chatService = new ChatService(modelName);

        chatService.complete("Hey Gpt");
    }
}
