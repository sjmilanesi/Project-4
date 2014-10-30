package Main.CanJamEvent;


public class CanJamEvent extends Event {
    private int frisbeeSize;
    
    public void setFrisbeeSize(int frisbeeSize)
    {
        this.frisbeeSize = frisbeeSize;
    }
    
    public int getFrisbeeSize(){
        return "The Frisbee size is" + this.FrisbeeSize;
    }

    @Override
    public String getExtraInfo()
    {
        return String.valueOf(frisbeeSize);
    }
}
