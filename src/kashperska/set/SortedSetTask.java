package kashperska.set;

import java.util.Iterator;

public class SortedSetTask {

    public static void main(String [ ] args){
        RandomIntegerSortedSet randomIntegerSortedSet = new RandomIntegerSortedSet(10);
        Iterator<Integer> it = randomIntegerSortedSet.iterator();
        System.out.println(String.format("Sorted set values %s", randomIntegerSortedSet.toString()));
        System.out.println(String.format("Second value %s", randomIntegerSortedSet.getNextValue(it.next())));
        System.out.println(String.format("First value %s", randomIntegerSortedSet.getPrevValue(it.next())));

    }
}
