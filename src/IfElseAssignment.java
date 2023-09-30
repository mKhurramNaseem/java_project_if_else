import java.util.Scanner;

public class IfElseAssignment {
    Scanner sc = new Scanner(System.in);

    public void questionNo1() {
        System.out.print("Enter an integer : ");
        int value = sc.nextInt();
        System.out.print("Enter second Integer : ");
        int value2 = sc.nextInt();
        if (value == value2) {
            System.out.println("Equal");
        } else {
            System.out.println("not equal");
        }
    }

    public void questionNo2() {
        System.out.println("Enter a value");
        int value = sc.nextInt();
        if (value % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public void questionNo3() {
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you are eligible for casting your own vote");
        } else {
            System.out.println("you are not eligible for casting your own vote");
        }
    }

    public void questionNo4() {
        System.out.println("Enter year");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("your year is leap year");
        } else {
            System.out.println("your year is not a leap year");
        }
    }

    public void questionNo5() {
        System.out.println("Enter the value of integer m");
        int m = sc.nextInt();
        if (m > 0) {
            System.out.println("n = 1");
        } else if (m == 0 || m == -1) {
            System.out.println("n = 0");
        } else {
            System.out.println("n = -1");
        }
    }

    public void questionNo6() {
        System.out.println("Enter your height in cm");
        int height = sc.nextInt();
        if (height > 150) {
            System.out.println("Long");
        } else if (height == 150) {
            System.out.println("Medium");
        } else {
            System.out.println("Short");
        }
    }

    public void questionNo7() {
        System.out.println("Enter the length of a rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of a rectangle");
        int breadth = sc.nextInt();
        if (length == breadth) {
            System.out.println("Square");
        } else {
            System.out.println("Not a Square");
        }
    }

    public void questionNo8() {
        System.out.println("Enter value1");
        int value1 = sc.nextInt();
        System.out.println("Enter value2");
        int value2 = sc.nextInt();
        if (value1 > value2) {
            System.out.println("value1 is greater");
        } else {
            System.out.println("value2 is greater");
        }
    }

    public void questionNo9() {
        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();
        System.out.println("cost of one unit is 100rs");
        int actualquantity;
        actualquantity = quantity * 100;
        System.out.println("actualquantity");
        System.out.println(actualquantity);
        if (actualquantity > 1000) {
            System.out.println("you will have 10% discount");
            int discount;
            discount = actualquantity / 10;
            System.out.println("discount");
            System.out.println(discount);
            int finalquantity;
            finalquantity = actualquantity + discount;
            System.out.println("finalquantity");
            System.out.println(finalquantity);
        } else {
            System.out.println("you will not have any discount");
        }
    }

    public void questionNo10() {
        System.out.println("Enter your year of Service");
        int year = sc.nextInt();
        System.out.println("Enter your Salary");
        int Salary = sc.nextInt();
        if (year > 5) {
            System.out.println("You will get 5% Bonus");
            int Bonus;
            Bonus = Salary / 5;
            int NetBounusAmount;
            NetBounusAmount = Salary + Bonus;
            System.out.println(NetBounusAmount);
        } else {
            System.out.println("You will not get any Bonus");
        }
    }

    public void questionNo11() {
        System.out.println("Enter your Marks");
        int Marks = sc.nextInt();
        if (Marks < 25) {
            System.out.print("F");
        } else if (Marks >= 25 && Marks < 45) {
            System.out.print("E");
        } else if (Marks >= 45 && Marks < 50) {
            System.out.print("D");
        } else if (Marks >= 50 && Marks < 60) {
            System.out.print("C");
        } else if (Marks >= 60 && Marks < 80) {
            System.out.print("B");
        } else {
            System.out.print("A");
        }
    }

    public void questionNo12() {
        System.out.println("Enter the age of Men1");
        int Men1 = sc.nextInt();
        System.out.println("Enter the age of Men2");
        int Men2 = sc.nextInt();
        System.out.println("Enter the age of Men3");
        int Men3 = sc.nextInt();
        if (Men1 > Men2 && Men1 > Men3) {
            System.out.println("Men1 is oldest");
            if (Men2 < Men3) {
                System.out.println("Men2 is youngest");
            } else {
                System.out.println("Men3 is youngest");
            }
        } else if (Men2 > Men1 && Men2 > Men3) {
            System.out.println("Men2 is oldest");
            if (Men1 < Men3) {
                System.out.println("Men1 is Youngest");
            } else {
                System.out.println("Men3 is Youngest");
            }
        } else {
            System.out.println("Men3 is oldest");
        }
    }

    public void questionNo13() {
        System.out.println("Enter a Number");
        int Number = sc.nextInt();
    }

    public void questionNo14() {
        System.out.println("Enter Number of Classes held");
        int Classes = sc.nextInt();
        System.out.println("Enter Number Classes attend");
        int attend = sc.nextInt();
        int percentage;
        percentage = (attend / Classes) * 100;
        System.out.println(percentage);
        if (percentage < 75) {
            System.out.println("Not allowed to sit in the exams");
        } else {
            System.out.println("Allowed to sit in the exams");
        }
    }

    public void questionNo15() {
        System.out.println("Do you have medical cause");
        char medical = sc.next().charAt(0);
        if (medical == 'Y') {
            System.out.println("You will have to sit");
        } else if (medical == 'N') {
            System.out.println("YOU will have not to sit");
        } else {
            System.out.println("Wrong input");
        }
    }

    public void questionNo16() {
        System.out.println("");
    }

    public void questionNo17() {
        System.out.println("Enter the Character");
        char Character = sc.next().charAt(0);
        if (Character >= 'A' && Character <= 'Z') {
            System.out.println("Charater is uppercase");
        } else {
            System.out.println("Character is lowercase");
        }
    }

    public void questionNo18() {

        System.out.println("Enter number1");
        int number1 = sc.nextInt();
        System.out.println("Enter number2");
        int number2 = sc.nextInt();
        System.out.println("Enter number3");
        int number3 = sc.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("number1 is largest number");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("number2 is largest number");
        } else {
            System.out.println("number3 is largest number");
        }
    }

    public void questionNo19() {
        System.out.println("Enter the value of X-Coordinate");
        int XCoordinate = sc.nextInt();
        System.out.println("Enter the value of Y-Coordinate");
        int YCoordinate = sc.nextInt();
        if ('x' > 0 || 'y' > 0) {
            System.out.println("Point lies in 1st Quadrent");
        } else if ('x' > 0 || 'y' < 0) {
            System.out.println("Points lies in 2nd Quadrent");
        } else if ('x' < 0 || 'y' < 0) {
            System.out.println("Points lies in 3rd Quadrent");
        } else {
            System.out.println("Points lies in 4th Quadrent");
        }
    }

    public void questionNo20() {
        System.out.println("Enter your marks in Math");
        int Math = sc.nextInt();
        System.out.println("Enter your marks in Physics");
        int Physics = sc.nextInt();
        System.out.println("Enter your marks in Chemistry");
        int Chemistry = sc.nextInt();
        if (Math >= 65 && Physics >= 55 && Chemistry >= 50) {
            System.out.println("You are eligible for admission");
        } else if (Math + Physics + Chemistry >= 190 || Math + Physics >= 140) {
            System.out.println("You are eligible for admission");
        } else {
            System.out.println("You are not eligible for admission");
        }
    }

    public void questionNo21() {
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        if (a + b + c == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public void questionNo22() {
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your rollNo");
        int rollNO = sc.nextInt();
        System.out.println("Enter your Marks in math");
        int math = sc.nextInt();
        System.out.println("Enter your Marks in urdu");
        int urdu = sc.nextInt();
        System.out.println("Enter your Marks in computer");
        int computer = sc.nextInt();
        if (math + urdu + computer == 150) {
            System.out.println("You are passed");
        } else {
            System.out.println("You failed");
        }
    }

    public void questionNo23() {
        System.out.println("Enter temperature in centigrade");
        int temp = sc.nextInt();
        if (temp < 0) {
            System.out.println("freezing weather");
        } else if (temp >= 0 || temp < 10) {
            System.out.println("very cold weather");
        } else if (temp >= 10 || temp < 20) {
            System.out.println("cold weather");
        } else if (temp >= 20 || temp < 30) {
            System.out.println("normal in temperature");
        } else if (temp >= 30 || temp < 40) {
            System.out.println("its hot");
        } else {
            System.out.println("its very hot");
        }
    }

    public void questionNo24() {
        System.out.println("Enter the length of first side of triangle");
        int l1 = sc.nextInt();
        System.out.println("Enter the length of second side of triangle");
        int l2 = sc.nextInt();
        System.out.println("Enter the length of third side of triangle");
        int l3 = sc.nextInt();
        if (l1 == l2 && l2 == l3 && l3 == l1) {
            System.out.println("triangle is Equilateral");
        } else if (l1 == l2 || l2 == l3) {
            System.out.println("triangle is isosceles");
        } else if (l1 == l3 || l2 == l3) {
            System.out.println("triangle is isosceles");
        } else if (l1 == l2 || l1 == l3) {
            System.out.println("triangle is isosceles");
        } else {
            System.out.println("triangle is scalene");
        }
    }

    public void questionNo25() {
        System.out.println("Enter the first angle of triangle");
        int a1 = sc.nextInt();
        System.out.println("Enter the second angle of triangle");
        int a2 = sc.nextInt();
        System.out.println("Enter the third angle of triangle");
        int a3 = sc.nextInt();
        if (a1 + a2 + a3 == 180) {
            System.out.println("Triangle is formed");
        } else {
            System.out.println("Triangle is not formed");
        }
    }

    public void questionNo26() {
        System.out.println("Enter a character");
        char character = sc.next().charAt(0);
        if (character >= 'A' && character <= 'Z') {
            System.out.println("character is alphabet");
        } else if (character >= 'a' && character <= 'z') {
            System.out.println("character is alphabet");
        } else if (character >= '0' && character <= '9') {
            System.out.println("character is digit");
        } else {
            System.out.println("special character");
        }
    }

    public void questionNo27() {
        System.out.println("Enter an alphabet");
        char alphabet = sc.next().charAt(0);
        if (alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U' || alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println("alphabet is vowel");
        } else {
            System.out.println("alphabet is consonant");
        }
    }

    public void questionNo28() {
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter the customer id");
        int id = sc.nextInt();
        System.out.println("Enter consumed units");
        int units = sc.nextInt();
        if (units > 199) {
            System.out.println("you will have 1.20rs charge per unit");
        } else if (units >= 200 && units < 400) {
            System.out.println("you will have 1.50rs charge per unit");
        } else if (units >= 400 && units < 600) {
            System.out.println("you will have 1.80rs charge per unit");
        } else {
            System.out.println("you will have 2.00rs charge per unit");
        }
    }

    public void questionNo29() {
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("number is negative");
        } else if (number > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is zero");
        }
    }

    public void questionNo30() {
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (number % 5 == 0) {
            System.out.println("the number is divisible by 5");
        } else if (number % 11 == 0) {
            System.out.println("the number is divisible by 11");
        } else {
            System.out.println("the number is not divisible by 5 or 11");
        }
    }

    public void questionNo31() {
        System.out.println("Enter a month Number");
        int month = sc.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days in month");
        } else if (month == 2) {
            System.out.println("28 days in month");
        } else {
            System.out.println("30 days in month");
        }
    }

    public void questionNo32() {
        System.out.println("Enter Amount");
        int amount = sc.nextInt();
        if (amount > 1000) {
            System.out.println("10 notes of 100");
        } else {
            System.out.println("100 notes of 1000");
        }
    }

    public void questionNo33() {
        System.out.println("Enter your salary");
        int salary = sc.nextInt();
        if (salary <= 10000) {
            System.out.println("HRA 20% and DA 80%");
        } else if (salary <= 20000) {
            System.out.println("HRA 25% and DA 90%");
        } else {
            System.out.println("HRA 30% and DA 95%");
        }
    }

    public void questionNo34() {
        System.out.println("Enter electricity unit charges");
        int units = sc.nextInt();
        if (units > 50) {
            System.out.println("you will charge 0.50/unit");
        } else if (units > 100) {
            System.out.println("you will charge 0.75/unit");
        } else if (units > 200) {
            System.out.println("you will charge 1.20/unit");
        } else {
            System.out.println("you will charge 1.50/unit");
        }
    }
    public void questionNo35(){
        System.out.println("Enter product price");
        int price = sc.nextInt();
        System.out.println("Enter quantity");
        int quantity = sc.nextInt();
        int revenue;
        revenue=price*quantity;
        if (revenue>5000){
            System.out.println("you have offered 10% discount");
        }else {
            System.out.println("nothing offered");
        }
    }
    public void questionNo36(){
        System.out.println("Enter the length of rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int breadth = sc.nextInt();
        System.out.println("Enter the perimeter of rectangle");
        int perimeter = sc.nextInt();
        int area ;
        area=length*breadth;
        if (area>perimeter){
            System.out.println("y");
        }else{
            System.out.println("N");
        }
    }
    public void questionNo37(){
        System.out.println("Enter first number");
        int n1 =sc.nextInt();
        System.out.println("Enter second number");
        int n2 =sc.nextInt();
        System.out.println("Enter third number");
        int n3 =sc.nextInt();
        if (n1>n2 || n2>n3){
            System.out.println("numbers are increasing");
        }else if (n1<n2 || n2<n3){
            System.out.println("numbers are decreasing");
        }else {
            System.out.println("wrong input");
        }
    }
    public void questionNo38() {
        System.out.println("Enter first operand");
        int operand1 = sc.nextInt();
        System.out.println("Enter any mathematical operator");
        char operator = sc.next().charAt(0);
        System.out.println("Enter second operand");
        int operand2 = sc.nextInt();
        if (operator == '+') {
            int sum;
            sum = operand1 + operand2;
            System.out.println(sum);
        } else if (operator == '-') {
            int subtract;
            subtract = operand1 - operand2;
            System.out.println(subtract);
        } else if (operator == '*') {
            int multiply;
            multiply = operand1 * operand2;
            System.out.println(multiply);
        } else if (operator == '/') {
            int division;
            division = operand1 / operand2;
            System.out.println(division);
        } else {
            System.out.println("Wrong input");
        }
    }
        public void questionNo39(){
            System.out.println("Enter timt in hours");
            int time = sc.nextInt();
            if (time==2){
                System.out.println("worker is highly efficient");
            } else if (time==3) {
                System.out.println("worker need to improve speed");
            } else if (time==4){
                System.out.println("worker is given to training to improve speed");
            }else{
                System.out.println("worker should have to leave the company");
            }
        }
        public void questionNo40(){
            System.out.println("Enter the days after you return the book to library");
            int days = sc.nextInt();
            if (days>5){
                System.out.println("you will charged 50 paisa");
            } else if (days>6 && days<=10) {
                System.out.println("you will charged 1 rupees");
            } else if (days>10) {
                System.out.println("you will charged 5 rupees");
            }else{
                System.out.println("membership will be canceled");
            }
        }
        public void questionNo41(){
            System.out.println("Enter first side of triangle");
            int s1 = sc.nextInt();
            System.out.println("Enter second side of triangle");
            int s2 = sc.nextInt();
            System.out.println("Enter third side of triangle");
            int s3 = sc.nextInt();
            if (s1+s2+s3==180){
                System.out.println("triangle is valid");
            }else{
                System.out.println("triangle is invalid");
            }
        }
        public void questionNo42(){
            System.out.println("Enter a value in centimeter");
            int value = sc.nextInt();
            System.out.println("Enter which you want to convert");
            String type = sc.next();
            double kilometer;
//            if (type==meter){
                double meter;
               meter= value*0.01;
                System.out.println(meter);
//            } else if (type==kilometer) {
                kilometer=value*0.0001;
                System.out.println(kilometer);
//            }else {
                System.out.println("invalid input");
            }
            public void questionNo43(){
                System.out.println("Enter time in hours");
                int time = sc.nextInt();
                if(time>=1 && time<=12){
                    System.out.println("time is am");
                }else if (time>=13 && time<=24){
                    System.out.println("time is pm");
                }else {
                    System.out.println("invalid input");
                }
            }
            public void questionNo44(){
                System.out.println("Enter a number");
                int number = sc.nextInt();
            }
        }

