package array;

import java.util.HashMap;


public class ZeroesAtEnd {
public int[] zeroes(int[] arr) {
	int[] newarray=new int[arr.length];
	HashMap<Integer,Integer> in=new HashMap<>() ;
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			in.put(count, arr[i]);
			count++;
		}
	}
	for(int i=0;i<in.size();i++) {
		newarray[i]=in.get(i);
	}
	
	
	return newarray;
	
}

public int[] zeros(int arr[]) {
	int index=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			arr[index++]=arr[i];
		}
	}
	for(int i=index;i<arr.length;i++) {
		arr[i]=0;
	}
	
	return arr;
}
}
