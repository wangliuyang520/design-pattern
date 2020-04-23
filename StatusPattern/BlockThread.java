public class BlockThread extends AThreadStatus{
    public BlockThread() {
        System.out.println("阻塞状态");
        status=AThreadStatus.BLOCK;
    }

    public void resume(ThreadContext tc){
        System.out.println("调用stop方法");
        if(tc.status.status==AThreadStatus.BLOCK){
            tc.setStatus(new DiedThread());
        }else{
            System.out.println("状态错误，无法调用");
        }
    }
}
