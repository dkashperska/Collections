package kashperska.set;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class RandomIntegerSortedSetTest {

    private RandomIntegerSortedSet randomIntegerSortedSet;
    private Integer firstValue;
    private Integer secondValue;

    @Before
    public void setUp(){
        randomIntegerSortedSet = new RandomIntegerSortedSet(2);
        Iterator<Integer> iterator = randomIntegerSortedSet.iterator();
        firstValue = iterator.next();
        secondValue = iterator.next();
    }

    @Test
    public void shouldGetNextValueFromCurrent(){
        assertEquals(secondValue, randomIntegerSortedSet.getNextValue(firstValue));
    }

    @Test
    public void shouldGetPreviousValueFromCurrent(){
        assertEquals(firstValue, randomIntegerSortedSet.getPrevValue(secondValue));
    }
    
    @Test
    public void shouldReturnNullWhenNoNextValue(){
        assertEquals(null, randomIntegerSortedSet.getNextValue(secondValue));
    }

    @Test
    public void shouldReturnNullWhenNoPreviousValue(){
        assertEquals(null, randomIntegerSortedSet.getPrevValue(firstValue));
    }
}
