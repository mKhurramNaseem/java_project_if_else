import java.util.Scanner;

public class WhileLoopAssignment {
    Scanner sc = new Scanner(System.in);

    public void questionNo1() {
        int i;
        i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void questionNo2() {
        int i;
        int sum = 0;
        i = 1;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }

    public void questionNo3() {
        System.out.println("enter a number");
        int n = sc.nextInt();
        int i;
//        int n;
        int sum = 0;
        i = 1;
//    while (i<=n){
        sum = i + 1;
        i++;
    }

    //    System.out.println(sum);
    public void questionNo4() {
        System.out.println("enter a number");
        int n = sc.nextInt();
        int i;
//        int n;
        int sum = 0;
        i = 1;
//    while (i<=n){
        sum = i + 1;
        i++;
//    n/2!=0;
        System.out.println(sum);
    }

    public void questionNo5() {
        int i;
        int pro = 1;
        i = 1;
        while (i <= 10) {
            pro = pro * i;
            i++;
        }
        System.out.println(pro);
    }

    public void questionNo6() {
        int i;
        i = 1;
        while (i <= 10) {

            System.out.println(i);
            i++;
        }
    }

    public void questionNo7() {
        int i;
        int sum = 0;
        double avg = 1;
        i = 1;
        while (i <= 10) {
            sum = sum + i;
            avg = sum / 10;
            i++;
        }
        System.out.println(sum);
        System.out.println(avg);
    }

    public void questionNo8() {
        int i;
        i = 1;
        while (i <= 10) {
            System.out.println(i * i * i);
            i++;
        }
    }

    public void questionNo9() {
        System.out.println("Enter a value");
        int v = sc.nextInt();
        int i;
        i = 1;
        while (i <= 10) {
            System.out.println(v * i);
            i++;
        }
    }

    public void questionNo10() {
        System.out.println("Enter a value");
        int v = sc.nextInt();
        int i;
        i = 1;
        while (i <= v) {
            System.out.println(v * i);
            i++;
        }
    }
    public void questionNo13() {
        System.out.println("Enter a digit");
        int i;
        i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
    public void questionNo14(){
        System.out.println("Enter an integer");
        int num = sc.nextInt();
        int count=0;
        count = 1;
        while (num!=0) {
            num/=10;
            count++;
        }
        System.out.println(count);
    }
    public void questionNo15(){
        int num = 45678899;
        int firstdigit=0;
        int lastdigit=0;
        lastdigit = num %10;
        System.out.println(lastdigit);
        while (num!=0) {
            firstdigit =num%10;
            num/=10;
            System.out.println(firstdigit);
        }
    }
    public void questionNo17(){
        int number = 3456;
        int sum=0;
        number=0;
        while (number<=4){
            sum=3+4+5+6;
            number++;
        }
        System.out.println(sum);
    }
    public void questionNo18(){
        int number = 3456;
        int pro=1;
        number=0;
        while (number<=4){
            pro=3*4*5*6;
            number++;
        }
        System.out.println(pro);
    }
    public void questionNo19(){
        int i;
        i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        }
        public void questionNo20(){
            int i;
            i = 1;
            while (i <= 10) {
                System.out.println(i);
                i++;
            }
        }
        public void questionNo21(){
        int i=1;
        int n=5;
        while (i<=n){
            System.out.println(i);
            i++;
        }
        }
        public void questionNo22(){
        int inputNumber=145;
        int i;
        int factorial,digit;
        int sum=0;
        int temp= inputNumber ;
        while (temp!=0){
            i=1;
            factorial=1;
            digit=temp%10;
            while(i<=digit){
                factorial=factorial*i;
                i++;
            }
            sum=sum+factorial;
            temp=temp/10;
        }
        }
        public void questionNo23(){
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int firstdigit;
            int seconddigit;
            int thirddigit;
//            n%10==thirddigit;
//            n/10==n2;
//            n2%10==seconddigit;
//            n2/10==n3;
//            n3%10==firstdigit;
            while (n<=9){
//                n%10==thirddigit;
//                n/10==n2;
//                n2%10==seconddigit;
//                n2/10==n3;
//                n3%10==firstdigit;
//                firstdigit*firstdigit*firstdigit+seconddigit*seconddigit*seconddigit+thirddigit*thirddigit*thirddigit==n;
            }
        }
        public void questionNo24(){
            System.out.println("Enter a number");
            int number = sc.nextInt();
            int i;
            i=0;
            while(number>0){
                int digit = number%10;
                number/=10;
            }
        }
        public void questionNo25(){
        int i;
        i='a';
        while (i<='z'){
            System.out.println(i);
            i++;
        }
        }
        public void questionNo26(){
            System.out.println("Enter a number");
            int number = sc.nextInt();
        int i = 1;
        while (i<=number){
//           number % i == 0;
            System.out.println(i);
            i++;
        }
        }
        public void questionNo27(){
        int a;
        int b;
//        while (b!=0){
//            int temp = b;
//            b=a%b;
//            a=temp;
            return;

        }
    }






