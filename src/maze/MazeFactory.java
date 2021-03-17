package maze;

import room.Room;

public class MazeFactory
{
	public MazeFactory()
	{
		
	}
	
	public Maze createMaze()
	{
		Maze maze = Maze.getInstance();
		
		//room 1
		Room r1 = new Room(1, "A very nice comfy room to start your adventure in.");
		
		//room2
		Room r2 = new Room(2, "This room may look spooky but, at least, it has style.");
		
		//room3
		Room r3 = new Room(3, "This room may look cozy, yet frightening.");
		
		//room4
		Room r4 = new Room(4, "A room made of glass. Hope I don't break it!");
		
		//room5
		Room r5 = new Room(5, "Room made of limestone. Just like regular stone but with small lemons in it.");
		
		//room6
		Room r6 = new Room(6, "A room made of glass. Hope I don't break it!");
		
		//room7
		Room r7 = new Room(7, "Room made out of old wood. How do you know wood is old? Dunno... don't expect a joke here.");
		
		//room8
		Room r8 = new Room(8, "Spruce wood is all around this room, looks nice.");
		
		//room9
		Room r9 = new Room(9, "Room made out of regular wood, also known as simply wood.");
		
		//room10
		Room r10 = new Room(10, "Room made out of stone cobbled up together. Hmmmm...");
		
		//room11
		Room r11 = new Room(11, "I've never seen a room made out of andesite before so therefore I conclude that andesite must be a government conspiracy!");
		
		//room12
		Room r12 = new Room(12, "Room made of graphite. Like granite, but with a 'ph'.");
		
		//room13
		Room r13 = new Room(13, "A room with invisible walls!? That's absurb, I want my money back!");
		
		//room14
		Room r14 = new Room(14, "The developer is too lazy and forgot to add a texture to this room...");
		
		
		//connectiong rooms
		
		r1.addAdjacentRoom(r2);
		r2.addAdjacentRoom(r1);
		
		r4.addAdjacentRoom(r2);
		r2.addAdjacentRoom(r4);
		
		r4.addAdjacentRoom(r12);
		r12.addAdjacentRoom(r4);
		
		r4.addAdjacentRoom(r13);
		r13.addAdjacentRoom(r4);
		
		r12.addAdjacentRoom(r13);
		r13.addAdjacentRoom(r12);
		
		r9.addAdjacentRoom(r13);
		r13.addAdjacentRoom(r9);
		
		r9.addAdjacentRoom(r11);
		r11.addAdjacentRoom(r9);
		
		r2.addAdjacentRoom(r7);
		r7.addAdjacentRoom(r2);
		
		r9.addAdjacentRoom(r7);
		r7.addAdjacentRoom(r9);
		
		r3.addAdjacentRoom(r7);
		r7.addAdjacentRoom(r3);
		
		r3.addAdjacentRoom(r8);
		r8.addAdjacentRoom(r3);
		
		r3.addAdjacentRoom(r1);
		r1.addAdjacentRoom(r3);
		
		r3.addAdjacentRoom(r5);
		r5.addAdjacentRoom(r3);
		
		r3.addAdjacentRoom(r6);
		r6.addAdjacentRoom(r3);
		
		r10.addAdjacentRoom(r6);
		r6.addAdjacentRoom(r10);
		
		r14.addAdjacentRoom(r6);
		r6.addAdjacentRoom(r14);
		
		r10.addAdjacentRoom(r9);
		r9.addAdjacentRoom(r10);
		
		r10.addAdjacentRoom(r14);
		r14.addAdjacentRoom(r10);
		
		// adding rooms
		maze.addRoom(r1);
		maze.addRoom(r2);
		maze.addRoom(r3);
		maze.addRoom(r4);
		maze.addRoom(r5);
		maze.addRoom(r6);
		maze.addRoom(r7);
		maze.addRoom(r8);
		maze.addRoom(r9);
		maze.addRoom(r10);
		maze.addRoom(r11);
		maze.addRoom(r12);
		maze.addRoom(r13);
		maze.addRoom(r14);
		
		return maze;
	}
}
