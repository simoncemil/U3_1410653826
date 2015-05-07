package Aufgabe3;

import Aufgabe2.*;


public class Car extends Vehicle{
    private boolean aircondition;
    private short airbag;
    public void startAircondition(){
        if(aircondition = false){
            aircondition = true;
        }
        else{
            System.out.println("Klimaanlage läuft bereits!");
        }
    }
    public void stopAircondition(){
        if(aircondition = true){
            aircondition = false;
        }
        else{
            System.out.println("Klimaanlage ist bereits ausgeschaltet!");
        }
    }

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }

    public Car(short wheels, String color, short ps, short doors, short airbag) {
        super(wheels, color, ps, doors);
        this.aircondition = false;
        this.airbag = airbag;
        this.speed = 0;
        
    }

    @Override
    public String toString() {
        return "Mein Auto hat " + getPs() + "PS und fährt mit " + getSpeed() + " km/h";
    }

    
    

    

    
    
}
