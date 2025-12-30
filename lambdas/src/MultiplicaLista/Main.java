package MultiplicaLista;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> List = Arrays.asList(1,2,3,4,5);
        List.replaceAll(n -> n * 3);

        System.out.println(List);
    }
}
