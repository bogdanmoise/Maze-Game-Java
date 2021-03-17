package input_scanner;

import java.util.Scanner;

import characters.Player;
import room.Room;

public class ConsoleInputOutput
{
	private Scanner in;
	
	public ConsoleInputOutput()
	{
		this.in = new Scanner(System.in);
	}
	
	public void newLines()
	{
		System.out.println("\n\n");
	}
	
	public String enterPlayerName()
	{
		System.out.print(">Please enter the player's name : ");
		String name="";
		if(in.hasNextLine())
		{
			name = in.nextLine();
		}
		
		newLines();
        
        return name;
	}
	
	public void welcome()
	{
		System.out.println("Welcome to the Maze game!!! \n");
		System.out.println("You have been thrown into a vicious maze... O_o");
		System.out.println("* * * * * * * * * * * * * * * * * * * \n");
		System.out.println("* * * * * * * * * * * * * * * * * * * \n");
		System.out.println("* * * * * * * * * * * * * * * * * * * \n");
	}
	
	public void printStats(Player player)
	{
		System.out.println("Player stats : " + player.getName() + " | SCORE = " + player.getScore() + "\n");
	}
	
	public void pretyPrintRoomUp()
	{
		System.out.println("_______________________________________________________________________________");
		System.out.println();
	}
	
	private void printRoomChoices(Room room)
	{
		System.out.print("The rooms you can advance to are : ");
		for(Room r : room.getAdjacentRooms())
		{
			System.out.print(r.getNumber() + " ");
		}
		System.out.println();
	}
	
	public int getChoice(Room room)
	{
		boolean validChoice = false;
		int command = -1;
		
		while(!validChoice)
		{
			printRoomChoices(room);
			System.out.print(">Pick a room number to go to : ");
			String input = in.nextLine();
			
			try
			{
				command = Integer.parseInt(input);
			}
			catch(Exception exception)
			{
				System.out.println("\nPick a valid number!!!");
				continue;
			}
			
			validChoice = room.hasNumberAdjacent(command);
			if(!validChoice)
			{
				System.out.println("\nPick a valid number!!!");
			}
		}
		
		return command;
	}
	
	public void pretyPrintRoomDown()
	{
		System.out.println("_______________________________________________________________________________");
		System.out.println();
	}
}
