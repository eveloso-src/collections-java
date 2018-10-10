/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Comparator;

/**
 *
 * @author EducaciónIT
 */
public class PersonaComparator implements Comparator<Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        return o2.getNombre().compareTo(o1.getNombre());
    }
    
    
    
}
