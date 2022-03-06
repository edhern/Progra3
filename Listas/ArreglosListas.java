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
    public void eliminarElemento(String elemento){
        if(start.dato.equals(elemento)){
            start = start.siguiente;
        }else{
            Nodo aux = start;
            while(aux.siguiente != null){
                if(aux.siguiente.dato.equals(elemento)){
                    aux.siguiente = aux.siguiente.siguiente;
                    break;
                }
                aux = aux.siguiente;
            }
        }
    }
    public boolean estaVacia(){
        if(this.start == null){
            return true;
        }
        return false;
    }





public void agregarAlendal(int elemento){
        if(!estaVacia()){
            this.end.siguiente = new Nodo(elemento);
            this.end = this.end.siguiente;
        }else{
            this.start=this.end = new Nodo(elemento);
        }
    }





public String eliminarAlstart(){
        String dato = this.start.dato;
        if(this.start == this.end){
            this.start=this.end=null;
        }else{
            this.start = this.start.siguiente;
        }
        return dato;
    }
   
    public String eliminarAlendal(){
        String dato = this.end.dato;
        if(this.start == this.end){
            this.start=this.end=null;
        }else{
            Nodo aux=start;
            while(aux.siguiente!=end){
                aux=aux.siguiente;
            }
            end=aux;
            end.siguiente = null;
        }
        return dato;
    }
    
}

