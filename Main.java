package com.company;
import java.util.Arrays;

//Project 4 by Steven Milanesi

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

    
    public static void EventManager() {
        EventManager event = new EventManager();
        event.printEvent();
    }

    public static void OlympianManager() {
        OlympianManager olymian = new OlympianManager();
        olympian.printOlympians();
    }
    
    public static void startCompetition(){
        System.out.println("Enter an Event");
        int event = Integer.parseInt(stringArray[0]);
        System.out.println("Enter the first team");
        int team1 = Integer.parseInt(stringArray[1]);
        System.out.println("Enter the second team");
        int team2 = Integer.parseInt(stringArray[2]);
    }
    
    Public static void endCompetition(){
        endCompetition(Competition competition, Team winningTeam);
        System.out.println("Enter the competition");
        int competition = Integer.parseInt(stringArray[0]);
        System.out.println("Enter the winning team");
        int winningTeam = Integer.parseInt(stringArray[1]);
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
                else if(args[i] == "t" || args[i] =="teams")
                {
                    displayTeams();
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
