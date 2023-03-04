package ArrayTasks;
public class MathUtils {
    public static double average(int a, int b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        System.out.println(average(2,1));
    }
}
// find the bug
// package ArrayTasks;

// public class MathUtils {
//     public static double average(int a, int b) {
//         return (a + b) / 2;
// how to cast to double to get the correct result?

//     }
