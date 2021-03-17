package room;
import java.util.ArrayList;

public class Room
{
	int number;
	private ArrayList<Room> adjacentRooms;
	
	private String description;
	
	
	public Room(int number, String description)
	{
		this.number = number;
		this.adjacentRooms = new ArrayList<Room>();
		this.description = description;
	}
	
	public void addAdjacentRoom(Room room)
	{
		adjacentRooms.add(room);
	}
	
	public void roomGreeting()
	{
		System.out.println("Room " + number + "\n");
		System.out.println("Description: \n" + description);
		System.out.println();
		System.out.print("The neighbouring rooms are : ");
		for(Room room : adjacentRooms)
		{
			System.out.print(room.number + " ");
		}
		System.out.println();
	}
	
	public boolean hasNumberAdjacent(int n)
	{
		for(Room room : adjacentRooms)
		{
			if(room.getNumber() == n)
			{
				return true;
			}
		}
		return false;
	}
	
	// Getters and Setters below

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ArrayList<Room> getAdjacentRooms() {
		return adjacentRooms;
	}

	public void setAdjacentRooms(ArrayList<Room> adjacentRooms) {
		this.adjacentRooms = adjacentRooms;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
