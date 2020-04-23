public class Running  extends AThreadStatus{
    public Running() {
        System.out.println("运行状态");
        status=AThreadStatus.RUNNING;
    }

    public void stop(ThreadContext tc){
        System.out.println("调用stop方法");
        if(tc.status.status==AThreadStatus.RUNNING){
            tc.setStatus(new BlockThread());
        }else{
            System.out.println("状态错误，无法调用");
        }
    }
    public void suspend(ThreadContext tc){
        System.out.println("调用suspend方法");
        if(tc.status.status==AThreadStatus.RUNNING){
            tc.setStatus(new BlockThread());
        }else{
            System.out.println("状态错误，无法调用");
        }
    }
}
