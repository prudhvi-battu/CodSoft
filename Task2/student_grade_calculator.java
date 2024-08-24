import java.util.*;

public class student_grade_calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int n=sc.nextInt();

        int sub[]=new int[n];
        int total_sum=0;

        for(int i=0;i<n;i++){
            System.out.println("Enter the marks obtained in subject "+ (i+1)+ " :");
            sub[i]=sc.nextInt();
            total_sum+=sub[i];
        }

        System.out.println("-----YOUR RESULT-----");
        System.out.println("The total marks obtained in all subjects is :"+ total_sum);

        double percentage=(double) total_sum/(n*100)*100;
        System.out.println("The Average percentage is :"+ percentage +"%");

        String grade=gradecalculator(percentage);
        System.out.println("The Grade Result :"+ grade);

    }

    public static String gradecalculator(double percentage){
        if(percentage >= 90){
            return "O";
        }
        else if(percentage >= 80){
            return "A+";
        }
        else if(percentage >= 70){
            return "A";
        }
        else if(percentage >= 60){
            return "B+";
        }
        else if(percentage >= 50){
            return "B";
        }
        else if(percentage >= 40){
            return "C";
        }
        else{
            return "F";
        }
    }
}