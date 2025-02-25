package JavaCodingChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOverlap {
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

    public void ListOverlap() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    list.add(list1.get(i));
                }
            }
        }

        System.out.println(list);
    }
}
