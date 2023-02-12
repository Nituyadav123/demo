package Palindrome_No;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Logic {

	public static void main(String[] args) {
int num=123456789;
int even_Count=0;
int odd_count=0;
while(num>0) {
	int r=num%10;
	if (r%2==0) {
	even_Count++;
	
	}
	else {
		odd_count++;
	}
	num=num/10;
}
System.out.println("The number of even count"+""+even_Count+"\nThe number of odd count"+""+odd_count);	
		
		
		
		
		
		
		
		
		
	}

}
