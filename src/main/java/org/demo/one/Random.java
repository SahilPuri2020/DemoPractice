package org.demo.one;

public class Random {

    public static void main(String[] args) {
    ComplexityDemo(5);

}

    public static void ComplexityDemo(int n) {
        for (int i = 0; i < n; i++)
            System.out.println("First Loop");
        for (int j = 0; j < n; j++)
            System.out.println("Second Loop");
    }
}
