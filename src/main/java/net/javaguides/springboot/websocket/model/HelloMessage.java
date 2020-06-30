package net.javaguides.springboot.websocket.model;

public class HelloMessage {

    private String generators;
    private String bus;
    private String load;



    public HelloMessage() {
    }

    public HelloMessage( String generators, String bus, String load )
    {
        this.generators = generators;
        this.bus = bus;
        this.load = load;
    }

    public String getGenerators()
    {
        return generators;
    }

    public void setGenerators( String generators )
    {
        this.generators = generators;
    }

    public String getBus()
    {
        return bus;
    }

    public void setBus( String bus )
    {
        this.bus = bus;
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
