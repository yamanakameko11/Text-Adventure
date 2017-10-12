
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private Room room;
    public Player(Room room) 
    {
        this.room = room;
    }
    
    public String getRoomName() 
    {
        return room.getName();
    }
    
    public String getRoomDesc() 
    {
        return room.getDesc();
    }
    
    
}
