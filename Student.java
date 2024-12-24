import java.util.Scanner;

public class Student {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int n=scanner.nextInt();
        double marks;
        int gradeA=0;
        int gradeB=0;
        int gradeC=0;
        int gradeD=0;
        int gradeF=0;

        double count =0;

        

        for(int i=1; i<=n; i++){
            System.out.println("Enter marks for te student: "+i);
            marks=scanner.nextInt();
            

            if (marks>=90 && marks<=100) {
                System.out.println("grade A");
                gradeA++;
                
                
            }
            else if(marks>=80 && marks<=89){
                System.out.println("grade B");
                gradeB++;
            }
            else if (marks>=70 && marks<=79) {
                System.out.println("grade C");
                gradeC++;
                
            }
            else if (marks>=60 && marks<=69) {
                System.out.println("grade D");
                gradeD++;
                
            }
            else if (marks>=0 && marks<=59) {
                System.out.println("grade F");
                gradeF++;
                
            }
            else
            System.out.println("invalid marks");

            count=marks++;

            
            
        }
        
        System.out.println("number of student who got grade A are: "+gradeA);
        System.out.println("number of student who got grade B are: "+gradeB);
        System.out.println("number of student who got grade C are: "+gradeC);
        System.out.println("number of student who got grade D are: "+gradeD);
        System.out.println("number of student who got grade F are: "+gradeF);

        System.err.println("the sum of all student is: "+count);
    }
    
}
