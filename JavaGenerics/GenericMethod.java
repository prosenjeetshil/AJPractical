package JavaGenerics;

public class GenericMethod {
	public static <T> void printGenericArray(T[] items) {
		for(T item: items) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] int_Array= {69,125,131};
		Character[] char_Array = {'P','R','O','S','E','N','J','E','E','T'};
		System.out.println("Integer Array contents: ");
		printGenericArray(int_Array);
		System.out.println("Character Array contents: ");
		printGenericArray(char_Array );
	}
}
