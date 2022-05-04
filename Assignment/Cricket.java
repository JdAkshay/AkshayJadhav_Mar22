import java.util.*;
 class Cricket 
 {
	 public static void main(String args[])
	 {
		 player players[]= new player[5];
    players[0]= new batsmen("rohit",35);
    players[1]= new wicketeeper("Ishaan",25);
	players[2]= new bowler("Jofra",28);
	players[3]= new allrounder("Sams",30);
	players[4]= new batsmen("Suryakumar",30);
	
	for(player player : players)
	{
		player.print();
		System.out.println();
		System.out.println("--------------");
	}
	 }
 }