public class ArrayList {


    public static void main(String[] args) {
                  
        Fila2 f06 = new Fila2();
        f06.enfileirar("A");
        f06.enfileirar("B");
        System.out.println("nome: " + f06.recuperarProximo());
        f06.modificar("C");
        System.out.println("nome: " +f06.recuperarProximo());
        
    }
}

-------------------------------------------------------------------------------------------------------------------
import java.util.ArrayList;

class Fila2 {
    ArrayList<String> elemento;
    
    public Fila2(){
        this.elemento = new ArrayList<String>();
    }
    public void enfileirar(String aElemento){
        this.elemento.add(aElemento);
    }
    public String recuperarProximo(){
        return this.elemento.remove(0);
    }
    public void modificar(String aElemento){
        this.elemento.set(0, aElemento);
    }
}
