package Aufgabe3;

import Aufgabe2.*;

public class Aufruf {
    public static void main(String[] args) {
        
        Car bmw = new Car((short) 4, "silber", (short)220,(short)5,(short)4);
        Car audi = new Car((short) 4, "schwarz", (short)180,(short)5,(short)8);
        Boat titanic = new Boat((short)0,"blau",(short)51000,(short)0,10.54,(short)3,100000);
        BennenbarKlasse vw = new Car((short) 4, "silber", (short)220,(short)5,(short)4);
        
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());
        System.out.println(vw.toString());
        
    }
}
