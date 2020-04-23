public class DiedThread extends AThreadStatus {
    public DiedThread() {
        System.out.println("死亡状态");
        status=AThreadStatus.DIED;
    }
}
