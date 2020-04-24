public class TCLTelevision extends Television {
    Object[] obj = new Object[]{"江苏卫视", "浙江卫视", "CCTV7", "湖北卫视", "科教频道", "长虹卫视"};

    @Override
    protected TVIterator createIterator() {
        return new TCLIterator();
    }

    private class TCLIterator implements TVIterator {

        private int currentIndex = -1;

        @Override
        public boolean hasNext() {
            if (currentIndex < obj.length) {
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
            return obj[currentIndex - 1];
        }

        @Override
        public Object getFirst() {
            return obj[0];
        }

        @Override
        public Object getLast() {
            return obj[obj.length - 1];
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
            return currentIndex == obj.length - 1;
        }

        @Override
        public boolean isFirst() {
            return currentIndex == 0;
        }
    }
}
