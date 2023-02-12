package ArrayAndArraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

public class Array {

	public static void main(String[] args) {

//		String s[]=new String[3];
//		int kk[]= {2,4,6,7};
//		kk.clone();
//		kk.notify();
//		kk.getClass();
//		kk.toString();
//		for (int i = 0; i < kk.length; i++) {
//					System.out.println(kk[i]);

//		String ss[] = new String[3];
//		ss[0] = "Aman";
//		ss[1] = "Akash";
//		ss[2] = "Anupama";
//		ss.equals(ss);
//		for (int j = 0; j < ss.length; j++) {
//
//			System.out.println(ss[j]);

		ArrayList<String> hh = new ArrayList<String>();
		hh.add("aman");
		hh.add("nitu");
		System.out.println(hh);
		TreeSet<String> set = new TreeSet<String>();
		set.add("seema");
		set.add("ritu");
		set.add("sneha");
		set.add("seema");
		System.out.println(set);

		Set<String> objSet = new HashSet<String>();
		objSet.add("Reetu");
		objSet.add("neetu");
		objSet.add("Reetu");
		System.out.println(objSet);

		List<String> h = new ArrayList<String>();
		h.add("aman");
		h.add("aman");

//		objSet.contains("Neelam");

	}

}
