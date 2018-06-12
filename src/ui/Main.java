package ui;

import javax.swing.JOptionPane;
import domain.BMI;
import domain.Grade;
import domain.Salary;
import domain.Lotto;

/**
 * 얼마치를 구입하십니까? 5200 ->최대 5000원, 1000원에 1줄씩
 */
public class Main {

	public static void main(String[] args) {

		BMI[] arr = new BMI[2];
		BMI bmi = null;

		Grade[] arr1 = new Grade[2];
		Grade grade = null;

		Salary[] arr2 = new Salary[6];
		Salary salary = null;

		Lotto lotto =null;
		int count = 0, count1 = 0, count2 = 0;

		while (true) {
			
			switch (JOptionPane.showInputDialog(
					"0 : End\n" + "1 : BMI\n" + "2 : BMI Output\n" + "3 : Grade\n" + "4 : Grade Output\n"
							+ "5 : Salary\n" + "6 : Salary Output\n" + "7 : Lotto Input\n")) {
			case "0":
				return;
			case "1":
				bmi = new BMI();
				bmi.setName(JOptionPane.showInputDialog("Name : "));
				bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Height : ")));
				bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("Weight : ")));
				bmi.setResult();
				arr[count] = bmi;
				count++;
				break;
			case "2":
				String output = "";
				for (int i = 0; i < arr.length; i++) {
					output += arr[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, output);
				break;
			case "3":
				grade = new Grade();
				grade.setName(JOptionPane.showInputDialog("이름 : "));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어 점수 : ")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어 점수 : ")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학 점수 : ")));
				grade.setTotal();
				grade.setAvg();
				grade.setGrade();
				arr1[count1] = grade;
				count1++;
				break;
			case "4":
				String output1 = "";
				for (int i = 0; i < count1; i++) {
					output1 += arr1[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, output1);
				break;
			case "5":
				salary = new Salary();
				salary.setName(JOptionPane.showInputDialog("이름 : "));
				salary.setDept(JOptionPane.showInputDialog("부서명 :"));
				salary.setSal(Integer.parseInt(JOptionPane.showInputDialog("본봉 : ")));
				salary.setBonus(Integer.parseInt(JOptionPane.showInputDialog("수당 : ")));
				salary.setSum();
				arr2[count2] = salary;
				count2++;
				break;
			case "6":
				String output2 = "";
				for (int i = 0; i < count2; i++) {
					output2 += arr2[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, output2);
				break;
			case "7":
				lotto = new Lotto();
				lotto.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마를 구입하시겠습니까?")));
				JOptionPane.showMessageDialog(null, lotto.getResult());
				break;
			default:
				break;
			}
		}
	}
}
