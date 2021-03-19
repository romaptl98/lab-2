/**
*Name-Roma Patel
*Description- sorted list of product name 
*Date:16/03/2021
*/




import java.util.*;  
import java.util.stream.*;  
public class SortedList 
{ 
	
public static void main(String[] args)   
{   
List<String> slist = Arrays.asList("pen", "book", "pencil", "desk", "esaser");  
List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());     
sortedList.forEach(System.out::println);  
}  
}  