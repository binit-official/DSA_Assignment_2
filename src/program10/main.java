package program10;

import program10.student.Test;

import program10.sports.sport;



public class main implements sport {
    public static void main(String[] args) {
        Test test = new Test();
        test.input();
        test.output();

        int grandTotalMarks = test.mark1 + test.mark2;
        int grandTotalScore = score1 + score2;

        System.out.println("Grand Total Marks: " + grandTotalMarks);
        System.out.println("Grand Total Score: " + grandTotalScore);
    }
}

