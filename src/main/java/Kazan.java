package src.main.java;

public class Kazan{

  private int numberOfKorgools;

  //the kazan is initialised with 0 korgools
  public Kazan(){
    numberOfKorgools = 0;
  }

  //returns the number of korgools that are in the kazan
  public int getKorgoolsInKazan(){
    return numberOfKorgools;
  }

  //player wins korgools and this is added to the kazan
  public void addKorgoolsToKazan(){
    numberOfKorgools += availableKorgools;
  }
  
}
