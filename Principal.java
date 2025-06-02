
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Principal {
    public static void main(String[] args) {
          //String[] nomes= {"thiago","betoven", "perola"};

          int[] idades = new int[]{40,22,45,2,3,4,6,7,8};

          Arrays.sort(idades);

          System.out.println("o array ordenado e : " + Arrays.toString(idades));
        
          List<String> nomes = new ArrayList<>(); //--provavelmente inicializa um array e cria um objeto para o array

          System.out.println( nomes.add("thiago"));
          System.out.println(nomes.add("betoven")); //o type deles e boolean,tinha esquecido
          System.out.println( nomes.add("perola"));
          System.out.println(nomes.add("ratinha"));
          System.out.println( 
          nomes.remove("ratinha"));
          System.out.println( nomes.remove(0));
          System.out.println(nomes.get(2));

          System.out.println( nomes.set(1,"bradock"));
          
          for(String nome: nomes){
            System.out.println(nome);
          }

          nomes.forEach(System.out::println);

          //conversao:
          //Array -> lista
          String[] array = {"thiago","betoven","perola"};
          List<String> lista = Arrays.asList(array);
          
          //lista -> array

          String[] Array = lista.toArray(new String[0]);

          

 
    }
}