import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please enter your name?");
        //TODO the name could be anything (Moritz Rose), the .ser - file cant handle spaces though,
        //TODO implement, that only A-Z/a-z/0-9 is allowed

        //Players are saved in player.ser files, the following lines check, if there is an existing playerFile already
        String filePath = scanner.next()+".ser";
        File playerFile = new File(filePath);
        if (playerFile.exists()) {


            //if a player with that name already exists, the savedGames file is loaded
            //from the .ser - file
            //TODO implementing the loading function of existing gameFiles
            Player player = new Player(scanner.next()); //still using wrong constructor, cause other one isn't implemented yet
            System.out.println("Welcome back " + player.getName()+ ", what would you like to do?\n" +
                    "\t1. Start a new game\n" +
                    "\t2. Load an old game\n" +
                    "\t3. Settings \n" +
                    "\t4. Exit");

        } else {
            //if no player with this name exists, a new player is created
            Player player = new Player(scanner.nextLine());
            System.out.println("Welcome back " + player.getName()+ ", what would you like to do?\n" +
                    "\t1. Start a new game\n" +
                    "\t3. Settings \n" +
                    "\t4. Exit");
        }
    }
}
