import java.util.HashMap;

/**
 * Stores a players name and its saved games. A player can start, load, save and exit a game and also change the settings
 */
public class Player {
    String name;
    HashMap<String, Game> savedGames;

    public Player(String name){ //creates a new player
        this.name = name;
    }

    public Player(String name, HashMap<String, Game> savedGames){
        this.name = name;
        this.savedGames = savedGames;
    }


    public static void startNewGame(){
        System.out.println("How would you like to call your character?");
        Game game = new Game(new Character(UserInput.getUserInput()));
    }
    public static void loadOldGame(String gameNameToLoad){}//TODO implement savedGameLoading
    public static void saveCurrentGame(String gameNameToSave){}
    public static void settings(){}
    public static void leaveCurrentGame(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}
