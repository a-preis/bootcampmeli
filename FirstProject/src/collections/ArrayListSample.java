package collections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayListSample {

    public static void main(String[] args) {
        ArrayList<String> arrayLista = new ArrayList<String>();

        // Usando iterator posso interagir com o mey array enquanto eu adiciono novos elementos, mas como tem
        // while, ele é mais pesado
        Iterator<String> iterator = arrayLista.iterator();
         do {
            System.out.println(iterator.next());
        } while(iterator.hasNext());

        // Usando forEach
        for(String s: arrayLista) {
            System.out.println(s);
        }

        //ou
        arrayLista.forEach(s -> System.out.println(s));

        //adicionar
        arrayLista.add("victor");

        // retorna true / false se ele tem ou não aquele item
        arrayLista.contains("juliana");




    }

}
