package com.listoperations;
import com.sun.tools.javac.util.List;


public class ListManager {
         
	public void addElement(java.util.List<Integer> list, int element) {
		list.add(element);
	}
	
	public boolean removeElement(java.util.List<Integer> list, int element) {
	
		return list.remove(Integer.valueOf(element));
	}
	
	public int getSize(java.util.List<Integer> list) {
		
		return list.size();
		
	}
}
//ddfdfdfdf