public class ComplexNum {
// Z = a + bi
private int Rez; // ʵ��
private int Imz; // �鲿

public int getRez() {
return Rez;
}

public void setRez(int rez) {
Rez = rez;
}

public int getImz() {
return Imz;
}

public void setImz(int imz) {
Imz = imz;
}

public ComplexNum(){}

// ���캯��
public ComplexNum(int rez, int imz) {
super();
Rez = rez;
Imz = imz;
}

// ��
public static void plus(ComplexNum a,ComplexNum b){
ComplexNum temp = new ComplexNum();
temp.setRez(a.getRez()+b.getRez());
temp.setImz(a.getImz()+b.getImz());
display(temp);
}

// ��
public static void minus(ComplexNum a,ComplexNum b){
ComplexNum temp = new ComplexNum();
temp.setRez(a.getRez()-b.getRez());
temp.setImz(a.getImz()-b.getImz());
display(temp);
}

// ��ʾ
public static void display(ComplexNum a){
StringBuffer sb = new StringBuffer();
sb.append(a.getRez());
if(a.getImz()>0){
sb.append("+"+a.getImz()+"i");
}else if(a.getImz()<0){
sb.append(a.getImz()+"i");
}
System.out.println(sb.toString());
}

public static void main(String[] args) {
ComplexNum a = new ComplexNum(4, 3); //���췽��1
ComplexNum b = new ComplexNum(); // ���췽��2
b.setRez(5);
b.setImz(3);

plus(a, b); //��
minus(a, b); //��

display(a);//��ʾ
}
} 