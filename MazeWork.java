/*
 * Programmers: Angel, Sophie
 * Due Date: Oct. 12, 2018
 * Description: Find a (quickest) path to go from the start to the end
 *               Case 1: file input
 *               Case 2: randomly generate a maze
 *              Output the maze and the path marked in +/s as the solution
 */
import java.util.*;
import java.io.*;

public class MazeWork{
  
  //declare and initialize global variables 
  static int[][]maze;
  static char start, end, block, open;
  static int sx, sy, ex, ey;
  static Scanner sc = new Scanner (System.in);
  static boolean possible=false; 
  
  public static void main (String []args) throws IOException{

    System.out.println("Do you want to [1] read the maze for file or [2] randomly generate a maze from computer:");
    int userChoice = getInput();
    
    //validation loop
    while(userChoice!=1 && userChoice!=2){
      System.out.println("Please enter only 1 and 2:");
      userChoice = getInput();
    }
    
    int row, column;
    sx =0; sy = 0;
    
    if (userChoice ==1){ //if user choose to read maze from a file 
      sc.nextLine();
      
      System.out.println("Enter the file name");
      String name= sc.nextLine();
      
      File file = new File(name+".txt");    
      Scanner input = new Scanner(file);
      
      //get the size of maze, representatives characters and the maze from file
      row = Integer.parseInt(input.nextLine());
      column = Integer.parseInt(input.nextLine());
      block = input.nextLine().charAt(0);
      open = input.nextLine().charAt(0);
      start = input.nextLine().charAt(0);
      end = input.nextLine().charAt(0);
      
      //declare an integer 2d array for the maze
      maze=new int[row][column]; 
      
      int j=0; //counter to keep track of rows of the maze
      
      while (input.hasNext()) { //check if file has a line with characters 
        
        String ln = input.nextLine(); //keep track the number of lines in the file 
        
        for(int i=0; i<ln.length(); ++i){ 
          char ch=ln.charAt(i); //read each character of maze from file and store it into a character array
         
          //integer values are assigned to specific character values, in order to be used to find and mark a path 
          if(ch==start){ 
            sx=j; sy=i;
            maze[j][i]=0;
          }
          
          else if(ch==block){
            maze[j][i]=-2;
          }
          
          else if(ch==open){
            maze[j][i]=0;
          }
          
          else if(ch==end){
            ex=j; ey=i;
            maze[j][i]=-1;
          }
          
        }
        
        ++j; //add 1 to the number of rows 
      }
      input.close(); //close the scanner that is used to read files 
      
      printMaze(row, column); //print the original maze 
      
    }
    
    else  //if user chooses to randomize a maze 
    {
      start='S'; end='X'; open='O'; block='B'; //assigning character values to character variables within the maze 
      
      System.out.println("Please enter the row of the maze:");
      row = getInput();
      System.out.println("Please enter the column of the maze:");
      column = getInput();
      
      maze=new int[row][column]; //initialize the size of integer 2d array according to user input
      
      randomMaze (row, column); //call the method that randomizes a maze and passes the size of the maze as parameters 
      
      System.out.println("R - Rows\n"+
                         "C - Columns\n"+
                         "B - Border\n"+
                         "O - Open path\n"+
                         "S - Starting position for the mouse\n"+
                         "X - Exit position from the maze\n "); //outputs the character representation for the user 
      
      printMaze(row, column); //print the original maze randomized by the computer 
    }
    sc.close(); //close scanner used to get user input
    
    searchPath(sx,sy,0); //call the method that search for all possible path within the maze, 
                                      //passes the coordinates of Starting point and steps used to find the path (now 0) as parameters
    
    maze[sx][sy]=start; //assign the position for the starting point 
   
    //if(possible)markPath(ex, ey, maze[ex][ey]); 
    
    if(possible){ //if a path is found
      markPath(ex, ey, maze[ex][ey]); //only marks the path if a solution is found
      System.out.println("There is a solution to this Maze!");
    }
    
    else { 
      System.out.println("This is an impossible maze");
    }

    printMaze(row, column); //print the maze with a path found or the original maze if no paths are available 
  }
  
  public static int randomMaze (int r, int c){ //method for randomizing a maze 
      /*integer values representing a specific character: 
      B->-2, O->0, S->0, X->-1, +->-3 transfer
      -2 -> B .... else -> O
      # of border block= 2(r-1)+2(c-1) 
      # of middle block = (r-2)(c-2)  n=(r-2)(c-2)+c+1  -> n%c= c, n/c=r */
    
    for (int i=0;i<r;i++){ 
      
      if(i!=0&&i!=r-1){ //if the row index is not 0 and the last row, which assigns values to the inside characters of the maze 
        
        maze[i][0]=-2; //assign -2 representing border for the first and last columns, excluding the first and last characters
        
        for (int j=1;j<c-1;j++){
          
         int n=(int)(Math.random()*4); //randomize 4 numbers to ensure the probablity of getting borders inside the maze is 1/4, open spaces is 3/4
         if(n==0){ 
           maze[i][j]=-2; //assign values for borders 
         }
       
         else{
           maze[i][j]=0; //assign values for open spaces 
         }
          
        }
        maze[i][c-1]=-2; //assign -2 representing border for the first and last 2 rows
      }
      
      else{  //assigning values for the perimeter of the maze 
        for(int j=0; j<c; j++){
          maze[i][j]=-2; 
        }
      }
    }
    
    //Setting the position of endpoint (X)
    int n=(int)(Math.random()*4); //randomize 4 numbers for the 2 rows and 2 columns surrounding the maze (perimeter).
    
    if(n==0){ //at the 1st row of the maze (horizontal)
      n=(int)(Math.random()*(c-2))+1; //randomize a column index of X, without the first and last (in corners)
      maze[0][n]=-1; //assign -1 to represent X on the maze 
      ex=0; ey=n; //assign the index of X into 2 variables 
    }
    
    else if (n==1){ //at the last row of the maze (horizontal)
      n=(int)(Math.random()*(c-2))+1; 
      maze[r-1][n]=-1;
      ex=r-1; ey=n;
    }
    
    else if(n==2){ //at the first column of the maze (vertical)
      n=(int)(Math.random()*(r-2))+1; //randomize a row index of X, without being in corners
      maze[n][0]=-1; 
      ex=n;ey=0; //assign the index of X into 2 variables 
    }
    else{ //at the first column of the maze (vertical)
      n=(int)(Math.random()*(r-2))+1;
      maze[n][c-1]=-1;
      ex=n; ey=c-1;
    }
    
    //setting the start
    n=((int)(Math.random()*(r-2)))+1; //randomize the row index,without being the first and last 
    sx=n;
    
    n=((int)(Math.random()*(c-2)))+1; //randomize the column index,without being the first and last 
    sy=n;
    
    maze[sx][sy]=0; //assign S on the maze to 0
    
    return n; 
  }
  
  public static void printMaze(int r,int c){ 
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        int n=maze[i][j]; //storing numbers on the maze path 
        
        if(n==-3){
          System.out.print("+"); //start marking + on the path from X
        }
        
        //print characters according to their assigned values
        else if(n==-2){
          System.out.print(block);
        }
        else if(n==-1){
          System.out.print(end);
        }
        else if(i==sx&&j==sy){
          System.out.print(start);
        }
        else {
          System.out.print(open);
        }
        
      }
      System.out.println(); //separate each row 
    }
    System.out.println("\n-----------------------------\n");
  }
  
  public static void searchPath(int x, int y, int m){ //search for possible paths 
    
    if(maze[x][y]<m&&maze[x][y]>0){ //if number on a space is less than total steps taken 
      return; //path is reached in a quicker way
    }
    
    if(maze[x][y]==-2){ 
      return;// when reaches a blocked path
    }
    
    if(m!=0 && x==sx &&y==sy) { 
      return;// return is 0 when reaches the start again
    }
    
    if(maze[x][y]==-1&&!possible){ // if a path is found, when X is met
      possible = true;
      maze[x][y]=m;
      return;
    }
    
    maze[x][y]=m;//mark the current position, covering the slower way
    
    ++m; //add 1 to every next step taken 
    
    int leny =(maze[0]).length; //variables to store the rows and columns of the maze
    int lenx = maze.length;
    
    if( x + 1 < lenx){ //if possible, a step can be taken to the next open block on the right
      searchPath(x+1, y, m);
    }
    
    if(y + 1 < leny) { //if possible, a step can be taken to the next open block upward
      searchPath(x, y+1, m);
    }
    
    if(x - 1 >= 0) {
      searchPath(x-1, y, m); //if possible, a step can be taken to the next open block on the left
    }
    
    if(y - 1 >= 0) {
      searchPath(x, y-1, m); //if possible, a step can be taken to the next open block downward
    }
  }
  
   public static void markPath(int x, int y, int m){ //mark a path on the maze 

     if(m==0){ //base case when a complete path is marked 
       return; 
     }
     
     maze[x][y]=-3; 
     
     --m; //subtract 1 to get the previous step 
     
     int leny =(maze[0]).length; //variables to store the rows and columns of the maze
     int lenx=maze.length; 

     if(x+1<lenx && maze[x+1][y]==m) { //if the next block on the right is marked with the previous number of steps and border is not reached 
       markPath(x+1, y, m);
     }
     else if(y+1<leny && maze[x][y+1]==m) { //if next block upward is the previous step taken
      markPath(x, y+1, m);
     }
     else if(x-1>=0 && maze[x-1][y]==m) { //if next block on the left is the previous step taken
       markPath(x-1, y, m);
     }
     else if(y-1>=0 && maze[x][y-1]==m) { //if next block downward is the previous step taken
       markPath(x, y-1, m);
     }
    
  }
   
   public static int getInput(){ //try and catch to get integer input 
     while (true){
       try{
         return sc.nextInt();
       }
       catch (InputMismatchException e){
         sc.next();
         System.out.println("Please enter an integer:");
       }
     }
   }
}