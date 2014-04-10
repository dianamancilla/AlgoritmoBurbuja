/**
 *
 * @author ines aguilar
 */
public class Burbuja {
   int c=0;
    
    public int contar(int a[]){
        for(int i=0; i<a.length; i++){
            c++;
        }
        
        return c;
    }
    
    public void orBurbuja(int [] arreglo){
         int cont=contar(arreglo);
        for(int i=0; i<cont-1; i++){
            for (int j=i+1; j<cont; j++){
                if ( arreglo[i] > arreglo[j] ) { 
                    int tem = arreglo[i]; 
                    arreglo[i] = arreglo[j]; 
                    arreglo[j] = tem; 
                   
                } 
            }
             
        }
         this.imprimir(arreglo);
    }
    
    public void imprimir(int [] ar){
        for(int j=0; j<ar.length; j++){
           int a=ar[j];
           System.out.print(a+" ");
        }
        
    }
}
