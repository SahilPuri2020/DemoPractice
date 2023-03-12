package org.demo.one;

public class Day3 {

    public static void main(String[] args) {

        //declare and define in separate steps
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 5 ;
        arr[2] = 3;

        //declare and define in same step
        int[] arr1 = {1,4,5};
        int[] arr2 = new int[0];
       // System.out.println(arr2[0]);
        //arr.length = size of array
        for(int i = 0 ; i < arr2.length ; i++) {
          //  System.out.println(arr2[i]);
        }

        //Find if x is present (True) inside the array 'a' else (False)
//        int a[] = {4,9,1,8,3,10,2};
//        int x = 2;
//        System.out.println(a[0]);  //O(1)
//        for(int i = 0 ; i < a.length ; i++) {
//
//            if(x == a[i]) {
//                System.out.println("True");
//                return;
//            }
//        }

        System.out.println("False");

        //Day300PS
        Day3OOPS obj = new Day3OOPS();
        //ClassName ObjName = new ClassName();
        obj.apple();

        Student student1 = new Student();
        student1.setName("rajesh");
        student1.setAge(12);
        student1.setGender("MALE");
        student1.setRollNumber(1);

        Student student2 = new Student();
        student2.setName("sahil");
        student2.setAge(14);
        student2.setGender("MALE");
        student2.setRollNumber(2);

        System.out.println(student2.getName());
        System.out.println(student1.getAge());
        System.out.println(student2.getRollNumber());
    }
}
