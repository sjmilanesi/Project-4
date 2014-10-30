package Main.StickGameEvent;


public class StickGameEvent extends Event {
    private int frisbeeSize;
    public StickGameEvent(int frisbeeSize)
    {
        this.frisbeeSize = frisbeeSize;
    }

    @Override
    public String getExtraInfo()
    {
        return String.valueOf(frisbeeSize);
    }
}
