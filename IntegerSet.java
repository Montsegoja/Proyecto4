package proyecto4;

import java.util.HashSet;
import java.util.Scanner;

public class IntegerSet {
    int num;
    String cadena;
    Scanner sc = new Scanner(System.in);
    HashSet conjunto=new HashSet();
    
     public IntegerSet() {
    }
    
    public void crear(){
        
    System.out.print("Num de elementos para el conjunto: ");
    num=sc.nextInt();       

        for (int i = 0; i <= num; i++) {
           System.out.print("Elemento " +i+" ");
           cadena=sc.nextLine();
           conjunto.add(cadena);           
        }   
        
    }
    
    public void insertElement(){
        System.out.print("Nuevo elemento ");   
        cadena=sc.nextLine();
        conjunto.add(cadena);       
       
    }
    
    public void deleteElement(){
        System.out.print("Elemento a eliminar: ");   
        cadena=sc.nextLine();
        conjunto.remove(cadena);
    }

    public void toSetString(){        
       
         System.out.print("Elementos del conjunto");
         for (Object conjuntos:conjunto) {
             System.out.println(conjuntos);            
        }
         
         if(conjunto.isEmpty()==true){
             System.out.print("-\n");
    }
         
         
    }
   
    public void equalTo(){
       
        IntegerSet set2 =new IntegerSet();
        IntegerSet set3 =new IntegerSet();
        System.out.print("Conjunto 1 ");
        set2.crear();
        set2.toSetString();
        System.out.print("Conjunto 2 ");
        set3.crear();
        set3.toSetString();
        
        
        if(set2.conjunto.equals(set3.conjunto)){
            
            System.out.print("Conjuntos iguales\n ");
        }else{
            System.out.println("Conjuntos diferentes\n");
        }
        
        
     
   }
        
}
    
    


