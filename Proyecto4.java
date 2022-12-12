/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyecto4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Montse
 */
public class Proyecto4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntegerSet ser =new IntegerSet();
        
        int res = 0;
    
        do {
            System.out.println("1) Crear conjunto");
            System.out.println("2) Insertar elemento");
            System.out.println("3) Eliminar elemento");
            System.out.println("4) Mostrar conjunto");
            System.out.println("5) Comparar conjuntos");
            System.out.println("6) Salir");
            System.out.print("Selecciona una opción: ");
            res = sc.nextInt();
            switch(res) {
                case 1: {
                    ser.crear();
                    ser.toSetString();
                    break;
                }     
                case 2: {
                    ser.insertElement();
                    ser.toSetString();
                    break;
                } 
                case 3: {
                    ser.deleteElement();
                    ser.toSetString();
                    break;
                } 
                case 4: {
                    ser.toSetString();
                    break;
                } 
                case 5: {
                    ser.equalTo();
                    break;
                }  
                case 6: {
                    System.out.println("FIN ");
                    break;
                }
                default:
                    System.out.println("continuar");
            }
        } while ( res != 6);
    }
}
