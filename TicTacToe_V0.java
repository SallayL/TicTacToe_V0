

import java.util.*;

public class TicTacToe_V0 {

	static int [] box = new int[9];
	   
	   static String P1marks = "x";
	   static String P2marks = "o";
	   
	   static String a ="  ";
	   static String b ="  ";
	   static String c ="  ";
	   static String d ="  ";
	   static String e ="  ";
	   static String f ="  ";
	   static String g ="  ";
	   static String h ="  ";
	   static String i ="  ";
	   
	   public static void main(String[] args)
	   {  
	      description();
	      play();
	   }
	   

	   public static void play()
	   {   
	      Scanner kb = new Scanner(System.in);
	        
	      int check = 0;
	      boolean playAgain = true;
	     
	      //String P1marks = "x";
	      //String P2marks = "o";
	   
	      do{
	      
	         displayBoard(); //show the layout of the board first
	             
	         updateBoard(kb, P1marks, P2marks); 
	        
	         //ask if they want to play one more round
	         System.out.print("one more game? (y/n): ");
	         String answer = kb.next();
	      
	         while (!(answer.equalsIgnoreCase("y")) && !(answer.equalsIgnoreCase("n")))
	         {
	            System.out.println("enter \"y\" or \"n\" only please :");
	            answer = kb.next();
	         }
	       
	         if(answer.equalsIgnoreCase("y"))
	         {
	            playAgain = true;
	            
	            a ="  ";
	            b ="  ";
	            c ="  ";
	            d ="  ";
	            e ="  ";
	            f ="  ";
	            g ="  ";
	            h ="  ";
	            i ="  ";
	            
	            for (int i= 0; i<9; i++){
	               box[i]=0;
	            }
	            
	         }else{
	         
	            playAgain = false;
	            System.out.println("goodbye!");
	         }
	         
	      }while(playAgain);	
	      
	   }

	   
	   //show the layout of the board at the begining
	   public static void displayBoard()
	   {
	      System.out.println("Here is the layout of the board.");
	      System.out.println("a | b | c ");
	      System.out.println("---------- ");
	      System.out.println("d | e | f ");
	      System.out.println("---------- ");
	      System.out.println("g | h | i ");
	   }


		// Method that updates the board
	   public static void updateBoard(Scanner kb, String P1marks, String P2marks)
	   {
	      String move = "";
	      int n = 0;
	      String [] letter = new String[9];
	      
	      for (int z = 0; z < 9;z++){
	         letter[z] = null;
	      }
	       
	      String cMarks = " "; //stands for "current mark"
	      boolean gameOver = false; 
	      
	      String P1 = getPlayer1(kb);//get the name of player 1
	      String P2 = getPlayer2(kb);//get the name of player 2
	      
	      /*String a ="  ";
	      String b ="  ";
	      String c ="  ";
	      String d ="  ";
	      String e ="  ";
	      String f ="  ";
	      String g ="  ";
	      String h ="  ";
	      String i ="  ";
	      */
	      
	      
	      System.out.println(P1 +" will be using x in the game. \n"+ P2 + " will be using 0 in the game.");// Pick x's or o's
	      
	      
	      
	      do{
	         if (n%2 == 0){
	            System.out.println(P1 + " will go now.");//player 1 first here
	            System.out.print( P1 +" please enter the letter of the box you want: ");
	            letter[n] = kb.next();
	            move = getValidMove(kb, letter, n);
	            cMarks = P1marks;
	         }else
	         {   
	            System.out.println(P2 + " will go now.");
	            System.out.print( P2 +" please enter the letter of the box you want: ");
	            letter[n] = kb.next();
	            move = getValidMove(kb, letter, n);
	            cMarks = P2marks;
	         }
	         
	            
	         if (move.equals("a"))
	         {  
	            a = cMarks+" ";
	            
	            
	         }else if (move.equals("b"))
	         {
	            b = cMarks+" ";
	            
	            
	         }else if (move.equals("c"))
	         {
	            c = cMarks+" ";
	            
	            
	         }else if (move.equals("d"))
	         {
	            d = cMarks+" ";
	            
	            
	         }else if (move.equals("e"))
	         {
	            e = cMarks+" ";
	            
	            
	         }else if (move.equals("f"))
	         {
	            f = cMarks+" ";
	             
	            
	         }else if (move.equals("g"))
	         {
	            g = cMarks+" ";
	            
	            
	         }else if (move.equals("h"))
	         {
	            h = cMarks+" ";
	            
	            
	         }else // (move.euqals("i"))
	         {
	            i = cMarks+" ";
	            
	            
	         }
	         
	         String board =  a+"|"+ b +"|"+ c+"\n"
	                        +"---------- \n"
	                        +d+"|"+ e +"|"+ f+"\n"
	                        +"---------- \n"
	                        +g+"|"+ h +"|"+ i+"\n";
	         
	         if (n >= 3){               
	         //horizontal
	            if (a.equals(b) && b.equals(c) && a.equals(c) && !a.equals("  ")){
	               System.out.println("game over");
	               gameOver= true;
	            }
	            
	            if (d.equals(e) && e.equals(f) && d.equals(f)&& !d.equals("  ")){
	               System.out.println("game over");
	               gameOver= true;
	            }
	            
	            if (g.equals(h) && h.equals(i) && g.equals(i) && !g.equals("  ")){
	               System.out.println("game over");
	               gameOver= true;
	            }
	            
	            //vertical
	            if (a.equals(d) && d.equals(g) && a.equals(g) && !a.equals("  ")){
	               System.out.println("game over");
	               gameOver= true;
	            }
	            
	            if (b.equals(e) && e.equals(h) && b.equals(h) && !b.equals("  ")){
	               System.out.println("game over");
	               gameOver= true;
	            }
	            
	            if (c.equals(f) && f.equals(i) && c.equals(i) && !c.equals("  ")){
	               System.out.println("game over");
	               gameOver= true;
	            }
	            
	            //diagonal
	            if (a.equals(e) && e.equals(i) && a.equals(i) && !a.equals("  ")){
	               System.out.println("game over");
	               gameOver= true;
	            }
	            
	            if (c.equals(e) && e.equals(g) && c.equals(g) && !c.equals("  ")){
	               System.out.println("game over");
	               gameOver= true;
	            } 
	            
	            //tie
	            if (n == 8){
	               System.out.println("It's a tie");
	               gameOver = true;
	            }
	         }
	         
	         System.out.println(board);
	         n++;
	         
	      }while(!gameOver);
	   
	   } 
	        
	      
	             
		// This method will validate a user's move
		// Returns a string with the coordinates of the move
	   public static String getValidMove(Scanner kb , String[] letter, int n) //still need to be fixed here !!!
	   {
	   
	      String result = "";
	         
	      if (letter[n].equals("a"))
	      {  
	         if (box[0]==1){
	            System.out.print("The letter you entered is already been filled, enter another one: ");
	            letter[n] = kb.next();
	            getValidMove(kb,letter,n);
	         
	         }else{
	           
	            box[0]= 1;
	         }
	            
	      }else if (letter[n].equals("b"))
	      {
	           
	         if (box[1]==1){
	            System.out.print("The letter you entered is already been filled, enter another one: ");
	            letter[n] = kb.next();
	            getValidMove(kb,letter,n);
	         
	         }else{
	           
	            box[1]= 1;
	         }
	            
	            
	      }else if (letter[n].equals("c"))
	      {
	            
	         if (box[2]==1){
	            System.out.print("The letter you entered is already been filled, enter another one: ");
	            letter[n] = kb.next();
	            getValidMove(kb,letter,n);
	         
	         }else{
	           
	            box[2]= 1;
	         }
	            
	            
	      }else if (letter[n].equals("d"))
	      {
	            
	         if (box[3]==1){
	            System.out.print("The letter you entered is already been filled, enter another one: ");
	            letter[n] = kb.next();
	            getValidMove(kb,letter,n);
	         
	         }else{
	           
	            box[3]= 1;
	         }
	            
	            
	      }else if (letter[n].equals("e"))
	      {
	            
	         if (box[4]==1){
	            System.out.print("The letter you entered is already been filled, enter another one: ");
	            letter[n] = kb.next();
	            getValidMove(kb,letter,n);
	         
	         }else{
	           
	            box[4]= 1;
	         }
	            
	            
	      }else if (letter[n].equals("f"))
	      {
	            
	         if (box[5]==1){
	            System.out.print("The letter you entered is already been filled, enter another one: ");
	            letter[n] = kb.next();
	            getValidMove(kb,letter,n);
	         
	         }else{
	           
	            box[5]= 1;
	         }
	               
	            
	      }else if (letter[n].equals("g"))
	      {
	           
	         if (box[6]==1){
	            System.out.print("The letter you entered is already been filled, enter another one: ");
	            letter[n] = kb.next();
	            getValidMove(kb,letter,n);
	         
	         }else{
	           
	            box[6]= 1;
	         }
	            
	            
	      }else if (letter[n].equals("h"))
	      {
	            
	         if (box[7]==1){
	            System.out.print("The letter you entered is already been filled, enter another one: ");
	            letter[n] = kb.next();
	            getValidMove(kb,letter,n);
	         
	         }else{
	           
	            box[7]= 1;
	         }
	            
	            
	      }else // (letter[n].euqals("i"))
	      {
	            
	         if (box[8]==1){
	            System.out.print("The letter you entered is already been filled, enter another one: ");
	            letter[n] = kb.next();
	            getValidMove(kb,letter,n);
	         
	         }else{
	           
	            box[8]= 1;
	         }
	                 
	      }
	         

	      result = letter[n];
	      return result;
	      
	   }
	   
	   
	   //get the player1
	   public static String getPlayer1 (Scanner kb)
	   {
	      System.out.print("player 1, please enter your first name: ");
	      String P1 = kb.next();
	      return P1;
	   }

	   
	    //get the player2
	   public static String getPlayer2 (Scanner kb)
	   {
	      System.out.print("player 2, please enter your first name: ");
	      String P2 = kb.next();
	      return P2;
	   }
	   
	   
	   //check to see if games over or not 
	   public static int gameOver() //suppose to be a boolean?
	   {
	      return 0;
	   }
	   
	   
	   //description here
	   public static void description()
	   {
	      System.out.println("This program plays the game of TicTacToe.");
	      System.out.println();
	   }

}
