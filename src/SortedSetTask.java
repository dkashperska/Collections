import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTask {

    public static void main(String [ ] args){
        SortedSet<Integer> set = generateSortedSetOfInteger();

    }

    private static SortedSet<Integer> generateSortedSetOfInteger(){
        SortedSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < 10; i++)
            set.add(i);
        return set;
    }
}
