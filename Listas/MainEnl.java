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
                One();
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

    public static void One(){
        System.out.println("INGRESE SU NOMBRE");
        String name=o.nextLine();
        lista.MostrarCadaUnoDeLosUsuarios(name);
    }
    
}
