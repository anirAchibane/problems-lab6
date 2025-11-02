package problem4;

import java.util.*;

public class ListPerformanceComparison {

    private static final int SIZE = 100_000;        // total elements
    private static final int OPERATIONS = 10_000;   // random operations to test

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("---- Performance Comparison ----");
        System.out.println("---- Populate both lists ----");
        Random random = new Random();
        for (int i = 0; i < SIZE; i++){
            int n = random.nextInt();
            arrayList.add(n);
            linkedList.add(n);
        }

        // 2️⃣ Random insertions and deletions
        testRandomInsertDelete(arrayList, "ArrayList");
        testRandomInsertDelete(linkedList, "LinkedList");

        // 3️⃣ Sequential insertions/deletions at beginning and end
        testSequentialInsertDelete(arrayList, "ArrayList");
        testSequentialInsertDelete(linkedList, "LinkedList");

        // 4️⃣ Random access test
        testRandomAccess(arrayList, "ArrayList");
        testRandomAccess(linkedList, "LinkedList");
    }

    // ------------------------------------------------------------

    private static void testRandomInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        int index = list.size()/2;
        int element = random.nextInt();

        long start = System.nanoTime();

        list.add(index,element);
        //list.remove(index);

        long end = System.nanoTime();
        System.out.printf("%s - Random insert/delete: %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testSequentialInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        int element = random.nextInt();

        LinkedList<Integer> newlist = new LinkedList<Integer>();
        if (name.equals("LinkedList")){
            System.out.println("hey");
            newlist = (LinkedList<Integer>) list;
        }

        long start = System.nanoTime();
        // Insertions at beginning and end
        if (name.equals("ArrayList")){
            list.add(0,element);
            list.add(element);
        }
        else if(name.equals("LinkedList")){
            newlist.addFirst(element);
            newlist.addLast(element);
        }

        // Deletions at beginning and end
        if (name.equals("ArrayList")){
            list.remove(0);
            list.remove(list.size()-1);
        }
        else if(name.equals("LinkedList")){
            newlist.addFirst(element);
            newlist.addLast(element);
        }

        long end = System.nanoTime();
        System.out.printf("%s - Sequential insert/delete (start/end): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testRandomAccess(List<Integer> list, String name) {
        Random random = new Random();
        int size = list.size();

        System.out.println(name + ": ");
        long start = System.nanoTime();
        long sum = 0;
        for(int i = 0; i < size;i++){
            sum += list.get(i);
        }

        long end = System.nanoTime();
        System.out.printf("%s - Random access (get): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }
    /* RESULTS EXPLANATION:
    *   Random insertion/deletion takes significantly more time in LinkedLists than in ArrayList
    *   since insertion in LinkedList range between O(n) and O(1) in time complexity, ArrayList's
    *   insertion takes between O(n) and O(1)*
    *
    *   Sequential insertion/deletion takes more time in ArrayLists because add() function takes
    *   O(1) for LinkedLists, while it takes O(1)* for ArrayLists, while removal has the same
    *   time complexity for both types.
    *
    *   Variable access takes more time for LinkedLists, because the get() function takes O(1)
    *   for ArrayLists, while it ranges between O(1) and O(n) for LinkedLists.
    * */
}

