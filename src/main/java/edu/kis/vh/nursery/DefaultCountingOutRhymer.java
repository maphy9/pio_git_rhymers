package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ARR_SIZE = 12;
    public static final int FALSE_AS_INT = -1;
    private final int[] numbers = new int[ARR_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == FALSE_AS_INT;
    }

    public boolean isFull() {
        return total == ARR_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return FALSE_AS_INT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return FALSE_AS_INT;
        return numbers[total--];
    }

}
