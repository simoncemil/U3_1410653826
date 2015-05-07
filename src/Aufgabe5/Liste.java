package Aufgabe5;

import Aufgabe4.*;

public class Liste<T extends Car, M extends Boat, N extends Vehicle>{//hier sag ich ihm von welchen klassen er erbt

    T[] array;//das attribut array, hat die klasse liste

    public Liste(int size) {//konstruktor, übergabeparameter size
        array = (T[]) (new Object[size]);//wen size 10 ist wird hier dem array die größe 10 zugewiesen
                                        
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
        String listenInhalt = "";//weil man somit einen leeren string vordefiniert...
                                //...und in den leeren string pack ich meine inhalte und er gibt sie aus
        for (T a : array) {//für jedes objekt von a in der liste array soll er den listeninhalt + a hinzufügen
            listenInhalt += a + "\n";
        }
        return listenInhalt;
    }

}
