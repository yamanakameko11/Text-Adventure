
/**
 * Oooh, I'm doing stuff.
 * 
 * @author Kameko Yamanaka
 * @version 10.11.17
 */
import java.util.Scanner;
public class TextAdventure
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our text adventure.");
        
        Room basement = new Room();
        basement.setName("BASEMENT");
        basement.setDesc("It dark and damp. A slight hum buzzes through the atmosphere, and you feel a chill up your spine.");
        
        Room kitchen = new Room();
        kitchen.setName("KITCHEN");
        kitchen.setDesc("Slick tile is laid about and the scent of citrus can be found everywhere.");
        
        Player player = new Player(basement);
        System.out.println(player.getRoomName());
        System.out.println(player.getRoomDesc());
        
        System.out.println("WHAT WILL YOU DO NEXT?");
        String action = scanner.next();
        action.toLowerCase();
        if (action.equals("up") || action.equals("u"))
        {
            System.out.println("You go up.");
        }
        
        if (action.equals("down") || action.equals("d"))
        {
            System.out.println("You go down.");
        }
        
        if (action.equals("north") || action.equals("n"))
        {
            System.out.println("You go north.");
        }
        
        if (action.equals("south") || action.equals("s"))
        {
            System.out.println("You go south.");
        }
        
        if (action.equals("east") || action.equals("e"))
        {
            System.out.println("You go east.");
        }
        
        if (action.equals("west") || action.equals("w"))
        {
            System.out.println("You go west.");
        }
    }
}
