package src.main.java;

public abstract class Player{
  public String side;
  public Board board;
  public int korgoolScore;

  public Player(String side, Board board){
    this.side = side;
    this.board = board;
    //players score is initialised to 0 (0 korgools in kazan)
    korgoolScore = 0;
  }

  //returns the side- either black or white
  publc String getSide(){
    return side;
  }

  //returns the winner of the game
  public boolean gameover(){
    if(korgoolScore > 81){
      return true;
    }
    return false;
    }
}
