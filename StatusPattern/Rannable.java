public class Rannable extends AThreadStatus {
    public Rannable() {
        System.out.println("就绪状态");
        status=AThreadStatus.RUNNABLE;
    }

    public void getCpu(ThreadContext tc){
        System.out.println("调用getCpu方法");
        if(tc.status.status==AThreadStatus.RUNNABLE){
            tc.setStatus(new Running());
        }else{
            System.out.println("状态错误，无法调用");
        }
    }
}
