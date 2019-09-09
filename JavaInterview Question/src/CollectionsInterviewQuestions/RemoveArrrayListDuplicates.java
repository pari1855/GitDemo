package CollectionsInterviewQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//Remove Duplicates Using ArrayLIST()
public class RemoveArrrayListDuplicates {
//Fuction to Remove Duplicates from ArrayList
	public static <E> ArrayList<E> removesDuplicates(ArrayList<E> list) {
		ArrayList<E> newList = new ArrayList();
	for(E element:list) {
		if(!newList.contains(element)) {
			newList.add(element);
		}
	}
	return newList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<String>(Arrays.asList("a","abc","a","c","abc"));
		System.out.println(list);
		ArrayList al=removesDuplicates(list);
		System.out.println(al);
		
	}

}
