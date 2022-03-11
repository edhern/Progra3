import java.util.*;

public class MainEnl {
    static Scanner o = new Scanner(System.in);
    static ArreglosListas lista = new ArreglosListas();
    public static void main(String[] args)
    {
        
        boolean activo = true;
        do{
            Options();
        String D = o.nextLine(); 
            if(Integer.parseInt(D)==1){
                Store();
            }else if(Integer.parseInt(D)==2){
                All();
            }else if(Integer.parseInt(D)==3){
                BuscarDatos1a1();
            }else if(Integer.parseInt(D)==4){
                EliminarDato();
            }else if(Integer.parseInt(D)==5){
                EliminarElementoAlInicio();
            }else if(Integer.parseInt(D)==6){
                EliminarDatoAlFinal();
            }else if(Integer.parseInt(D)==7){
                AgregarDatoAlFinal();
            }else {
                System.out.println("Opción invalida");
            }
        }while(activo);
        
    }
    
    public static void Options(){
        System.out.println("""
        ---> USUARIOS <---

        INGRESE EL NUMERO DE LA OPCIÓN
        1) INGRESAR USUARIO
        2) VER USUARIOS
        3) BUSCAR USUARIO
        4) ELIMINAR DATOS
        5) ELIMINAR AL INICIO
        6) ELIMINAR AL FINAL
        7) AGREGAR AL FINAL
        
        """);
    }
    public static void Store()
    {
        System.out.println("INGRESE SU NOMBRE");
        String name=o.nextLine();
        lista.AgregarNombresAlaLista(name);
    }
    public static void All()
    {
        lista.showList();
    }

    public static void BuscarDatos1a1(){
        System.out.println("INGRESE SU NOMBRE");
        String name=o.nextLine();
        lista.MostrarCadaUnoDeLosUsuarios(name);
    }
    public static void EliminarDato(){
        System.out.println("INGRESE SU NOMBRE");
        String name=o.nextLine();
        lista.eliminarElemento(name);
    }  

    public static void AgregarDatoAlFinal(){
        String name=o.nextLine();
        lista.agregarAlendal(name);
    }
    public static void EliminarElementoAlInicio(){
        lista.eliminarAlstart();
    }
    public static void EliminarDatoAlFinal(){
        lista.eliminarAlendal();
    }
    
}
