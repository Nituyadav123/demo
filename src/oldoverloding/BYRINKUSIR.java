package oldoverloding;

public class BYRINKUSIR {

	
		// TODO Auto-generated method stub
 int add(int a,int b) {
	int sum=a+b;
	return sum;
}
	int add(int a,int b,int c) {
		return a + b +  c;
	}
		int add(int a, int b, int c, int d){
			return a + b+ c+ d;
		}
		int add(int a ,int b,int c, int d, int e) {
		return a+ b+c+d+e;	
		}
		
		public static void main(String []args) {
			BYRINKUSIR obj=new BYRINKUSIR();
		int sum=obj.add(10,20);
		System.out.println("The sum of two numbers ="+sum);
		System.out.println("The sum of two numbers ="+obj.add(10, 20,40));
		System.out.println("The sum of two numbe ="+obj.add( 5,10,15 ,20));
		System.out.println("The sum of two numbe ="+ obj.add(2,4,6,8));
		
		
		
	}

}
