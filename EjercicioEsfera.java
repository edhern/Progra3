public class EjercicioEsfera {
    static final float PI = 3.1416f;
    float MetodoDeLaCircunferencia(float R)
    {
        float Diametro=MetodoParaDiametro(R);
        float r;
        r = PI * Diametro;
        return r;

    }
    float MetodoArea( float R)
    {
        float r;
        float exponente = R*R;
        r = 4 * PI * exponente;
        return r;

    }
    float MetodoVolumen(float R)
    {
        float r;
        float exponente = R * R * R;
        r = 4 * PI * exponente;
        return r;
    }
    float MetodoParaDiametro (float R)
    {
        float r;
        r = 2 * R;
        return r;
    }
}