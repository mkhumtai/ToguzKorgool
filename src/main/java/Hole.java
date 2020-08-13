package src.main.java;

public class Hole{
  private int korgools;
  private int index;
  private String side;

  public Hole(int index){
    korgools = 9;
    side = "";
    this.index = index;
  }

  public int getNumberOfKorgools(){
    return korgools
  }

  public int getHoleNumber(){
    return index;
  }

  //check black or white side
  public String checkSide(){
    return side;
  }

  //after a player has made move, korgools are redistributed
  public void addKorgool(){
    korgools++;
  }

  public void removeKorgools(){
    korgools -= korgoolInHole;
  }

}
