package p4lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author liuyanzhao
 */
public class Hello3Sort1Old {
    public static void main(String[] args) {

        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        // 1.1 使用匿名内部类根据 name 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });

        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }
}
