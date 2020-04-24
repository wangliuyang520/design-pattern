import java.util.Hashtable;

public class ChatGroup extends AChatroom{
    public Hashtable members = new Hashtable<>();

    @Override
    public void register(Member member) {
        if(!members.contains(member)){
            members.put(member.getName(),member);
            member.setChatroom(this);
        }
    }

    @Override
    public void sendText(String from, String to, String message) {
        Member member = (Member)members.get(to);
        String newMessage = message.replaceAll("打","*");
        member.recieveText(from,newMessage);
    }

    @Override
    public void sentImage(String from, String to, String message) {
        Member member = (Member)members.get(to);
        if(message.length()>15)
            System.out.println("图片太大，发送失败");
        member.recieveImage(from,message);
    }
}
