import java.util.*;
public class Array {
  
    public static void main(Strings args[]){
      // int[] marks= {67,56,89};
      //     //  marks[0]=87;
      //     //  marks[1]=89;
      //     //  marks[2]=76;
      //      for(int i=0; i<3; i++){
      //       System.out.println(marks[i]);
      //      }


      Scanner sc= new Scanner(System.in);
      int size= sc.nextInt();
      int number[]= new int[size];

      for(int i=0; i<size; i++){
            number[i]= sc.nextInt();

      }
      for(int i=0; i<size; i++){
        System.out.println(number[i]);
      }
    }

}
