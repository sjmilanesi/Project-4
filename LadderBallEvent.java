package Main.LadderBallEvent;


public class LadderBallEvent extends Event {
    private int numRungs;
    public LadderBallEvent(int numRungs)
    {
        this.numRungs = numRungs;
    }

    @Override
    public String getExtraInfo()
    {
        return String.valueOf(numRungs);
    }
}
