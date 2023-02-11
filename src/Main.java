import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;



        do {
            System.out.println("*****************");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Modulus");
            System.out.println("0. Exit");
            System.out.println("*****************");
            System.out.println("Please enter the choice");


            int input = sc.nextInt();








            switch (input) {
                case 1:

                    Addition.add(readValue1(),readValue2());
                    break;
                case 2:
//                Scanner three = new Scanner(System.in);
//                int c = three.nextInt();
//                Scanner four = new Scanner(System.in);
//                int d = four.nextInt();
                    //Subtraction.sub(a, b);
                    break;
                case 3:
//                Scanner five = new Scanner(System.in);
//                int e = five.nextInt();
//                Scanner six = new Scanner(System.in);
//                int f = six.nextInt();
                    // Multiplication.multiply(a, b);
                    break;
                case 4:
//                Scanner seven = new Scanner(System.in);
//                int g = seven.nextInt();
//                Scanner eight = new Scanner(System.in);
//                int h = eight.nextInt();
                    //Division.div(a, b);
                    break;
                case 5:
//                Scanner nine = new Scanner(System.in);
//                int i =nine.nextInt();
//                Scanner ten = new Scanner(System.in);
//                int j = ten.nextInt();
                    // Modulus.mod(a, b);
                    break;
                case 0:
                    flag = false;
                    break;
            }


        }while (flag);



        }
        public static int readValue1(){
            System.out.println("Enter the first Number");

            int a = sc.nextInt();
            return a;
        }
    public static int readValue2(){
        System.out.println("Enter the second Number");

        int b = sc.nextInt();
        return b;
    }

    }
