/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.automatas;

/**
 *
 * @author carlos
 */
public class AutomataNombreVariables {
    
    public boolean parsear(String cadena){
        boolean aceptar = false;
        char estado = 'A';
        
        char[] terminales = cadena.toCharArray();
        
        for(char terminal : terminales){
            switch(estado){
                case 'A':
                    if((terminal>=64&&terminal<=90)||(terminal>=97&&terminal<=122)){
                        estado = 'B';
                        aceptar = true;
                    }else{
                        return false;
                    }
                break;
                case 'B':
                    if((terminal>=64&&terminal<=90)||(terminal>=97&&terminal<=122)||terminal == 95||(terminal>=48 && terminal<=57)){
                        estado = 'B';
                        aceptar = true;
                    }else{
                        return false;
                    }
                break;                
            }
        }
        
        return aceptar;
    }
    
}
