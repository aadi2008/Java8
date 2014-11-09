package collection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		
		List<Integer> list  = new ArrayList<Integer>();
		
		//Adding Elemetns
		
		list.add(40);
		list.add(20);
		list.add(10);
		list.add(40);
		
		//Getting Eleements
		
		Collections.sort(list);
		System.out.println("Elemetn 0" + list.get(0));
		
		//Iterate through for loop
		
		System.out.println("Iteration 1");
		
		for (int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		
		//Interate through for loop
		System.out.println("Iteration 2");
		for(Integer value : list){
			System.out.println(value);
		}
		
		/*Date date1 = Calendar.getInstance().getTime();
		Date date2 = Calendar.getInstance().getTime();
		
		long diffInMillies = date2.getTime() - date1.getTime();*/

	  	
//		System.out.println( getDateDiff(diffInMillies,TimeUnit.MILLISECONDS));
		
		list.clear();
		
		for(int i=0;i<10000000;i++){
			list.add(i);
		}
		
		Date date1 = Calendar.getInstance().getTime();
		/*list.add(0, 1000000);
		list.add(100000, 1000000);
		list.add(200000, 1000000);*/
		list.add(1);
		list.remove(100000);
		Date date2 = Calendar.getInstance().getTime();
		
		System.out.println("Total Size " + list.size());
		
        System.out.println("Total time taken to add element at particular position " + (date2.getTime() - date1.getTime()));
        
        System.out.println("This is the change for GitHub");
		
	}
	


}
