public class Client {
    public static void main(String[] args) {
        Member member1 = new CommondMember("小红");
        Member member2 = new CommondMember("小名");
        Member member3 = new DiamondMember("小强");
        Member member4 = new DiamondMember("小王");


        AChatroom happChatroom = new ChatGroup();
        happChatroom.register(member1);
        happChatroom.register(member2);
        happChatroom.register(member3);
        happChatroom.register(member4);

        member4.sendImage("小强", "杨幂这张照片好看吗");
        member2.sendText("小红", "挺好看的，有眼光");
        member1.sendImage("小强", "杨幂这张照片好看吗");
        member3.sendText("小名", "今天天气很好，打鱼吗？");
    }
}
