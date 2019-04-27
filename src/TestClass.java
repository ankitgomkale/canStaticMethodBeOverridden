
public class TestClass {

	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		System.out.println("superClass.instanceMethod():");
		superClass.instanceMethod();
		System.out.println("superClass.staticMethod():");		
		superClass.staticMethod();
		System.out.println();

		
		SuperClass subClassGeneric = new SubClass();
		System.out.println("subClassGeneric.instanceMethod():");
		subClassGeneric.instanceMethod();
		System.out.println("subClassGeneric.staticMethod():");
		subClassGeneric.staticMethod();
		System.out.println();
		
		SubClass subClass = new SubClass();
		System.out.println("subClass.instanceMethod():");
		subClass.instanceMethod();
		System.out.println("subClass.staticMethod():");
		subClass.staticMethod();
		System.out.println();

	}

}
