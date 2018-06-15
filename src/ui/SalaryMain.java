package ui;

import domain.*;
import javax.swing.JOptionPane;

enum SalaryButt{
	EXIT,
	INTERNSHIP,
	STAFF,
	OWNER
}
public class SalaryMain {
	public static void main(String[] args) {
		SalaryButt[] buttons= {
				SalaryButt.EXIT,
				SalaryButt.INTERNSHIP,
				SalaryButt.STAFF,
				SalaryButt.OWNER
		};
		Internship intern = null;
		while(true) {
			SalaryButt select=(SalaryButt)JOptionPane.showInputDialog(null,"급여 계산기\n","0 : 종료\n1 : 인턴십\n2 : 정직원\n3 : 이사회",JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[1]);
			switch(select) {
			case EXIT :
				return;
			case INTERNSHIP :
				intern = new Internship(JOptionPane.showInputDialog("이름 :"),JOptionPane.showInputDialog("기본급 : "));
				JOptionPane.showMessageDialog(null,intern.toString());
				break;
			case STAFF:
				break;
			case OWNER:
				break;
			}
		}
	}

}
