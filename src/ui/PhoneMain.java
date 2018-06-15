package ui;
import javax.swing.JOptionPane;
import domain.*;
enum Butt1{
	EXIT,
	HOMEPHONE,
	CELLPHONE,
	IPHONE,
	GALAXYPHONE
}
public class PhoneMain {
	public static void main(String[] args) {
		Butt1[] buttons = {
				Butt1.EXIT,
				Butt1.HOMEPHONE,
				Butt1.CELLPHONE,
				Butt1.IPHONE,
				Butt1.GALAXYPHONE
				
		};
		Phone phone =null;
		
		while(true) {
			Butt1 select = (Butt1)JOptionPane.showInputDialog(null,"메뉴","0 : 종료\n1 : 집전화기\n2 : 휴대폰\n3 : 아이폰 ",
					JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[1]);
			switch(select) {
			case EXIT :
				return;
			case HOMEPHONE :
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름 : "));
				//phone.name=JOptionPane.showInputDialog("이름 : "); -> 이렇게 사용하면 보안상의 문제 발생
				phone.setPhoneNum(JOptionPane.showInputDialog("연락처 : "));
				phone.setCall(JOptionPane.showInputDialog("대화 내용 : "));
				
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case CELLPHONE:
				phone = new CellPhone();
				phone.setName(JOptionPane.showInputDialog("이름 : "));
				phone.setPhoneNum(JOptionPane.showInputDialog("연락처 : "));
				phone.setCall(JOptionPane.showInputDialog("대화 내용 : "));
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case IPHONE:
				phone = new IPhone();
				phone.setName(JOptionPane.showInputDialog("이름 : "));
				phone.setPhoneNum(JOptionPane.showInputDialog("연락처 : "));
				((IPhone) phone).setData(JOptionPane.showInputDialog("문자 내용 : "));
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case GALAXYPHONE:
				phone=new GalaxyPhone();
				phone.setName(JOptionPane.showInputDialog("이름 : "));
				phone.setPhoneNum(JOptionPane.showInputDialog("연락처 : "));
				((IPhone) phone).setData(JOptionPane.showInputDialog("문자 내용 : "));
				((GalaxyPhone) phone).setSize();
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
				
			}
			
		}
	}
}
