
package Main.Event;


public abstract class Event{
    private String name;
    private int playTo;
    private boolean isPlayToExact;
    private int playDistance;

    public String getName()
    {
        return name;
    }

    public int getPlayTo()
    {
        return playTo;
    }

    public boolean isPlayToExact()
    {
        return isPlayToExact;
    }

    public int getPlayDistance()
    {
        return playDistance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPlayTo(int playTo)
    {
        this.playTo = playTo;
    }

    public void setIsPlayToExact(boolean isPlayToExact)
    {
        this.isPlayToExact = isPlayToExact;
    }

    public void setPlayDistance(int playDistance)
    {
        this.playDistance = playDistance;
    }

    public abstract String getExtraInfo();
}
