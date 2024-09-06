import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        User user1 = new PremiumUser();
        User user2 = new RegularUser();

        ABC_Server abcServer = new ABC_Server();
        abcServer.addUser("premium", user1);
        abcServer.addUser("regular", user2);

        Scanner scn = new Scanner(System.in);

        while(true){
            String exit;
            String previous_state;
            String current_state;

            System.out.println("If want to exit type yes otherwise no");
            exit = scn.nextLine();
            if(exit.equalsIgnoreCase("yes")){
                break;
            }
            System.out.println("Previous State of the server: ");
            previous_state = scn.nextLine();
            System.out.println("Current State of the server: ");
            current_state = scn.nextLine();

            abcServer.notifyAllUser(previous_state, current_state);
        }
    }
}