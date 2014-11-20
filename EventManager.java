package Main.EventManager;

public class EventManager {
    public Event[] event;

    public EventManager() {
        this.event = new Event[6];
        
        this.event[0] = new CanJamEvent();
        this.event[1] = new CornHoleEvent();
        this.event[2] = new HorseShoesEvent();
        this.event[3] = new LadderBallEvent();
        this.event[4] = new StickGameEvent();
        this.event[5] = new WashoosEvent();

    }

    public Event[] getEvent(){
        return this.event;
    }
}
