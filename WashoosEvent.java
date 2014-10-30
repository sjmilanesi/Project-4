package Main.WashoosEvent;


public class WashoosEvent extends Event {
    private boolean hasAutoWinStick;
    private int numWashoos;
    public WashoosEvent(boolean hasAutoWinStick, int numWashoos)
    {
        this.hasAutoWinStick = hasAutoWinStick;
        this.numWashoos = numWashoos;
    }

    @Override
    public String getExtraInfo()
    {
        return String.valueOf(numWashoos) + " , " + hasAutoWinStick;
    }
}
