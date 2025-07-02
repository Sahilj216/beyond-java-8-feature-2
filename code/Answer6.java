import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;

public class Answer6 {

    public static void main(String[] args) {
        SequencedCollection<Integer> ls = new ArrayList<>(List.of(1,2,3));

        ls.addFirst(10);
        System.out.println("List after adding first element: " + ls);

        ls.addLast(20);
        System.out.println("List after adding last element: " + ls);

        ls.removeFirst();
        System.out.println("List after removing first element: " + ls);

        ls.removeLast();
        System.out.println("List after removing last element: " + ls);

        System.out.println("Getting First Element: " + ls.getFirst());

        System.out.println("Getting Last Element: " + ls.getLast());

        SequencedCollection<Integer> reversed = ls.reversed();

        System.out.println("Reverse the List: " + reversed);
        


        SequencedSet<Integer> set = new LinkedHashSet<>(Set.of(1, 2, 3, 4, 5));

        set.addFirst(10);
        System.out.println("Set after adding first element: " + set);

        set.addLast(20);
        System.out.println("Set after adding last element: " + set);

        set.removeFirst();
        System.out.println("Set after removing first element: " + set);

        set.removeLast();
        System.out.println("Set after removing last element: " + set);

        System.out.println("Getting First Element: " + set.getFirst());

        System.out.println("Getting Last Element: " + set.getLast());

        SequencedSet<Integer> reversedSet = set.reversed();
        System.out.println("Reversed Set: " + reversedSet);
    }
}
