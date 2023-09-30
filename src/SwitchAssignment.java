import java.util.Scanner;

public class SwitchAssignment {
    Scanner sc = new Scanner(System.in);
    public void questionNo1(){
        System.out.println("Enter a number of day in week");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("invalid input");
        }
    }
    public void questionNo2(){
        System.out.println("Enter the Month name");
        String month = sc.next();
        switch (month){
            case "january" :
                System.out.print("31 days in Month");
                break;
            case "febraury" :
                System.out.print("29 days in Month");
                break;
            case "march" :
                System.out.print("31 days in Month");
                break;
            case "april" :
                System.out.print("30 days in Month");
                break;
            case "may" :
                System.out.print("31 days in Month");
                break;
            case "june" :
                System.out.print("30 days in Month");
                break;
            case "july" :
                System.out.print("31 days in Month");
                break;
            case "august" :
                System.out.print("31 days in Month");
                break;
            case "september" :
                System.out.print("30 days in Month");
                break;
            case "october" :
                System.out.print("31 days in Month");
                break;
            case "november" :
                System.out.print("30 days in Month");
                break;
            case "december" :
                System.out.print("31 days in Month");
                break;
            default:
                System.out.println("invalid input");
        }
    }
    public void questionNo3(){
        System.out.println("Enter an alphabet");
        char a = sc.next().charAt(0);
        switch (a) {
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println("alphabet is vowel");
                break;
            default:
                System.out.println("alphabet is consonent");
        }
    }
    public void questionNo4(){
        System.out.println("Enter a character");
        char character = sc.next().charAt(0);
        switch (character) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("character is alphabet");
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println("character is number");
                break;
            default:
                System.out.println("character is special character");
        }
    }
    public void questionNo6(){
        System.out.println("Enter a number");
        int number = sc.nextInt();
        switch (number%2){
            case 0:
                System.out.println("number is even");
                break;
            default:
                System.out.println("number is odd");
        }
    }
    public void questionNo5(){
        System.out.println("Enter a first number");
        int number1 = sc.nextInt();
        System.out.println("Enter a second number");
        int number2 = sc.nextInt();
        switch (number2/number1) {
            case 0:
                System.out.println("number1 is maximum");
                break;
            default:
                System.out.println("number2 is maximum");
        }
    }
    public void questionNo7(){
        System.out.println("Enter a number");
        int n = sc.nextInt();
//        condition ? expr1 : expr2
        switch (n>0 ? 1 : 0){
            case 1:
                System.out.println("Positive");
                break;
        }
        switch (n){
            case 0:
                System.out.println("Zero");
                break;
            default:
                switch ((n+1)/n){
                    case 0:
                        System.out.println("Negative");
                        break;
                    default:
                        System.out.println("Positive");
                }
        }
//        switch (n/){
//            case 1 :
//                System.out.println("number is positive");
//                break;
//            case 0:
//                System.out.println("number is zero");
//                break;
//            default:
//                System.out.println("number is negative");
//        }
    }
    public void questionNo9(){
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter an operator");
        char operator = sc.next().charAt(0);
        System.out.println("Enter second number");
        int number2 = sc.nextInt();
        switch (operator){
            case '+':
                int sum = number1 + number2;
                System.out.println(sum);
                System.out.println("numbers are added");
                break;
            case '-':
                int subtract = number1 - number2;
                System.out.println(subtract);
                System.out.println("numbers are subtract");
                break;
            case '*':
                int multiply = number1 * number2;
                System.out.println(multiply);
                System.out.println("numbers are multiply");
                break;
            case '/':
                int divide = number1 + number2;
                System.out.println(divide);
                System.out.println("numbers are divide");
                break;
            default:
                System.out.println("invalid input");
        }
    }
    public void questionNo10(){
        System.out.println("Enter a number");
        int number = sc.nextInt();
        switch (number){
            case 0:
                System.out.println("your answer is zero");
                break;
            case 1:
                System.out.println("your answer is one");
                break;
            case 2:
                System.out.println("your answer is two");
                break;
            case 3:
                System.out.println("your answer is three");
                break;
            case 4:
                System.out.println("your answer is four");
                break;
            case 5:
                System.out.println("your answer is five");
                break;
            case 6:
                System.out.println("your answer is six");
                break;
            case 7:
                System.out.println("your answer is seven");
                break;
            case 8:
                System.out.println("your answer is eight");
                break;
            case 9:
                System.out.println("your answer is nine");
                break;
            default:
                System.out.println("wrong input");
        }
    }
    public void questionNo11(){
        System.out.println("Enter your id");
        int id = sc.nextInt();
        switch (id){
            case '1':
                System.out.println("your department is computer science ");
                break;
            case '2':
                System.out.println("your department is software engeniering");
                break;
            case '3':
                System.out.println("your department is information technology");
                break;
            case '4':
                System.out.println("your department is artificial intelligence ");
                break;
            case '5':
                System.out.println("your department is anonymous department");
                break;
            default:
                System.out.println("invalid input");
        }
    }
    public void questionNo12(){
        System.out.println("Enter your password");
        int password = sc.nextInt();
        switch (password){
            case 'T':
                System.out.println("your password is true");
                break;
            default:
                System.out.println("your password is incorrect");
        }
    }
    public void questionNo14(){
        System.out.println("Enter your gender");
        char gender = sc.next().charAt(0);
        switch (gender) {
            case 'M':
                System.out.println("gender is male");
                break;
            case 'F':
                System.out.println("gender is female");
                break;
            default:
                System.out.println("wrong input");
        }
    }
    public void questionNo17(){
        System.out.println("Enter your grades");
        char grade = sc.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("very good");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("fair");
                break;
            case 'E':
                System.out.println("just pass");
                break;
            case 'F':
                System.out.println("fail");
                break;
            default:
                System.out.println("invalid input");
        }
    }
    public void questionNo18(){
        System.out.println("Enter your age");
        int age = sc.nextInt();
        switch (18/age){
            case 0:

        }
        switch (age){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("you are not eligible to vote");
                break;
            default:
                System.out.println("you are eligible to vote");
        }
    }
    public void questionNo19(){

    }
}
