package net.javaguides.springboot.websocket.model;

public class Greeting {

    private boolean converge;
    private String load;
    private Double  clpu;
    private Double  inrush;


    public Greeting() {
    }

    public Greeting( Double clpu, Double inrush) {
        this.converge = true;
        this.clpu = clpu;
        this.inrush = inrush;
    }

    public boolean isConverge()
    {
        return converge;
    }

    public void setConverge( boolean converge )
    {
        this.converge = converge;
    }

    public Double getClpu()
    {
        return clpu;
    }

    public void setClpu( Double clpu )
    {
        this.clpu = clpu;
    }

    public Double getInrush()
    {
        return inrush;
    }

    public void setInrush( Double inrush )
    {
        this.inrush = inrush;
    }

    public String getLoad()
    {
        return load;
    }

    public void setLoad( String load )
    {
        this.load = load;
    }
}
