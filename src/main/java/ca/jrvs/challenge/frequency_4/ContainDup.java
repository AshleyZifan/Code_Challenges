package ca.jrvs.challenge.frequency_4;

import java.util.HashSet;
import java.util.Set;

public class ContainDup {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

}
