package Aufgabe2;

public class Boat extends Vehicle{
    private double draft;
    private short propeller;
    private double cargo;
    public void unload(){
        cargo = 0;
        try{
            Thread.sleep(5000);//das ganze programm wird für 5 sekunden pausiert
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public short getPropeller() {
        return propeller;
    }

    public void setPropeller(short propeller) {
        this.propeller = propeller;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public Boat(short wheels, String color, short ps, short doors, double draft, short propeller, double cargo) {
        super(wheels, color, ps, doors);
        this.draft = draft;
        this.propeller = propeller;
        this.cargo = cargo;
        this.speed = 0;
    }

    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat " + getPs() + " PS und einen Tiefgang von " + getDraft() + " m";
    }

    
    
    

    
    
}
