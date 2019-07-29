package ca.jrvs.challenge.frequency_4;

import java.util.LinkedList;
import java.util.Queue;

public class MoveAve {

    Queue<Integer> queue;
    int n;
    int sum;

    /** Initialize your data structure here. */
    public MoveAve(int size) {
        queue = new LinkedList<Integer>();
        n = size;
        sum = 0;
    }

    public double next(int val) {
        queue.offer(val);
        double result = 0;
        sum += val;
        if (queue.size() <= n) {
            result = (double) sum / queue.size();
        } else {
            int remove = queue.poll();
            sum -= remove;
            result = (double) sum / n;
        }

        return result;
    }
}
