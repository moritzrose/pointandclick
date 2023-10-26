import java.util.List;

/**
 *  This class has the inventory and the position - this is the in-game character, not the player!
 */
public class Character {
    String name;
    private List<Item> inventory;
    private Position position;

    public Character(String name){
        this.name = name;
    }
}
