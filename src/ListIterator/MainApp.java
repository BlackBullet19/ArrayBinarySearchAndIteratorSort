package ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class MainApp {
    public static void main(String[] args) {

        MainApp main = new MainApp();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4,6, 5, 6, 7, 9)); // 9,7,6,5,4,2,1
        ListIterator<Integer> iterator = list.listIterator();
        ListIterator<Integer> reversedIterator = list.listIterator(list.size());
        System.out.println(list);
        main.reverse(iterator, reversedIterator);
        System.out.println(list);
    }

    private void reverse(ListIterator<Integer> iterator, ListIterator<Integer> reversedIterator) {
        while (iterator.nextIndex() < reversedIterator.previousIndex()) {
            int tmpValue = iterator.next();
            iterator.set(reversedIterator.previous());
            reversedIterator.set(tmpValue);
        }
    }
}
