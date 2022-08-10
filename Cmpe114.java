public class Cmpe114 extends Lessons{

    double [] labGrades = new double[10];
    double midtermGrade=0, finalGrade=0, labGradesTotal=0, project=0 ,mGtemp,fGtemp, lGtotalTemp,pTemp;

    public double calculate() {
        for(int i=0; i<10; i++) {
            labGradesTotal+=labGrades[i];
        }
        lGtotalTemp=(labGradesTotal*30)/100;
        mGtemp=(midtermGrade*20)/100;
        fGtemp=(finalGrade*30)/100;
        pTemp=(project*20);
        double tempGradeTotal=lGtotalTemp+mGtemp+fGtemp+pTemp, gpa;
        gpa = toGpa(tempGradeTotal);
        return gpa;
    }

    public double getLabGradesTotal() {
        return labGradesTotal;
    }

    public void setLabGradesTotal(double labGradesTotal) {
        this.labGradesTotal = labGradesTotal;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double[] getLabGrades() {
        return labGrades;
    }

    public void setLabGrades(double[] labGrades) {
        this.labGrades = labGrades;
    }

    public double getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }
}
