package week2.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=13;
		boolean val=false;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				val=true;
				break;
			}
		}
		if(val==false)System.out.println(num+" is a Prime number");
		else System.out.println(num+" is not a Prime number");
	}

}
