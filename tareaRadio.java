

public class tareaRadio {
    
    public static void main(String[]args)
    {
        float DatosAlmacenados;
        float Radio = 3;

        EjercicioEsfera Esfera = new EjercicioEsfera(); 

        DatosAlmacenados = Esfera.MetodoVolumen(Radio);
        System.out.println("Volumen de la esfera = "+ DatosAlmacenados);

        DatosAlmacenados = Esfera.MetodoDeLaCircunferencia(Radio);
        System.out.println("Circunferencia de la esfera = " + DatosAlmacenados);

        DatosAlmacenados = Esfera.MetodoVolumen(Radio);
        System.out.println("Volumen de la esfera = "+ DatosAlmacenados);

        DatosAlmacenados = Esfera.MetodoParaDiametro(Radio);
        System.out.println("Diametro de la esfera = " + DatosAlmacenados);

        DatosAlmacenados = Esfera.MetodoArea(Radio);
        System.out.println("Area de la esfera = " + DatosAlmacenados);


    }
}
