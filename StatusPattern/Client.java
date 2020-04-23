public class Client {
    public static void main(String[] args) {
        ThreadContext tc = new ThreadContext(new NewThread());
tc.start();
tc.getCpu();
tc.stop();
tc.resume();
    }

}
