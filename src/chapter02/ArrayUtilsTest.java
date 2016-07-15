package chapter02;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayInt = {10,20,30,40,50};
		
		//1.ArrayUtils.intToDouble(...)테스트
		double[] arrayDouble = ArrayUtils.intToDouble(arrayInt);
		for(double d :arrayDouble){
			System.out.println(d);
		}
		
		//2.ArrayUtils.intToInt(...)테스트
		int[] arrayIntInt = ArrayUtils.intToInt(arrayInt);
		for(int i:arrayIntInt){
			System.out.println(i);
		}
		
		//3.ArrayUtils.concat(...)테스트
		int[] arrayInt2={1,2,3};
		int[] arrayInt3={4,5,6};
		int[] arrayInt4=ArrayUtils.concat(arrayInt2,arrayInt3);
		for(int i:arrayInt4){
			System.out.println(i);
		}

	}

}
