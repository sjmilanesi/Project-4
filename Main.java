package com.company;
import java.util.Scanner;

//Project 2 by Steven Milanesi

public class Main {

    public static EventManager eventManager = new EventManager();
    public static OlympianManager olympianManager = new OlympianManager();
    public static TeamManager teamManager = new TeamManager();

    public Main() {
        eventArray = new String[]
                {
                        "CanJam", "CornHole", "HorseShoes", "LadderBall", "StickGame", "Washoos"
                };
    }



    public static void displayEvents() {
        for (int i = 0; i < EventManager.length; i++) {
            System.out.println(EventManager[i]);
        }
    }

    public static void displayOlympian() {
        for (int i = 0; i < OlympianManager.length; i++) {
            System.out.println(OlympianManager[i][0] + " ");
            for (int j = 1; j < OlympianManager[i].length; j++) {
                System.out.println(OlympianManager[i][j] + " ");
            }
        }
    }


    public static void main(String[] args)
    {
        if(args.length > 0)
        {
            for(int i = 0; i < args.length; i++)
            {
                if(args[i] == "e" || args[i] == "events")
                {
                    displayEvents();
                }
                else if(args[i] == "o" || args[i] == "olympians")
                {
                    displayOlympians(); 
                }
                else if(args[i] == "h" || args[i] =="help")
                {
                    System.out.println("Help");
                }
                else
                {
                    System.out.println("Invalid");
                }
            }
        }
    }

}
