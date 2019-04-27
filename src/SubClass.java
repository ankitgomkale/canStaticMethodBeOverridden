
public class SubClass extends SuperClass {
	public String localVariable = "string shadowed int of super";
	public String instanceMethod() {
		return "SUBCLASS -> INSTANCE";
	}
	
	public static String staticMethod() {
		return "SUBCLASS -> STATIC";
	}
}
