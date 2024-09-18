/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.automatas;

/**
 *
 * @author carlos
 */
public class AutomataBinariosPares {
    public boolean parsear(String cadena){
        boolean aceptar = false;
        char estado = 'A';
        
        char[] terminales = cadena.toCharArray();
        
        for(char terminal : terminales){
            switch(estado){
                case 'A':
                    switch(terminal){
                        case '1':
                            estado = 'A';
                        break;
                        case '0':
                            estado = 'B';
                            aceptar = true;
                        break;
                        default:
                            return false;
                    }
                break;
                case 'B':
                    switch(terminal){
                        case '1':
                            estado = 'A';
                            aceptar = false;
                        break;
                        case '0':
                            estado = 'B';
                            aceptar = true;
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
