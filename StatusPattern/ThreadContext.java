public class ThreadContext {
    public AThreadStatus status;

    public ThreadContext(AThreadStatus status) {
        this.status = status;
    }

    public void setStatus(AThreadStatus status) {
        this.status = status;
    }

    public AThreadStatus getStatus() {
        return status;
    }

    public void start() {
        ((NewThread)(status)).start(this);
    }

    public void getCpu() {
        ((Rannable)(status)).getCpu(this);
    }

    public void suspend() {
        ((Running)(status)).suspend(this);
    }

    public void stop() {
        ((Running)(status)).stop(this);
    }

    public void resume() {
        ((BlockThread)(status)).resume(this);
    }
}
