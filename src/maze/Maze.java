package maze;

import java.util.ArrayList;
import room.Room;

public class Maze
{
	private static Maze instance = new Maze();
	
	private ArrayList<Room> rooms = new ArrayList<Room>();
	
	private Maze()
	{
		
	}
	
	public static Maze getInstance()
	{
	      return instance;
	}
	
	public void addRoom(Room room)
	{
		boolean found = false;
		for(Room r : rooms)
		{
			if(room.equals(r) || room.getNumber() == r.getNumber())
			{
				found = true;
			}
		}
		
		if(found)
		{
			System.out.println("ERROR: Cannot add the room, already have a room with number " + room.getNumber());
		}
		else
		{
			this.rooms.add(room);
		}
	}
	
	public Room roomNumber(int n)
	{
		for(Room room : rooms)
		{
			if(room.getNumber() == n)
			{
				return room;
			}
		}
		return null;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
}
