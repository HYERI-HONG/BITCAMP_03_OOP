package domain;
/**
 로또볼 추첨
 1~45까지 랜덤숫자
 볼 갯수는 6개
 출력은 [5, 30, 45, 34,10 ]
 * */
public class Lotto {
	int money, turn;
	String result,line;
	
	public void setMoney(int money) {
		this.money=money;
	}
	public void setTurn() {
		turn = money/1000;
	}
	public void setBall() {
		line ="";
		for(int i=0; i<6; i++) {
			line += (int)(Math.random()*45) + "  ";
		}
	}
	public void setResult() {
		 setTurn();
		 result="";
		for(int i=0; i<turn; i++) {
			setBall();
			result +=line+"\n";
		}
	}
	public int getTurn() {
		return turn;
	}
	public String getResult() {
		setResult();
		return result;
	}
	

}
