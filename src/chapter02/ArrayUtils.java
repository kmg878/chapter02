package chapter02;

import java.lang.reflect.Array;

public class ArrayUtils {
	
	public static double[] intToDouble(int[] arrayInt){
		if(arrayInt==null){
			return null;
		}
		
		int length=arrayInt.length;
		double[] arrayDouble = new double[arrayInt.length];
		for(int i=0;i<length;i++){
			arrayDouble[i]=arrayInt[i];
		}
		return arrayDouble;
	}

	public static int[] intToInt(int[] arrayInt){
		if(arrayInt==null){
			return null;
		}
		
		int length=arrayInt.length;
		int[] arrayIntInt = new int[arrayInt.length];
		for(int i=0;i<length;i++){
			arrayIntInt[i]=arrayInt[i];
		}
		return arrayIntInt;
	}
	
	public static int[] concat(int[] arrayInt2,int[] arrayInt3){
		if(arrayInt2==null||arrayInt3==null){
			return null;
		}
		
		int[] arrayInt4=new int[arrayInt2.length+arrayInt3.length];
		for(int i=0;i<arrayInt2.length;i++){
			arrayInt4[i]=arrayInt2[i];
		}
		for(int i=0;i<arrayInt3.length;i++){
			arrayInt4[i+arrayInt2.length]=arrayInt3[i];
		}
		return arrayInt4;
	}
	

}
