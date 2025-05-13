package Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class DuplicateAndInvert {
    public static List<Integer> dupInv (List<Integer> list){
        List<Integer> newList = new ArrayList<>(list);
        for (int i = list.size()-1; i >=0; i--) {
            newList.add(list.get(i));

        }
        return newList;
    }
}
