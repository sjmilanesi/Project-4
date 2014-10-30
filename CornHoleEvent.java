package Main.CornHoleEvent;


public class CornHoleEvent extends Event {
    private int numBeanBags;
    public void setNumBeanBags(int numBeanBags)
    {
        this.numBeanBags = numBeanBags;
    }

    @Override
    public String getExtraInfo()
    {
        return String.valueOf(numBeanBags);
    }
}
