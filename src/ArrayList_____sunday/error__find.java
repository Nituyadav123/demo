package ArrayList_____sunday;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class error__find {
//  final static void main(String[] args) {
//	private static void name() {
		
	public static void main(String []args) {

//	public static void main(String[] args) {

//	int i =0;	
//	for(System.out.println("hii"); i<=0 ;System.out.print("hello") ) {	
//	
//	}	System.out.print("nitu");
//		
	String n = "utin";
	char a = 0;
	for (int i = n.length() - 1; i >= 0; i--) {
		a = n.charAt(i);
		System.out.print(a);
//	int n=100;
//	if (n%3==0){
//		System.err.println("Number is Even");
//	}else {  
//		System.err.println("Number is odd");
//	}}
//
		////Capital////
		String st=" I am nitu yadav";
		String upperString= st.toUpperCase();
		System.out.println("String in uppercase:"+upperString);
		
		
		/////Small/////
		String stt=" I AM NITU YADAV";
		String upperStringg=stt.toLowerCase();
		System.out.println("String in lowercase:"+upperStringg);
		////replace///
		String String ="ritu nitu";
		  String=String.replaceAll(" ", "");
		System.out.println(String);
		
		/////Vowels/Count/////
		String ddString="Hi I am Nitu Yadav";
		int vcount=0;
		String ccount=" ";
		ddString=ddString.toLowerCase();
		for (int p = 0; p < ddString.length(); p++) {
		char ch=ddString.charAt(p);
		if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.print(ch);
			vcount++;
		} 
		else if((ch>='a'&& ch<='z')) {
			ccount=" ";
		}}
		System.out.println();
		System.out.println("Number of Vowels:"+vcount);

		
		
		String word="Hey my self nitu";
		System.out.println(word);
		char c[]=word.toCharArray();
		for(int k=0; k<c.length; k++) {
			if (c[k]>='a'&& c[k]<='z') {
				c[k]=(char)((int)c[k]-32);
		}}
		System.out.println();
		for (int j=0; j<c.length;j++) {		
	
		System.out.print(c[j]);
		
		}
		
           String objString="@ Hey Nitu 23 $& ";
		 
		
		
	}}}
