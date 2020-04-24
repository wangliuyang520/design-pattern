import java.util.Iterator;

public class SkyworthTelevison extends Television {
    private Object[] obj=new Object[]{"CCTV1","浙江卫视","湖南卫视","CCTV3","CCTV8"};

    @Override
    protected TVIterator createIterator() {
        return new SkyworthIterator();
    }
    private class SkyworthIterator implements TVIterator {

        private int currentIndex=-1;
        @Override
        public boolean hasNext() {
            if(currentIndex<obj.length-1){
                currentIndex++;
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return obj[currentIndex];
        }

        @Override
        public Object privious() {
            return obj[currentIndex-1];
        }

        @Override
        public Object getFirst() {
            return obj[0];
        }

        @Override
        public Object getLast() {
            return obj[obj.length-1];
        }

        @Override
        public Object getCurrent() {
            return obj[currentIndex];
        }

        @Override
        public Object setChannel(int index) {
            return obj[index];
        }

        @Override
        public boolean isLast() {
            return currentIndex==obj.length-1;
        }

        @Override
        public boolean isFirst() {
            return currentIndex==0;
        }
    }
}
