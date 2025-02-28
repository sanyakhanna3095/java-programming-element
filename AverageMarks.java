public class AverageMarks{
	public static void main(String[] args){
		// Marks obtained by Sam in each subject
        	int maths = 94;
        	int physics = 95;
       		int chemistry = 96;

        	// Calculate the total marks obtained
        	int totalMarks = maths + physics + chemistry;

        	// Calculate the average percentage
        	double averagePercentage = (double)(totalMarks * 100)/300;

        	// Display the average percentage
        	System.out.println("Sam's average mark in PCM is " + averagePercentage + "%");
	}
}

