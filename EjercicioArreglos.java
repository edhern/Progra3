public class EjercicioArreglos {
    public static void main(String[] args)
    {
        Arreglo(100);
        
    }
    public static void Arreglo(int tamano){
        int range = tamano;
        int[] numeros = new int[10];
        for(int cont = 0; cont < numeros.length; cont++)
        {
            int numeroCualquiera = (int)(Math.random()*(range));
            numeros[cont] = numeroCualquiera;
            System.out.println("Indice = "+cont+"  Valor = "+numeros[cont]);
        }
    } 
}