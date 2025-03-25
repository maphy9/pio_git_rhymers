package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_ARRAY = -1;
    private static final int ERROR_CODE = -1;
    private static final int ARRAY_SIZE = 12;
    private final int[] numbers = new int[ARRAY_SIZE];

    private int total = EMPTY_ARRAY;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_CODE;
    }

    public boolean isFull() {
        return total == ARRAY_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total--];
    }

}
