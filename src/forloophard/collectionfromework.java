package forloophard;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Collectors;

import javax.swing.JList;

public class collectionfromework {

	public static void main(String[] args) {
	

		/*Collection clc = new ArrayList();
		clc.add("sumit");
		clc.add("amit");
		clc.add("suman");
		clc.add("neha");
		clc.add(null);
		clc.add("neha");
		System.out.println(clc);
		clc.add("A");
		clc.add("B");
		System.out.println(clc);
		System.out.println(clc.remove("neha"));
		System.out.println(clc.remove("mohan"));

		System.out.println(clc.hashCode());
		System.out.println(clc.addAll(clc));
		System.out.println(clc.retainAll(clc));
		System.out.println(clc.size());

		Stack gStack = new Stack();
		gStack.add("A");
		gStack.add("B");
		gStack.add("C");
		gStack.add("0");
		gStack.add("p");
		System.out.println(gStack);
		System.out.println(gStack.addAll(gStack));
		System.out.println(gStack.clone());
		System.out.println(gStack.containsAll(gStack));
		System.out.println(gStack.remove(gStack));
		System.out.println(gStack.peek());
		System.out.println(gStack.pop());
		System.out.println(gStack.push(clc));

		Vector objVector = new Vector();
		objVector.add("jh");
		objVector.add("jl");
		objVector.add("kk");
		objVector.add("ll");
		objVector.add("tt");
		System.out.println(objVector);
		objVector.add("dd");
		System.err.println(objVector.add(objVector));
		System.out.println(objVector.clone());
		System.err.println(objVector.firstElement());
		System.err.println(objVector.lastElement());
		System.err.println(objVector.toString());
		System.out.println(objVector.equals(objVector));
		System.out.println(objVector.hashCode());
		System.out.println(objVector.spliterator());*/
 LinkedList ka= new LinkedList();
 ka.add("aman");
 ka.add("kajal");
 System.err.println(ka);
 System.out.println(ka.poll());///upar vala lata h
 
 System.err.println(ka.peek());////niche vala lata h
// Collections jCollections=new ArrayList();
// SortedSet<String> sortedSet=new TreeSet<String>();
//
// SortedSet mMSet=new SortedSet();///Child
// SortedSet Set=new TreeSet();//sorted set ke pass ADD method nhi h 
Set nSet=new TreeSet();
nSet.add("Nitu");
 nSet.add("Ritu");
 System.out.println(nSet);
	}

}