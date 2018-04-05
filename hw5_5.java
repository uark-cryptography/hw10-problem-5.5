import java.lang.Math;

public class hw5_5{
	
	static void checkForSqMod(int index, double result, int p){
		for(int i = 0; i < p; i++){							 //square each integer less than p
			if((i*i)%p == result){                           //if i^2 mod p = result 
				System.out.print("(" +index +", "+ i+"), "); //then there is a point at
			}												 //(index, i)
		}
	}
	
	static void solveForX(int a, int b, int c, int p){  //solve for X given equation and index
		System.out.print("{");
		for(int i = 0; i < p; i++ ){
			double result = (Math.pow(a*i,3)+(b*i)+c)%p;
			checkForSqMod(i, result, p);
		}
		System.out.println("}");
	}
	
	public static void main(String[] args){
		
		System.out.print("a) ");
		solveForX(1,3,2,7);    			//(1)X^3+(3)X+(2) over F(7)
		System.out.print("b) ");
		solveForX(1,2,7,11);			//(1)X^3+(2)X+(7) over F(11)
		System.out.print("c) ");
		solveForX(1,4,5,11);			//(1)X^3+(4)X+(5) over F(11)
		System.out.print("d) ");
		solveForX(1,9,5,11);			//(1)X^3+(9)X+(5) over F(11)
		System.out.print("e) ");
		solveForX(1,9,5,13);			//(1)X^3+(9)X+(5) over F(13)
		
	}

}