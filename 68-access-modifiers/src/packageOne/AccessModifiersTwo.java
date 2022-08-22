package packageOne;

public class AccessModifiersTwo {
	public static void main(String[] args) {
		System.out.println("---Default Access Modifiers----");
		AcessModifiersOne one=new AcessModifiersOne();
		System.out.println(one.num);
		System.out.println(one.returnNumber());
		System.out.println("---Access to same package and within class----\n");
		System.out.println("------Public  Access Modifiers----");
		System.out.println(one.sum);
		System.out.println(one.returnSum());
		System.out.println("------Protacted  Access Modifiers----");
		System.out.println(one.z);
		System.out.println(one.returnZ());
		System.out.println("---Access to same package and within class----\n");
	}
}
