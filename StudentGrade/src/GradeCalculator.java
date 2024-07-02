import java.io.*;

public class GradeCalculator {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of subjects: ");
	    int numberOfSubjects = Integer.parseInt(br.readLine());
		
		int marks[] = new int[numberOfSubjects];
		int total_marks=0; 
		double Avg_percent;
		String grade;
		
		System.out.println("Enter your name: ");
        String name = br.readLine();
        
        System.out.println("Enter marks in each subject out of 100: ");
        for(int i=0; i<numberOfSubjects; i++)
        { 
        	System.out.println("Subject"+ (i+1) + ": ");
        	marks[i]= Integer.parseInt(br.readLine());
        	total_marks= total_marks+ marks[i];
        }
        
		Avg_percent= (double) total_marks / numberOfSubjects ;
		
		if (Avg_percent >= 90) 
		{ 
			grade = "A";
        } 
		else if ((Avg_percent >= 80) && (Avg_percent <90)) 
		{
            grade = "B";
        } 
		else if ((Avg_percent >= 70) && (Avg_percent <80))
		{
            grade = "C";
        } 
		else if ((Avg_percent >= 60) && (Avg_percent <70))
		{
            grade = "D";
        } 
		else if ((Avg_percent >= 45) && (Avg_percent <60))
		{
			grade = "E";
		}
		else 
		{
            grade = "F";
        }
		
		System.out.println("Name: " + name);
		System.out.println("Total Marks: " + total_marks + "/" + numberOfSubjects*100);
		System.out.println("Average Percentage: " + Avg_percent + " %");
		System.out.println("Grade: " + grade);
	}

}
