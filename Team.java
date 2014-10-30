package com.company;

public class Team {
  private Olympian olympian1;
  private Olympian olympian2;
  private int wins;
  private int losses;

  public void setOlympian1(olympian1){
    this.olympian1 = olympian1;
  }

  public Olympian getOlympian1(){
    return this.olympian1;
  }

  public void setOlympian2(olympian2){
    this.olympian2 = olympian2;
  }

  public Olympian getOlympian2(){
    return this.olympian2;
  }

  public void setWins(int wins){
    this.wins = wins;
  }

  public int getWins(){
    return this.wins;
  }

  public void setLosses(int losses){
    this.losses = losses;
  }

  public int getLosses(){
    return this.losses;
  }

}
