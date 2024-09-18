/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.automatas;

/**
 *
 * @author carlos
 */
public class AutomataEnteroPositivo {
    
    public boolean parsear(String cadena){
    
        boolean aceptar = false;
        char estado = 'A';
        
        char[] terminales = cadena.toCharArray();
        
        for(char terminal : terminales){
            switch(estado){
                case 'A':
                    if(terminal>=48 && terminal<=57){
                        estado = 'C';
                        aceptar = true;
                    }else if(terminal == 45 || terminal == 43){
                       estado = 'B';                       
                    }else{
                        return false;
                    }
                break;
                case 'B':
                    if(terminal>=48 && terminal<=57){
                        estado = 'C';
                        aceptar = true;
                    }
                    else{
                        return false;
                    }
                break;
                case 'C':
                    if(terminal>=48 && terminal<=57){
                        estado = 'C';
                        aceptar = true;
                    }
                    else{
                        return false;
                    }
                break;                
            }
        }
        
        return aceptar;
        
    }
    
}
