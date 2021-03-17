package main;
import input_scanner.ConsoleInputOutput;
import maze.MapSite;
import maze.Maze;
import maze.MazeFactory;

public class Main 
{
	public static void main(String[] args) 
	{
		MazeFactory mazeFactory = new MazeFactory();
		Maze maze = mazeFactory.createMaze();
		
		ConsoleInputOutput console = new ConsoleInputOutput();
		
		MapSite game = new MapSite(maze, console);
		game.startGame();
	}
}
