package SamplePrograms;

import java.util.Scanner;

public class ParallelArrays1 {
    public static void main(String[] args) {
        String stu[] = new String[5];
        int mark[]=new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < stu.length; i++) {
            System.out.println("Enter name of student "+(i+1)+"> ");
            mark[i]=s.nextInt();
            s.nextLine();
        }
        double avg=0;
        for (int i = 0; i < stu.length; i++) {
            System.out.format("%10s%20d\n",stu[i],mark[i]);
            avg +=(double)mark[i];
        }
        avg/=3;
        System.out.println("---------------------");
        System.out.format("The average is > %10.2f\n"+avg);
    }
    
}
