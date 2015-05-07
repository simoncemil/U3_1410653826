package Aufgabe2;

public class Vehicle implements Bennenbar{

    private short wheels;
    private String color;
    protected String name;
    
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String _n){
        name = _n;
    }    
    
    public enum color {
    BLACK, SILVER, RED, GREY, YELLOW, BLUE
    }
    private short ps;
    private short doors;
    private boolean started;
    short speed;
    public void start(){
        this.started = true;
    }
    public void stop(){
        this.started = false;
    }
    public void accelerate(short s){
        if(started = true){
            speed += s;
        }
        if(speed > 250){
            speed = 250;
        }
    }
    public void break1(short s){
        if(started = false){
            speed -= s;
        }
        if (speed < 0){
            speed = 0;
        }
    }

    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicle(short wheels, String color, short ps, short doors) {
        this.wheels = wheels;
        this.color = color;
        this.ps = ps;
        this.doors = doors;
        this.started = false;
        this.speed = 0;
    }
    
    
    
}
