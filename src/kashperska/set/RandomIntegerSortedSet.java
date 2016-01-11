package kashperska.set;


import java.util.*;

public class RandomIntegerSortedSet {

    private SortedSet<Integer> set;

    public RandomIntegerSortedSet(int n){
        set = new TreeSet<>();
        Random random = new Random();
        while (set.size() < n) {
            set.add(random.nextInt());
        }
    }

    public Integer getNextValue(Integer elem){
        validateElementExists(elem);
        SortedSet<Integer> tailSet = set.tailSet(elem);
        Iterator<Integer> it = tailSet.iterator();
        if(tailSet.size() == 1){
            return null;
        }

        // Skip the provided element since tailSet is inclusive
        it.next();

        return it.next();
    }

    public Integer getPrevValue(Integer elem){
        validateElementExists(elem);
        SortedSet<Integer> headSet = set.headSet(elem);
        if(headSet.isEmpty()){
            return null;
        }
        return headSet.last();
    }
    
    public Iterator<Integer> iterator(){
        return set.iterator();
    }
    
    @Override
    public String toString(){
        return set.toString();
    }

    private void validateElementExists(Integer elem){
        if(!set.contains(elem))
            throw new NoSuchElementException();
    }
}
