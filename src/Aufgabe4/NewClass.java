package Aufgabe4;

public class NewClass {
    
    public static void main(String[] args)
    {
     Liste a = new Liste(6);
     a.save(2.0);
     a.save(5.0);
     a.save(200.0);
     
     System.out.println(a.toString());
     
    }           
}
