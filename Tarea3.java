public class Tarea3 {
   
    public static void main(String[] args) {

        int [] primerA={100, 45, 78, 54, 96, 1, 2, 8, 9, 10};
        int [] SegundoA={200, 5, 6, 2, 333, 66, 74, 65, 22, 14};

        System.out.println("--------------------------------------------------");
        
        Metodo1 (primerA);

        System.out.println("--------------------------------------------------");

        Netodo2 (SegundoA,0,4);
        }
        public static void Metodo1(int [] array){
            int x,item, aux;
            String save="";
            
                for (item=0;item<array.length;item++) {
                    for(x=1;x<array.length;x++) {
                        if(array[x]<array[x-1]){
                            aux=array[x];
                            array[x]=array[x-1];
                            array[x-1]=aux;
                                for(int h=0;h<array.length;h++){
                                save+=Integer.toString(array[h])+",";
                                }
                                System.out.println(save);
                                save="";
                        }
                    }
                    
                }
                
        }    
        public static void Netodo2(int array[], int izq, int Drc){
            int pivote=array[izq]; 
            int i=izq;         
            int j=Drc;         
            int aux;
            String save="";
            
            while(i < j){                                                            
                while(array[i] <= pivote && i < j) i++; 
                while(array[j] > pivote) j--;          
                if (i < j) {                                              
                    aux= array[i];                     
                    array[i]=array[j];
                    array[j]=aux;
                }
                }
                
                array[izq]=array[j];      
                array[j]=pivote;      
                for(int h=0;h<array.length;h++){
                save+=Integer.toString(array[h])+",";
                }
                System.out.println(save);
                save="";
        
            if(izq < j-1)
                Netodo2(array,izq,j-1);          
            if(j+1 < Drc)
                Netodo2(array,j+1,Drc);  
        }
        }
            