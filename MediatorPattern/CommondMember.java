public class CommondMember extends  Member {
    public CommondMember(String name) {
        super(name);
    }

    public void sendText(String to, String message){
        System.out.print("普通会员发送消息、");
        chatroom.sendText(this.getName(),to,message);
    }
    @Override
    public void recieveText(String from, String message) {
        System.out.println(from+"发送文本说："+message);
    }

    @Override
    public void sendImage(String to, String message) {
        System.out.println("普通会员不能发送图片");
    }

    @Override
    public void recieveImage(String from, String message) {
        System.out.println(from+"发来图片"+message);
    }
}
