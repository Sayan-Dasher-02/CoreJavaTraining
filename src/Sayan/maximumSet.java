package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class maximumSet 
{
    public static void main(String[] args) 
    {
        Set<Integer> set = new HashSet<>();
        set.add(15);
        set.add(29);
        set.add(23);
        set.add(16);
        set.add(20);
        System.out.println("Set = " + set);

        Object max = Collections.max(set);
        System.out.println("Maximum Element in The Set = " + max);
    }
}
