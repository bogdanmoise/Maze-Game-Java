package maze;
import characters.Player;
import input_scanner.ConsoleInputOutput;
import room.Room;

public class MapSite 
{
	private Maze maze;
	private ConsoleInputOutput console;
	
	private Player player;
	private Room currentRoom;
	
	public MapSite(Maze maze, ConsoleInputOutput console)
	{
		this.maze = maze;
		this.console = console;
		this.player = null;
		this.currentRoom = maze.getRooms().get(0);
	}
	
	private void changeRoom(int command)
	{
		currentRoom = maze.roomNumber(command);
	}
	
	public void startGame()
	{
		console.welcome();
		
		player = new Player(console.enterPlayerName());
		
		while(true)
		{
			console.pretyPrintRoomUp();
			player.enterRoom(currentRoom);
			console.pretyPrintRoomDown();
			
			console.printStats(player);
			
			changeRoom(console.getChoice(currentRoom));
			
			console.newLines();
		}
	}
}
