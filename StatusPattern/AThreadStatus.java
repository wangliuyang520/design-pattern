public abstract class AThreadStatus {
    protected static final int NEWSTART = 1;
    protected static final int RUNNABLE = 2;
    protected static final int RUNNING = 3;
    protected static final int BLOCK = 4;
    protected static final int DIED = 5;
    protected int status;

    public int getStatus() {
        return status;
    }
}
