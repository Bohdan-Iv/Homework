public class First {
    public static void main(String[] args) {
        // Lesson №1
        // Exercise №1
        int a = 1;
        int b = 2;
        int c = 3;
        //1_1  a+b-c*b
        double exercise1_1 = a + b - c * b;
        //1_2  (a+1)*(c-1)/b+c
        double exercise1_2 = (a + 1) * ((double) (c - 1) / b) + c;
        //1_3  b+c+1*a/b+1
        double exercise1_3 = b + c + 1 * ((double) a / b) + 1;
        //1_4  a-12+b*2-c+1
        double exercise1_4 = a - 12 + b * 2 - c + 1;

        System.out.println("exercise1_1=" + exercise1_1);
        System.out.println("exercise1_2=" + exercise1_2);
        System.out.println("exercise1_3=" + exercise1_3);
        System.out.println("exercise1_4=" + exercise1_4);

        // Exercise №2
        //2_1  2+2*2=6
        //2_2  (2+2)*2=8
        //2_3  10-2*2=6
        //2_4  12+12-4*2=16

        System.out.println("exercise2_1 - " + "2+2*2=6");
        System.out.println("exercise2_2 - " + "(2+2)*2=8");
        System.out.println("exercise2_3 - " + "10-2*2=6");
        System.out.println("exercise2_4 - " + "12+12-4*2=16");

        // Exercise №3
        char a1 = 23;
        char b1 = 87;
        char c1 = 101;
        char d1 = 11;

        System.out.println("exercise3_1 - " + a1);
        System.out.println("exercise3_2 - " + b1);
        System.out.println("exercise3_2 - " + c1);
        System.out.println("exercise3_4 - " + d1);


    }
}
