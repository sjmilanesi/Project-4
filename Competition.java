
public class Competition implements ICompetition {
    private Event event;
    private Team team1;
    private Team team2;

    public Event getEvent1(){
        return this.event;
    }

    public Team getTeam1(){
        return this.team1;
    }

    public Team getTeam2(){
        return this.team2;
    }

    public void setEvent(Event myEvent){
        this.event = myEvent;
    }

    public void setTeam1(Team myTeam1){
        this.team1 = myTeam1;
    }

    public void setTeam2(Team myTeam2){
        this.team2 = myTeam2;
    }
}
