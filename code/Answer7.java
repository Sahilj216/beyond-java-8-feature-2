import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.SequencedMap;

public class Answer7 {

    public static void main(String[] args) {
       SequencedMap<Integer,String> mp = new LinkedHashMap<>(); 
       mp.put(1, "One");
       mp.put(2, "Two");
       mp.put(3, "Three");
       mp.put(4, "Four");

       Entry<Integer, String> firstEntry = mp.firstEntry(); // Returns the first key
       System.out.println("First Entry: " + firstEntry.getKey() + " = " + firstEntry.getValue());

       Entry<Integer, String> lastEntry = mp.lastEntry(); // Returns the last key
       System.out.println("Last Entry: " + lastEntry.getKey() + " = " + lastEntry.getValue());

       Entry<Integer, String> pollFirst = mp.pollFirstEntry(); // Returns and removes the first key
       System.out.println("First Entry after poll: " + pollFirst.getKey() + " = " + pollFirst.getValue());

       Entry<Integer, String> pollLast = mp.pollLastEntry(); // Returns and removes the last key
       System.out.println("Last Entry after poll: " + pollLast.getKey() + " = " + pollLast.getValue());

       mp.putFirst(5, "Five");
       System.out.println("Map after adding first element: " + mp);

       mp.putLast(6, "Six");
       System.out.println("Map after adding last element: " + mp);

       SequencedMap<Integer, String> reversed = mp.reversed();
       System.out.println("Reversed Map: " + reversed);
    }
}
