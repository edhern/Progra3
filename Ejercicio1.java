public class Ejercicio1 {
    public static void main(String[] args){
        
        int[] numero = new int[5];
        numero[0] = 11;
        numero[1] = 12;
        numero[2] = 13;
        numero[3] = 15;
        numero[4] = 18;

        System.out.println (suma(numero));
    }

    public static int suma(int[]numero){
        int result = 0;
        for(int i=0; i<numero.length; i++){
            result += numero[i];

        }
        return result;
    }
        
    }




















