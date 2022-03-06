package PrimerParcial;
import java.util.*;

public class Examenl {
    public static void main(String[] args)
    {

        try (Scanner IngresarValores = new Scanner(System.in)) {
            int data = IngresarValores.nextInt();
            int[] primerArry = new int[data];
            for(int i = 0; i < primerArry.length; i++)
            
            {
            int newValue = IngresarValores.nextInt();
                primerArry[i] = newValue;
            }
            System.out.print("Peimer Arreglo Original [");
            for (int cont = 0; cont < primerArry.length; cont++) {
                System.out.print(primerArry[cont] + ", ");
            }

            String listaDeNum = OrdenarData (primerArry);
            String cont2 = ",";
            String[] arreglo2 = listaDeNum.split(cont2);
            
            System.out.print("Segundo Arreglo ascendente [");
            for (int cont3 = 0; cont3 < arreglo2.length; cont3++) {
                System.out.print(arreglo2[cont3] + ", ");
            }
            System.out.print("Tercer Arreglo Descendente [");
            for (int cont4 = (arreglo2.length - 1); cont4 >= 0; cont4--) {
                System.out.print(arreglo2[cont4] + ", ");
            }
        }
    }
   public static String OrdenarData(int [] arreglo3){
            int Orden,Elemento, I;
            String save="";
            String ContieneArreglo="";

                for (Elemento=0;Elemento<arreglo3.length;Elemento++) {
                    
                    for(Orden=1;Orden<arreglo3.length;Orden++) {
                        if(arreglo3[Orden]<arreglo3[Orden-1]){
                            I=arreglo3[Orden];
                            arreglo3[Orden]=arreglo3[Orden-1];
                            arreglo3[Orden-1]=I;
                                for(int cont5=0;cont5<arreglo3.length;cont5++){
                                save+=Integer.toString(arreglo3[cont5])+",";
                                }
                                ContieneArreglo=save;
                                save="";
                        }
                    }
                    
                }
                return ContieneArreglo;
        }
    

}