package program9;

public class test {

        public static void main(String[] args) {
            Exam[] exams = new Exam[5];

            // Input data for each student
            for (int i = 0; i < exams.length; i++) {
                exams[i] = new Exam();
                System.out.println("Enter details for Student " + (i + 1) + ":");
                exams[i].input_Student();
                exams[i].input_Marks();
            }

            // Display result for each student
            for (int i = 0; i < exams.length; i++) {
                System.out.println("Result for Student " + (i + 1) + ":");
                exams[i].display_Student();
                exams[i].display_Result();
                System.out.println();
            }
        }
    }

