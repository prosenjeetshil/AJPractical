package JavaGenerics;

class Main1<T> {
	T obj;
	void addDetails(T obj) {
		this.obj = obj;
	}
	T getDetails() {
		return obj;
	}
}

public class JavaGenericsExample {

	public static void main(String[] args) {
		Main1<Integer> rollno = new Main1<Integer>();
		rollno.addDetails(125);
		Main1<String> name = new Main1<String>();
		name.addDetails("Prosenjeet Shil");
		System.out.println("Roll no: " + rollno.getDetails());
		System.out.println("Name: " + name.getDetails());
		
	}

}
