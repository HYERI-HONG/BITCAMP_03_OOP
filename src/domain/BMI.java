package domain;

public class BMI {

	String name, result;
	double height, weight;

	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setResult(){
		height /= 100;
		double result = weight/((height*height));
		
		if(result<18.5){
			this.result ="저체중";
		}else if(18.5<=result&&result<23){
			this.result ="정상";
		}else if(23<=result&&result<25){
			this.result ="비만 전단계";
		}else if(25<=result&&result<30){
			this.result ="1단계 비만";
		}else if(30<=result&&result<35){
			this.result ="2단계 비만";
		}else{
			this.result ="3단계 비만";
		}
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String getResult() {
		return result;
	}
	public String toString() {
		return String.format("|   %s   |   %f   |   %f   |   %s   |", name,height,weight,result);
	}
	
}
