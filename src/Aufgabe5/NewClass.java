package Aufgabe5;

import Aufgabe4.*;

public class NewClass {
    
    public static void main(String[] args)
    {
     Liste a = new Liste(2);
     a.save(2.0);
     a.save(5.0);
     a.save(200.0);//weil double kann nicht zu car konvertiert werden
     
     System.out.println(a.toString());
     
    }           
}
