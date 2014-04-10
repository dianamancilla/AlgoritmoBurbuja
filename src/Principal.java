/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ines aguilar
 */
public class Principal {
    public static void main(String args[] ){
        Burbuja b= new Burbuja();
        int arre[] = {41,4,6,8,9,1,45,3,7,2};
        System.out.print("El arreglo desordenado es: ");
        b.imprimir(arre);
        System.out.println(" ");
        
        System.out.print("El arreglo ordenado es: ");
        b.orBurbuja(arre);
        System.out.println(" ");
        //b.imprimir(arre);
        
    }
    
}
