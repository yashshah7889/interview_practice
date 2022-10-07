//Write a Java program to create a new array list, add some colors (string) and print out the collection.

package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question2 {
	List<String> colors=new ArrayList<String>();
	public void addcolors(String name) {
		colors.add(name);
	}
	public void showColors() {
		for(int i=0;i<colors.size();i++) {
			System.out.println(colors.get(i));
		}
		//using for each
		for(String elements :colors) {
			System.out.println(elements);
		}
		//using iterator
		Iterator<String> iter=colors.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()+" ");
		}
	}
	public void removecolors(String name) {
		colors.remove(name);
	}
	
	public void addFirst(String name) {
		colors.add(0, name);
	}
	
	public void addatindex(int index,String name) {
		colors.add(index, name);
	}
	
	public void update(int index,String name) {
		colors.set(index, name);
	}
	
	
}
