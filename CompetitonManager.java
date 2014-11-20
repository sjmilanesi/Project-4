package com.company;
import java.util.ArrayList;


public class CompetitionManager {

    Event event;
    Team team1;
    Team team2;


    public void StartCompetition(event, team1, team2) {
        Competition data = new Competition();
        data.setEvent(event);
        data.setTeam1(team1);
        data.setTeam2(team2);

        if (tail == null) {
            head = select;
        } else {
            tail.next = select;
        }
        tail = select;
    }

    public ICompetition[] getCompetitions(){
        public ArrayList myArray = new ArrayList();
        for(Competition curr = head; curr != null; curr = curr.next){
            myArray.add(curr);
        }
        return(ICompetition[]).myArray;
    }



}
