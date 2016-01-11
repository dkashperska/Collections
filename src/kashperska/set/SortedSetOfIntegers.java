package kashperska.set;


import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfIntegers {

    private SortedSet<Integer> set;

    public SortedSetOfIntegers(int n){
        set = new TreeSet<>();
        for(int i = 0; i < 10; i++)
            set.add((int) Math.random());
    }

    public Integer getNextValue(Integer elem){
        if(!set.contains(elem))
            throw new NoSuchElementException();
        SortedSet<Integer> tailSet = set.tailSet(elem);
        Iterator<Integer> it = tailSet.iterator();
        getNextByIterator(it);
        return getNextByIterator(it);
    }

    private Integer getNextByIterator(Iterator<Integer> it){
        if(it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
