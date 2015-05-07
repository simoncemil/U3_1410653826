package Aufgabe4;

public class Liste<T> extends NewClass {//T ist der platzhalter für irgentein datentyp
                                        //statt eines Datentyps wird ein Platzhalter <T> verwendet
//int[] neuerArray = new int[2];  <--- thats how to do an array, oldschool shit :)
    T[] array;//das attribut array mit irgentnem datentyp

    public Liste(int size) {//konstruktor, übergabeparameter size
        array = (T[]) (new Object[size]);//wen size 10 ist wird hier dem array die größe 10 zugewiesen und int
                                        
    }

    public void save(T value) {//die methode save speichert die t values in den array rein
        for (int i = 0; i < array.length; i++) {//wen der zähler kleiner wie die array.length is, geht er ins if rein

            if (array[i] == null) {//er schaut ob platz is im array
                array[i] = value;//wen ja, also das if bestätigt, dann füllt er auf diesen platz des arrays den T value ein
                System.out.println("Es wurde gespeichert");
                break;
            }
        }

    }

    @Override//des override brauchen wir weil 
    public String toString() {
        String inhalt = "";//weil man somit einen leeren string vordefiniert...
                                //...und in den leeren string pack ich meine inhalte und er gibt sie aus
        for (T a : array) {     //für jedes objekt von a in der liste array soll er...
            inhalt += a + "\n"; //... den "inhalt" + a hinzufügen, also a
        }
        return inhalt;
    }

}
