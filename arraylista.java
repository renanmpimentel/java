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

