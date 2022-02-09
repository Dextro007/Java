import java.util.Scanner;
import java.lang.Math;

public class hackerRank {
    public static void helloWorld() {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    public static void stdInOut() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scan.close();

    }

    public static void stdInOut2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double f = scan.nextDouble();
        String s1 = scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + f);
        System.out.println("Int: " + i);
        scan.close();
    }

    public static void javaDatatypes() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= -(Math.pow(2, 15)) && x <= (Math.pow(2, 15) - 1)) {
                    System.out.println("* short");
                }
                if (x >= -(Math.pow(2, 31)) && x <= (Math.pow(2, 31) - 1)) {
                    System.out.println("* int");
                }
                if (x >= -(Math.pow(2, 63)) && x <= (Math.pow(2, 63) - 1)) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }


        }
    }

    public static void javaEndOfLine(){
        Scanner scan = new Scanner(System.in);
        String str = null;
        int cnt =0;
        while((str = scan.nextLine())!= null){
            System.out.println(++cnt + " str");
        }


    }
}

