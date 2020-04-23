public class NewThread extends AThreadStatus {
    public NewThread() {
        System.out.println("新建线程");
        status=AThreadStatus.NEWSTART;
    }

    public void start(ThreadContext tc){
    System.out.println("调用start方法");
    if(tc.status.status==AThreadStatus.NEWSTART){
        tc.setStatus(new Rannable());
    }else{
        System.out.println("状态错误，无法调用");
    }
}
}
