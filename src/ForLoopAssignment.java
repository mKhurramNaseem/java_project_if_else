import java.util.Scanner;

public class ForLoopAssignment {
    Scanner sc = new Scanner(System.in);

    public void questionNo1() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public void questionNo2(){
        int i;
        int sum=0;
        for (i = 1; i <= 10; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public void questionNo3(){
        int sum=0;
        System.out.println("Enter the number of natural number");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public void questionNo4(){
        int sum=0;
        int avg=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Enter "+ (i)+" numbers");
            int n = sc.nextInt();
            sum=sum+n;
        }
        System.out.println(sum);
        avg=sum/10;
        System.out.println(avg);
    }
    public void questionNo5(){
        int cube=0;
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 0; i <=n ; i++) {
            cube=i*i*i;
        }
        System.out.println(cube);
    }
    public void questionNo6(){
        int m;
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            m=n*i;
            System.out.println(m);
        }
    }
    public void questionNo7(){
        int m;
        System.out.println("Enter a number of a table");
        int n = sc.nextInt();
        System.out.println("Enter the ending number");
        int e = sc.nextInt();
        for (int i = 1; i <= e ; i++) {
            m=n*i;
            System.out.println(m);
        }
    }
//    public void questionNo8(){
//        int sum=0;
//        System.out.println("Enter an odd number");
//        int n = sc.nextInt();
//        n%2!=0;
//        for (int i = 0; i <= n ; i++) {
//            sum=sum+i;
//        }
//        System.out.println(sum);
//    }
//    public void questionNo9(){
//        int sum=0;
//        System.out.println("Enter an even number");
//        int n = sc.nextInt();
//        n%2==0;
//        for (int i = 0; i <= n ; i++) {
//            sum=sum+i;
//        }
//        System.out.println(sum);
//    }
}
