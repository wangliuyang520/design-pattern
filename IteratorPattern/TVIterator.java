public interface TVIterator {
    public boolean hasNext();
    public Object next();
    public Object privious();
    public Object getFirst();
    public Object getLast();
    public Object getCurrent();
    public Object setChannel(int index);
    public boolean isLast();
    public boolean isFirst();
}
