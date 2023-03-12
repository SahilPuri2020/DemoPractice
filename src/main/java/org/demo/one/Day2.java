package org.demo.one;

public class Day2 {

    public static void main(String[] main) {
//
//        // starting point
//        // what to do after each step
//        // end points - condition check
//
//        //for loop/program to print numbers from x =5 to y = 15
//        //for(starting point ; ending point ; operation)
//        for(int i = 0 ; i <= n; i++) {
//            //i = 15
//            System.out.println("Value of counter is"+i);
//        }
//
//
//        //while loop/program to print numbers from x =5 to y = 15
//        //while(condition) {} -> While loop runs until condition is TRUE
//            int i = 5;
//            while(i <= 15) {
//                System.out.println("Value of counter is"+i);
//                i++;
//            }
//        //end the loop
//        int y = 50;
//        //pre-increment
//        int x = ++y; //y=51
//        System.out.println("Value of x is"+x); //O/P = 51
//
//        //post increment
//        x = y++; //y=51 , then assign to x , then y = 52
//        System.out.println("Value of x is"+x); //O/P = 51
//
//        System.out.println("Value of y is"+y); //O/P = 52
//
//
//
//      //  Task -1
//
//
//            int a= 5;
//
//            int b= a%2;
//
//            if(b==0)
//            {
//                System.out.println("it is a even number");
//            }
//            else
//            {
//                System.out.println( "it is a odd number");
//            }
////Task 2
//        for(i=20;i>=5;i--)
//        {
//            System.out.println("the number is" +i);
//        }
//
//        //Task 3
//
//        {

//            for(int i = 5 ; i <= 21 ; i=i+2)
//            {
//                System.out.println("the number is" +i);
//
//            }

        //Task - 4
//            int i;
//            for(i = 22 ; i >= 10 ; i = i-2) {
//                System.out.println("the number is" +i);
//
//
//                Task-5
//                    int n = 5;

//1 2 3 4 5
//                    //error handling
//                    if(n <= 1)
//                        System.out.println("1 is netiehr a prime nor a comp");
//                         return;
//
//                         for(i = 2;i < n; i++) {
//                            if (n % i == 0) {
//                                System.out.println("The number is not a prime number");
//                                return;
//                            }
//                        }
//
//                            System.out.println("The number is a prime number");


                         //Return / break / continue
//                int n = 10;
//                for(int i = 2 ; i < n ; i++) {
//                    if (i % 5 == 0) {
//                        System.out.println(i + "It is the number" + i  + "." + i);
//                        break;
//                    }
//
//                }
//        System.out.println("THANK YOU");
//       break terminates the loop
//       return terminates the program from main
//       continue skips the current iteration of the loop and goes to the next iteration
//       }
        //Print all numbrs upto n except those divisible by 5
        int n = 15;
        for(int i = 1 ; i <=n  ; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i + "It is the number" + i);

        }

 //Linear search   [1,4,8,10,2,3,9,5] , n=3
      //  Find a number in an array of integers

         //Array = indexed collection of similar type elements
        // index starts from 0 to n-1
        // Time complexity for accessing an element  = O(1) //y=c
        // Time complexity , y = f(x)
        //Memory allocation is difficult
        // But time complexity for insertion and deletion and element = O(n) //y=x
        // How to initialize an array in java

    }




            }
