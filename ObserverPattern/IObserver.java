public interface IObserver {
    public void update(Subject subject);
    public void addStock(Subject subject);
    public void remove(Subject subject);
}
