package NEW2Connect4;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class Connectt4 extends JFrame implements ActionListener, MouseListener, KeyListener{
  
   
   final static private int MAXDEPTH = 6;
   private int move;
   
  private int score1;
  private int score2;
  
  private boolean p1Red;
  
  private JLabel lb [][] = new JLabel[6][7]; // x=i%7, y=i/7, x+y*7=i
  
  private JLabel actionText;
  
  private Color redC;
  private Color yellowC;
  
  private JLabel p1Score;
  private JLabel p2Score;
  
  private JButton howToPlay;
  
  private JButton newGameBtnPVP;
  private JButton newGameBtnPVC;
  
  private JTextField p1;
  private JTextField p2;
  
  private ImageIcon red;  // transform it back
  private ImageIcon yellow;  // transform it back
  private ImageIcon hole;  // transform it back
  private ImageIcon redTrans;  // transform it back
  private ImageIcon yellowTrans;  // transform it back
  
  private boolean playing;
  private boolean turnRed;
  private boolean PVP; //true PVP, false PVC
  private boolean firstMove;
  
  private int[][]state=new int[6][7]; //hole -0, red - 1, yellow -2
  
  public Connect4(){
   super("Connect 4*");
   
   score1 = 0;
   score2 = 0;
   
   p1Red = true;
   
   JPanel all = new JPanel();
   
   JPanel board = new JPanel();
   
   JPanel gameBoard = new JPanel();
   
   JPanel title = new JPanel();
   JLabel titleText = new JLabel("CONNECT 4");
   
  JPanel action = new JPanel();
  actionText = new JLabel();
   redC = new Color(255,0,0);
   yellowC =new Color(200,200,0);
   
    JPanel scoreBoard = new JPanel();
    JPanel p1Board = new JPanel();
    JPanel p2Board = new JPanel();  
   
    JLabel scoreBoardTitle = new JLabel("Scoreboard");
   
     p1Score = new JLabel("Score: "+score1);
     p2Score = new JLabel("Score: "+score2);
   
    howToPlay = new JButton ("How to Play");
     
     newGameBtnPVP= new JButton ("New Match PvP");
     newGameBtnPVC= new JButton ("New Match PvC");
   
  p1 = new JTextField("Player A");
  p2 = new JTextField("Player B");
   
   ImageIcon red1 = new ImageIcon("red.jpg");
   Image image = (red1.getImage()).getScaledInstance(75, 75,  java.awt.Image.SCALE_SMOOTH); 
   red = new ImageIcon(image);  // transform it back
   
    ImageIcon yellow1 = new ImageIcon("yellow.jpg");
   image = (yellow1.getImage()).getScaledInstance(75, 75,  java.awt.Image.SCALE_SMOOTH); 
   yellow = new ImageIcon(image);  // transform it back
   
    ImageIcon hole1 = new ImageIcon("hole.jpg");
     image = (hole1.getImage()).getScaledInstance(75, 75,  java.awt.Image.SCALE_SMOOTH); 
   hole = new ImageIcon(image);  // transform it back
   
    ImageIcon redTrans1 = new ImageIcon("redTrans.jpg");
     image = (redTrans1.getImage()).getScaledInstance(75, 75,  java.awt.Image.SCALE_SMOOTH); 
   redTrans = new ImageIcon(image);  // transform it back
   
    ImageIcon yellowTrans1 = new ImageIcon("yellowTrans.jpg");
     image = (yellowTrans1.getImage()).getScaledInstance(75, 75,  java.awt.Image.SCALE_SMOOTH); 
   yellowTrans = new ImageIcon(image);  // transform it back
   
   playing = true;
   turnRed = true;
   PVP=true;
   
    //setTitle("Connect 4");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    setSize(75*7+250,75*6+275);
    setResizable(false);
    
    Font titleFont = new Font("Papyrus", Font.BOLD, 48);
    titleText.setFont(titleFont);
    
    title.add(titleText);
    
    Font actionFont = new Font("Papyrus", Font.PLAIN, 32);
    actionText.setFont(actionFont);
    
    action.add(actionText);
    
    Font scoreFont1 = new Font("Papyrus", Font.PLAIN, 24);
    scoreBoardTitle.setFont(scoreFont1);
    
    Font scoreFont2 = new Font("Papyrus", Font.PLAIN, 18);
    p1.setFont(scoreFont2);
    p2.setFont(scoreFont2);
    
    p1Score.setFont(scoreFont2);
    p2Score.setFont(scoreFont2);
    
    howToPlay.setFont(scoreFont2);
    
    newGameBtnPVP.setFont(scoreFont2);
    newGameBtnPVC.setFont(scoreFont2);
   // newGameBtn.setFont(scoreFont2);
    
    gameBoard.setLayout(new GridLayout(6,7));
    for(int i=0; i<6; i++){
     for(int j=0; j<7; j++){
      lb[i][j]=new JLabel(hole);
      //lb[i][j]=new JLabel(" "+i+" "+j+" ");
      lb[i][j].addMouseListener(this);
      gameBoard.add(lb[i][j]);
     }
      
    }
    
    board.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    for(int i=0; i<7; i++){
      c.weighty = 25;
      c.weightx = 1;//75*7;
      c.gridwidth = 1;
      c.gridx = i;
      c.gridy = 0;
      
    }
    
    c.weighty = 75*6;
    c.gridwidth = 7;
    c.gridx = 0;
    c.gridy = 1;
    
    board.add(gameBoard, c);
    
    p1Board.setLayout(new BoxLayout(p1Board, BoxLayout.LINE_AXIS));
    p2Board.setLayout(new BoxLayout(p2Board, BoxLayout.LINE_AXIS));
    
    p1.addKeyListener(this);
    p1Board.add(p1);
    p1Board.add(p1Score);
    
    p2.addKeyListener(this);
    p2Board.add(p2);
    p2Board.add(p2Score);
    
howToPlay.addActionListener(this);
    
    newGameBtnPVP.addActionListener(this);
    newGameBtnPVC.addActionListener(this);
    
    scoreBoard.setLayout(new BoxLayout(scoreBoard, BoxLayout.PAGE_AXIS));
    scoreBoard.add(scoreBoardTitle);
    scoreBoard.add(p1Board);
    scoreBoard.add(p2Board);
    scoreBoard.add(howToPlay);
    scoreBoard.add(newGameBtnPVP);
    scoreBoard.add(newGameBtnPVC);
    
    all.setLayout(new GridBagLayout());
    //c.fill = GridBagConstraints.HORIZONTAL;
    c.weighty = 150;
    c.weightx = 75*7+250;
    c.gridwidth = 2;
    c.gridx = 0;
    c.gridy = 0;
    
    all.add(title, c);
    
    c.weighty = 100;
    c.gridy = 1;
    
    all.add(action, c);
    
    c.weighty = 75*6+25;
    c.weightx = 250;
    c.gridwidth = 1;
    c.gridx = 0;
    c.gridy = 2;
    c.anchor = GridBagConstraints.PAGE_START;
    
    all.add(scoreBoard, c); 
    
    c.weighty = 75*6+25;
    c.weightx = 75*7;
    c.gridx = 1;
    c.gridy = 2;
    
    all.add(board, c);
    
    add(all);
    
    setUp();
    setVisible(true);
    
    for (int i = 0; i < 6 ; ++i) {
     for (int j = 0; j < 7 ; ++j) {
           state[i][j] = 0;
         }
    }
    
  }
  private boolean win(){
     // horizonal
     for(int i=0; i<6; i++){
       for(int j=0; j<4; j++){
        if(state[i][j]==state[i][j+1]&&state[i][j]==state[i][j+2]&&state[i][j]==state[i][j+3]&&state[i][j]!=0){
           //game over
        // System.out.println("H "+i+" "+j);
           return true;
         }
       }
     }
     //vertical
     for(int i=0; i<3; i++){
       for(int j=0; j<7; j++){
         if(state[i][j]==state[i+1][j]&&state[i][j]==state[2+i][j]&&state[i][j]==state[i+3][j]&&state[i][j]!=0){
           //game over
          //System.out.println("V "+i+" "+j);
          return true;
         }
       }
     }
     //diagonally
     for(int i=5; i>2; i--){
       for(int j=6; j>2; j--){
         if(state[i][j]==state[i-1][j-1]&&state[i][j]==state[i-2][j-2]&&state[i][j]==state[i-3][j-3]&&state[i][j]!=0){
           //game over
          //System.out.println("DL "+i+" "+j);
          return true;
         }
       }
     }
     for(int i=5; i>2; i--){
       for(int j=0; j<4; j++){
         if(state[i][j]==state[i-1][j+1]&&state[i][j]==state[i-2][j+2]&&state[i][j]==state[i-3][j+3]&&state[i][j]!=0){
           //game over
          //System.out.println("DR "+i+" "+j);
          return true;
         }
       }
     }
   return false;
   }
  private void checkForWin(){
    
   boolean win=win();
    //finally
    if(win)endGame(win);
    else{
      for(int i=0; i<7; i++){
        if(state [0][i]==0)break;
        if(i==6){
          endGame(win);
        }
      }
    }
  }
  
  private void endGame(boolean win){
   
   for(int i=0; i<6; i++){
    for(int j=0; j<7; j++){
     System.out.print(state[i][j]+" ");
    }
     System.out.println();
   }
   
   
    turnRed=!turnRed;
    playing=false;
    
    actionText.setForeground(Color.BLACK);
    
    if(win){
      if((turnRed&&p1Red)||(!turnRed&&!p1Red)){
        score1++;
        actionText.setText(p1.getText()+" WINS!");
      }
      else{
        score2++;
        actionText.setText(p2.getText()+" WINS!");
      }

    }
    else {
      actionText.setText("TIE!");
      
    }
    
    p1Score.setText("Score: "+score1);
    p2Score.setText("Score: "+score2);
  }
  
  private void action(){
    if(p1Red){
      if(turnRed){
        actionText.setForeground(redC);
        actionText.setText(p1.getText()+"'s Turn");
      }
      else{
        actionText.setForeground(yellowC);
        actionText.setText(p2.getText()+"'s Turn");
      }
    }
    else{
      if(turnRed){
        actionText.setForeground(redC);
        actionText.setText(p2.getText()+"'s Turn");
      }
      else{
        actionText.setForeground(yellowC);
        actionText.setText(p1.getText()+"'s Turn");
      }
    }
  }
  
  private void newGame(){
    //resetting
    playing=true;
    
    for (int i = 0; i < 6 ; ++i) {
     for (int j = 0; j < 7 ; ++j) {
      state[i][j] = 0;
      lb[i][j].setIcon(hole);
     }
    }
    turnRed = true;
    //changing
    p1Red= !p1Red;
    setUp();
    
  }
  
  private void setUp(){
    if(p1Red){
      p1.setForeground(redC);
      p2.setForeground(yellowC);

      actionText.setForeground(redC);
      actionText.setText(p1.getText() + "'s Turn");
    }
    else{
      p1.setForeground(yellowC);
      p2.setForeground(redC);
      
      actionText.setForeground(redC);
      actionText.setText(p2.getText() + "'s Turn");
      if(!PVP && playing)computerMove();
    }
  }
  
  private void change(int i,int j){
   if(turnRed){
          state[i][j]=1; //change TODO
          lb[i][j].setIcon(red);
          turnRed=false;
          return;
        }
        else{
          state[i][j]=2; //change TODO
          lb[i][j].setIcon(yellow);       
          turnRed=true;
          return;
        }
  }
  
  ////////////////////////////////////AI///////////////////////////////////////
  public static int calculateScore(int moveScore){   
     if(moveScore==0)return 0;
     else if(moveScore==1)return 1;
     else if(moveScore==2)return 10;
     else if(moveScore==3)return 100;
     else if(moveScore==-1)return -1;
     else if(moveScore==-2)return -10;
     else if(moveScore==-3)return -100;
     else return 1000;
   }
   
   public static int evaluateBoard(int[][]board){
     
     int moveScore = 0;
     int score=0;
     
     for (int i = 5; i>= 0 ; i--){
       for(int j =0 ; j< 7; j++){
         //horizontal area
         if(j<=3){
           
           
           for(int c= 0; c<4; c++){
            
             if(board[i][j+c] == 1 && moveScore ==0){
               moveScore ++;
             }
             else if(board[i][j+c] == 2 && moveScore ==0 ){
               moveScore --;
             }
             
             else if(board[i][j+c] == 1 && moveScore > 0){
               moveScore++;
             }
             else if (board[i][j+c] == 2 && moveScore < 0){
               moveScore--;
             }
             else if ((board[i][j+c] == 1 && moveScore < 0)||(board[i][j+c] == 2 && moveScore > 0)){
               moveScore = 0;
               break;
             }     
           }
           if(moveScore!=0){
            
             score += calculateScore(moveScore);
             moveScore = 0;
             
           }
         }
         
         if(i>=3){
           
           //vertical
           
           for(int c= 0; c<4; c++){

             if(board[i-c][j]  == 1 &&  moveScore == 0){
               moveScore ++;
             }
             
             else if(board[i-c][j] == 2 &&  moveScore == 0){
               moveScore --;
             }
             else if(board[i-c][j] == 1 && moveScore > 0){
               moveScore++;
             }
             else if (board[i-c][j] == 2 && moveScore < 0){
               moveScore--;
             }
             else if ((board[i-c][j] == 1 && moveScore < 0)||(board[i-c][j]== 2 && moveScore > 0)){
               moveScore = 0;
               break;
             }     
           }
           
           if(moveScore!=0){
             score += calculateScore(moveScore);
             moveScore = 0;
           }
           
           //up-right dig
           if(j<=3){ 
             
             for(int c= 0; c<4; c++){
               if(board[i-c][j+c]  == 1 && moveScore == 0){
                 moveScore ++;
               }
               
               else if(board[i-c][j+c] == 2 && moveScore == 0){
                 moveScore --;
               }
               else if(board[i-c][j+c] == 1 && moveScore > 0){
                 moveScore++;
               }
               else if (board[i-c][j+c] == 2 && moveScore < 0){
                 moveScore--;
               }
               else if ((board[i-c][j+c] == 1 && moveScore < 0)||(board[i-c][j+c]== 2 && moveScore > 0)){
                 moveScore = 0;
                 break;
               }     
             }
             if(moveScore!=0){
               score += calculateScore(moveScore);
               moveScore = 0;
               
             }
           }
           
           //up-left dig
           if(j>=3){            
             for(int c= 0; c<4; c++){
               
               if(board[i-c][j-c] == 1 && moveScore == 0){
                 moveScore ++;
               }
               else if(board[i-c][j-c] == 2 && moveScore == 0){
                 moveScore --;
               }
               else  if(board[i-c][j-c] == 1 && moveScore > 0){
                 moveScore++;
               }
               else if (board[i-c][j-c] == 2 && moveScore < 0){
                 moveScore--;
               }
               else if ((board[i-c][j-c] == 1 && moveScore < 0)||(board[i-c][j-c]== 2 && moveScore > 0)){
                 moveScore = 0;
                 break;
               }     
             }
             
             if(moveScore!=0){
              
               score += calculateScore(moveScore);
               moveScore = 0;
             }
           }
         }
         
         
       }
     }
     
     return score;
   } 
   
 

  private int minimax(int depth, boolean red){
   
   if(win() && red) return Integer.MIN_VALUE/2;
   else if(win()) return Integer.MAX_VALUE/2;
   
   for(int j=0; j<7; j++){
    if(state[0][j]<=0)break;
    if(j==6)return 0;
   }
   
   if(depth == MAXDEPTH) return evaluateBoard(state);
   
   int value = Integer.MAX_VALUE;
   if(red)value = Integer.MIN_VALUE;
   
  // System.out.println(value);
   
   for(int j=0; j<7; j++){
    for(int i=5; i>=0; i--){
     if(state[i][j]<=0){
      int temp = state[i][j];
      
      if(red){
       state[i][j]=1;
       int currentScore = minimax((depth +1), !red);
       //if(depth ==0)System.out.println(currentScore + " "+ value +" "+move);
       if(currentScore > value ){//|| (currentScore == value && (Math.abs(3 - move) > Math.abs(3-j)))) {
        if(depth ==0)move = j;
        value = currentScore;
       }
      }
      else {
       state[i][j]=2;
       int currentScore = minimax((depth +1), !red);
       //if(depth ==0)System.out.println(currentScore + " "+ value +" "+move);
       if(currentScore < value){// || (currentScore == value && (Math.abs(3 - move) > Math.abs(3-j)))) {
        if(depth ==0)move = j;
        value = currentScore;
       }
      }
      
      state[i][j]=temp;
      break;
     }
    }
   }
   //System.out.println(value);
   return value;
  }
  
private void computerMove(){
 move=-1;
 minimax(0, turnRed);
 //System.out.println(move);
 
 for(int i=5; i>=0; i--){
  if(state[i][move]<=0){
   change(i, move);
   checkForWin();
   if(playing){
            action();
           }
   break;
  }
 }
}
  
  
  public void actionPerformed(ActionEvent e) {
   if(howToPlay == e.getSource()){
      JFrame instructions = new JFrame("How to Play");
      instructions.setSize(600,450);
      
      ImageIcon temp = new ImageIcon("instructions.jpg");
      Image temp1 = (temp.getImage()).getScaledInstance(600, 450,  java.awt.Image.SCALE_SMOOTH); 
      JLabel tempIn = new JLabel();
     tempIn.setIcon(new ImageIcon(temp1));
      
      instructions.add(tempIn);
      instructions.setResizable(false);
      instructions.setVisible(true);
     }
    if(newGameBtnPVC == e.getSource()){
     PVP=false;
     firstMove=true;
      newGame();
    }
    if(newGameBtnPVP == e.getSource()){
     PVP=true;
        newGame();
      }
  }
  
  public void mouseClicked(MouseEvent e) {
   if(playing && (PVP||(p1Red==turnRed))){
    int row=-1;
    for(int i=0; i<6; i++){
     for(int j=0; j<7; j++){
      if(lb[i][j]==e.getSource()){
       row=j;
       break;
      }
     }
    }
    if(playing&&row>=0){
      for(int i = 5; i>=0; i--){
        if(state[i][row]<=0){
          change(i,row);
          checkForWin();
          if(playing){
           action();
           if(!PVP)computerMove();
          }
          
          break;
        }
      }
    }
   }
  }
  
  public void mouseExited(MouseEvent e) {
    for(int i=0; i<6; i++){
     for(int j=0; j<7; j++){
      if(state[i][j]==-1){
        state[i][j]=0;
        lb[i][j].setIcon(hole);
      }
     }
    }
  }
  
  public void mouseEntered(MouseEvent e) {
    if(playing){
      int row = 1;
      
      for(int i=0; i<6; i++){
       for(int j=0; j<7; j++){
        if(lb[i][j]==e.getSource()){
         row=j;
         break;
        }
       }
      }
      //System.out.println(row);
          for(int i = 5; i>=0; i--){
            if(state[i][row]<=0){
             //System.out.println(i+" "+row);
              if(turnRed){
               state[i][row]=-1;
                  lb[i][row].setIcon(redTrans);
              }
              else{
                  state[i][row]=-1;
                  lb[i][row].setIcon(yellowTrans); 
              }
              break;
            }
          }
    }
  }
  
  public void mousePressed(MouseEvent e) {
    
  }
  
  public void mouseReleased(MouseEvent e) {
    
  }
  
  public void keyTyped(KeyEvent e) {
    if(p1==e.getSource()&&(p1.getText()).length()>20){
      p1.setText((p1.getText()).substring(0, 20));
    }
    else if(p2==e.getSource()&&(p2.getText()).length()>20){
      p2.setText((p2.getText()).substring(0, 20));
    }
  }
  
  public void keyPressed(KeyEvent e) {
    
  }
  
  public void keyReleased(KeyEvent e) {
    
  }
}



