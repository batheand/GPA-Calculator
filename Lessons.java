import javax.swing.*;

public class Lessons extends JComponent {
    int weightCmpe114, weightMath102, weightEng102,weightHist102,weightPhys106, weightEcon110;
    public double toGpa(double gradesTotal) {
        double gpa;
        if(gradesTotal>=90) {
            gpa=4;
        } else if (gradesTotal>=85) {
            gpa=3.5;
        } else if (gradesTotal>=80) {
            gpa=3;
        } else if (gradesTotal>=75) {
            gpa=2.5;
        } else if (gradesTotal>=70) {
            gpa=2;
        } else if (gradesTotal>=65) {
            gpa=1.5;
        } else if (gradesTotal>=85) {
            gpa=1;
        } else {
            gpa = 0;
        }
        return gpa;
    }
}
