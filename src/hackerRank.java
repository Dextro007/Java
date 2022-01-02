import java.util.Scanner;

public class hackerRank {
    public static void helloWorld(){
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    public static void stdInOut(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scan.close();

    }
    public static void stdInOut2(String[] args){
        Scanner scan =  new Scanner(System.in);
        int i = scan.nextInt();
        double f = scan.nextDouble();
        String s1 = scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + f);
        System.out.println("Int: "+i);
        scan.close();
    }


}
