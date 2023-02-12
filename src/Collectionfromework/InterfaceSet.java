package Collectionfromework;

//import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.checkerframework.checker.units.qual.Prefix;
import org.checkerframework.checker.units.qual.m;
import org.checkerframework.common.reflection.qual.NewInstance;

//import io.opentelemetry.context.internal.shaded.AbstractWeakConcurrentMap.WeakKey;

public class InterfaceSet {

	public static void main(String[] args) {

	
	/*	HashSet obj=new HashSet();
		obj.add("aman");
		obj.add("nitu");
		obj.add("kajal");
		obj.add("karishma");
		obj.add("akash");
		obj.add("ritu");
		obj.add("mr.suresh");
		obj.add("kajal");
		obj.add(null);
		/*obj.add(new m() {
			
			@Override
			public Class<? extends Annotation> annotationType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Prefix value() {
				// TODO Auto-generated method stub
				return null;
			}
		};("ram")  );
//		obj.add(null);
		System.out.println(obj);
		System.out.println(obj.add("kajal"));*/
		
//	LinkedHashSet ff = new LinkedHashSet();
//	ff.add("hello");
//	ff.add("hey");
//	ff.add("hii");
//	ff.add("mohan");
//	ff.add("sunil");
//	System.out.println(ff);
		
		Set obj = new LinkedHashSet();
		obj.add("akash");
		obj.add("bb");
		System.out.println(obj);
		
	
	}
}