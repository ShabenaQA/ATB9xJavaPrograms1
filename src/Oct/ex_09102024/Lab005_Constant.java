package Oct.ex_09102024;

public class Lab005_Constant {
    public static void main(String[] args) {
        final int a = 4;
        // a = 5;   we cannot  change the varaible value which is final within the program again(constant)
        System.out.println(a);
        System.out.println("a is the final value which is constant");
        char grade = 'A';
        grade = 'B';
        System.out.println(grade);
        final float PI = 3.14f;
        System.out.println(PI);
    }
}