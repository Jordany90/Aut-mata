/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.automatas;

/**
 *
 * @author carlos
 */
public class AutomataTarea {
    
    public boolean parsear(String cadena){
    
        boolean aceptar = true;
        char estado = 'A';
        
        char[] terminales = cadena.toCharArray();
        
        for(char terminal : terminales){
            switch(estado){
                case 'A':
                    switch(terminal){
                        case 'a':
                            estado = 'A';
                        break;
                        case 'b':
                            estado = 'C';
                        break;
                        default:
                            return false;
                    }
                break;
                case 'C':
                    switch(terminal){
                        case 'a':
                            estado = 'F';
                        break;
                        case 'b':
                            estado = 'C';
                        break;
                        default:
                            return false;
                    }
                break;
                case 'F':
                    switch(terminal){
                        case 'a':
                            return false;
                        case 'b':
                            estado = 'C';
                        break;
                        default:
                            return false;
                    }
                break;
                
            }
        }
        
        return aceptar;
        
    }
    
}
