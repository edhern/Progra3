public class ArreglosListas {
    protected Nodo start, end;
   
    public ArreglosListas(){
        this.start = null;
        this.end = null;
    }
   
    public void AgregarNombresAlaLista(String i){
        start = new Nodo(i,this.start);
        if(end == null){
            end = start;
        }
    }
   
    public void showList(){
        Nodo auxiliar1 = start;
        while(auxiliar1 != null){
            System.out.print("  -" + auxiliar1.dato + "-  ");
            auxiliar1=auxiliar1.siguiente;
        }
    
    }
    public void MostrarCadaUnoDeLosUsuarios(String buscador){
        Nodo auxiliar1 = start;
        while(auxiliar1 != null){
            String cont = auxiliar1.dato;
            if(cont.equals(buscador)){
            System.out.print("  -" + cont + "-  ");
            
            }
            auxiliar1=auxiliar1.siguiente;
        }
    }
}
