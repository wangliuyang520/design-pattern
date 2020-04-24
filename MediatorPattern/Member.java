public abstract  class Member {
    String name;
    public  AChatroom chatroom;

    public Member(String name) {
        this.name = name;
    }

    public void setChatroom(AChatroom chrtRoom) {
        this.chatroom = chrtRoom;
    }

    public String getName(){
        return name;
    }
    public abstract void sendText(String to,String message);
    public abstract void sendImage(String to,String message);
    public abstract void recieveText(String from,String message);
    public abstract void recieveImage(String from,String message);
}
