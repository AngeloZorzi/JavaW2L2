package Esercizio2;

import java.util.*;

public class ListGenerator {
    public List<Integer> listGenerator(int N){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(101));
        }
        Collections.sort(list);
        return list;
    }
}



