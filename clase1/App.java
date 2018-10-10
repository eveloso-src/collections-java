/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author EducaciónIT
 */
public class App {

    public static void main(String[] args) {

        Persona per1 = new Persona(100, "Juan");
        Persona per2 = new Persona(101, "Maria");
        Persona per3 = new Persona(102, "Ignacio");
        Persona per4 = new Persona(103, "Carolina");

        PersonaComparator comparator = new PersonaComparator();
        PriorityQueue<Persona>  q1 = new PriorityQueue<>(4, comparator);
        q1.add(per1);
        q1.add(per2);
        q1.add(per3);
        q1.add(per4);
        
        Iterator<Persona> it = q1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getNombre());
        }
    }

}
