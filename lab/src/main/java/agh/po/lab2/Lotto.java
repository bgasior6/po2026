package agh.po.lab2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Lotto {
    public static void main(String[] args){
        ArrayList<Integer> liczby= new ArrayList<>();
        Random r = new Random();
        while (liczby.size() < 6){
            Integer losowa_liczba = r.nextInt(49);
            if (liczby.contains(losowa_liczba) == false){
                liczby.add(losowa_liczba);
            }
        }
        System.out.println(liczby);
//        Integer licznik = 0;
//        for (int i = 0; i < 6; i++) {
//            if (liczby.get(i) == Integer.parseInt(args[i])) {
//                licznik++;
//            }
//        }
//        System.out.println(licznik);
        long start = System.currentTimeMillis();
        while (true) {
            ArrayList<Integer> proba = new ArrayList<>();
            while (proba.size() < 6) {
                Integer los = r.nextInt(49);
                if (proba.contains(los) == false) {
                    proba.add(los);
                }
            }
            proba.retainAll(liczby);
            if (proba.size() == 0) {
                break;
            }

        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}
