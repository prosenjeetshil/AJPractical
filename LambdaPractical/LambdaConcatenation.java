package LambdaPractical;

public class LambdaConcatenation {
    public static void main(String[] args) {
        StringConcat concatenation = (a, b) -> a + b;

        String str1 = "Hello, ";
        String str2 = "World!";
        String result = concatenation.concat(str1, str2);
        
        System.out.println("String 1: "+str1);
        System.out.println("String 2: "+str2);
        System.out.println("Concatenated String: " + result);
    }

    @FunctionalInterface
    interface StringConcat {
        String concat(String a, String b);
    }
}
