package Model.Logic;

public class Counter implements AutoCloseable {
    private int count = 0;
    private boolean isClosed = false;

    public void add() {
        if (isClosed) {
            throw new IllegalStateException("Счётчик закрыт");
        }
        count++;
    }

    public int getCount() {
        if (!isClosed) {
            throw new IllegalStateException("Счётчик не закрыт!");
        }
        return count;
    }

    @Override
    public void close() {
        isClosed = true;
    }
}
