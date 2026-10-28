class Calculator {

    void add (int a, int b) { System.out.printf("%d + %d = %d\n",a,b,a+b); }
    void add (int a, int b, int c) { System.out.printf("%d + %d + %d = %d\n",a,b,c,a+b+c); }
    void add (int a, int b, int c, int d) { System.out.printf("%d + %d + %d + %d = %d\n",a,b,c,d,a+b+c+d); }

    void add (double a, double b) { System.out.printf("%.2f + %.2f = %.2f\n",a,b,a+b); }
    void add (double a, double b, double c) { System.out.printf("%.2f + %.2f + %.2f = %.2f\n",a,b,c,a+b+c); }
    void add (double a, double b, double c, double d) { System.out.printf("%.2f + %.2f + %.2f + %.2f = %.2f\n",a,b,c,d,a+b+c+d); }
}

public class A3_MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(5,4);
        c.add(5,4,6);
        c.add(5,4,6,10);

        c.add(3.4,1);
        c.add(3.4,10.1, 11.3);
        c.add(0.4,10.1, 11.3, 4.5);
    }
}
