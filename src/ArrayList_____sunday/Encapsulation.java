package ArrayList_____sunday;

import net.bytebuddy.asm.Advice.This;

public class Encapsulation {

	private int age = 20;
	private int age1 = 20;
	private int age2 = 20;
	private int age3 = 20;

	public int getage() {
		return age;
	}
public void Setvalue(int age) {
	this.age=age;
	System.out.println(this.age);
}
	public static void main(String[] args) {
		Encapsulation ggEncapsulation=new Encapsulation();
		ggEncapsulation.Setvalue(20);
		
		
		
		
		
		
		
		
	}

}
