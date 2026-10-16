public class Stuhl
{
    private String Farbe;
    private int hoehe;
    private boolean drehbar;
    
    public Stuhl()
    {
        setFarbe("UNKN");
        setHoehe(20);
        setDrehbar(false);
    }

    public Stuhl(String neuFarbe, int neuHoehe, boolean neuDrehbar)
    {
        setFarbe(neuFarbe);
        setHoehe(neuHoehe);
        setDrehbar(neuDrehbar);
    }
    
    public String getFarbe()
    {
        return Farbe;
    }

    public int getHoehe()
    {
        return hoehe;
    }

    public boolean getDrehbar()
    {
        return drehbar;
    }
    
    public void setFarbe(String neuFarbe)
    {
        Farbe = neuFarbe;
    }
    
    public void setHoehe(int neuHoehe)
    {
        hoehe = neuHoehe;
    }
    
    public void setDrehbar(boolean neuDrehbar)
    {
        drehbar = neuDrehbar;
    }

}