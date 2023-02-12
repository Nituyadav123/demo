package Collectionfromework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class cursors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Vector vector = new Vector(); vector.add("Nitu"); vector.add("Ritu");
		 * vector.add("rita"); vector.add("Gita"); vector.add("Rima");
		 * vector.add("Nilu"); vector.add("Nitu");//// System.out.println(vector);
		 */

//		LinkedList obj = new LinkedList();
//		obj.add("Ram");
//		obj.add("Rohit");
//		obj.add("Rama");
//		obj.add("Roshan");
//		obj.add("Rahul");
//		obj.add("Rakesh");
//		System.err.println(obj);
//		
//		ListIterator ll = obj.listIterator();
//		while (ll.hasNext())
//	
//	System.out.println(ll.next());
//	  
//			System.out.println(ll.previous());
//	

//		String string=(String)ll.next();
//			if (string.equals("Ram")) {
//				
//			}
//	ll.remove();
//		}
//		
//		System.out.println(obj);
//
//		}
//		System.out.println(ll.previous());
//		System.out.println(ll.previous());

		List l = new ArrayList();
		l.add(10);
		l.add("kamal");
		l.add("lala");

		Iterator p = l.iterator();
		while (p.hasNext()) {
			System.err.println();
		}

	}
}
