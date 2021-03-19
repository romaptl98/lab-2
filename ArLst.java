/**
*Name-Roma Patel
*Description-: a Java program to convert an ArrayList to an array.
*Date:16/03/2021
*/



import java.util.List;
import java.util.ArrayList;

public class ArLst {
	public static void main(String[] args) {
		List<Integer>num1=new ArrayList<Integer>();
		num1.add(10);
		num1.add(20);
		num1.add(30);
		
		Object[] object=num1.toArray();
		for(Object ob:object)
			System.out.println(ob+" ");

		
		
		
	}
}
