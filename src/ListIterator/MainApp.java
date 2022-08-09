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
        main.print(iterator);
        main.reverse(iterator, reversedIterator);
        main.print(iterator);
    }

    private void reverse(ListIterator<Integer> iterator, ListIterator<Integer> reversedIterator) {
        while (iterator.nextIndex() < reversedIterator.previousIndex()) {
            int tmpValue = iterator.next();
            iterator.set(reversedIterator.previous());
            reversedIterator.set(tmpValue);
        }
    }

    private void print(ListIterator<Integer> list) {
        while(list.hasPrevious()) {
            list.previous();
        }

        while (list.hasNext()) {
            System.out.print(list.next() + " ");
        }

        while(list.hasPrevious()) {
            list.previous();
        }
        System.out.println();
    }
}
