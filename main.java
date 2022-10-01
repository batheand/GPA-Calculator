import java.util.*;

/*GOKAY: I AM GONNA ADD SOME UI TO THIS HOPEFULLY MAKING IT A PROPPER PROJECT */

public class main {
   public static final String[] singleLetterNotes = new String[] {"A","A-","B","B-","C","C-","D","F","FX"};
   public static final String[] doubleLetterNotes = new String[] {"AA","BA","BB","CB","CC","DC","DD","FF","FX"};
   public static final double[] notes = new double[] {4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.0};
/*this was an attempt of library to use the fix indexes of all to calculate the transformation from letter to  */
    
    public static void main(String[] args) {
        startMenu();
        
    }

    public static void startMenu() {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Would you like to calculate using numbers or letters? Type N to calculate with numbers or type L to calculate with letters");
        String type = stdin.nextLine();
        if (type.equalsIgnoreCase("N")) {
            byNumber();
        } else if (type.equalsIgnoreCase("L")) {
            byLetter();
        } else {
            System.out.println("WRONG INPUT! TRY AGAIN!!!!");
            startMenu();
        }
    }


    public static void byNumber() {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Would you like to calculate out of 4 or 100? Type 4 for out of 4 or type 100 for out of 100");
        int hahahaTrickedYouThereIsNoChoiceButAnIllusionOfChoice = stdin.nextInt();
        System.out.println("Please enter the number of classes you have");
        int classCount = stdin.nextInt(), totalWeight = 0, totalWeightedGPA = 0;
        int[] weightAndGpa = new int[(classCount*2)];
        int[] weightedGpas = new int[(classCount)];
        for(int i = 0; i<classCount; i++) {
            int roundCount = i+1, GpaPlaceNum = classCount+i;
            System.out.println("Enter the weight of class " + roundCount);
            weightAndGpa[i] = stdin.nextInt();
            System.out.println("Enter the GPA of class " + roundCount);
            weightAndGpa[GpaPlaceNum] = stdin.nextInt();
            weightedGpas[i] = weightAndGpa[i] * weightAndGpa[GpaPlaceNum];
        }
        for(int i = 0; i<classCount; i++) {
            totalWeightedGPA += weightedGpas[i];
            totalWeight += weightAndGpa[i];
        }
        double result = totalWeightedGPA/totalWeight;
        System.out.println("Your Average Is: " + result);
    }

 // --------------------------------------------------------------------------------------------------------------

    public static void byLetter() {
         
        Scanner scan = new Scanner(System.in);

        double allTotalCred = 0;
        double finalTotalCred = 0;
        
        System.out.println("Would you like to calculate your grades by AA, BA, BB grading system or A, A-, B+ grading system? Type double for the first one and single for the second one");
        String choice = scan.next();
        if(!(choice.equalsIgnoreCase("double")) && !(choice.equalsIgnoreCase("single"))  ){
            System.out.println("WRONG INPUT! TRY AGAIN!!!!");
            startMenu();
            
        }else{

        System.out.println("Please enter the number of classes you have");
        int classNo = scan.nextInt();

        double [] transGrade = new double [classNo];

        System.out.println("Please enter the credits for classes in an order you have chosen");
        double allCred[] = new double [classNo];
        for (int i = 0; i<classNo; i++){
            allCred[i] = scan.nextDouble();
        }

        for (int i = 0; i<classNo; i++) {
            allTotalCred += allCred[i];
        }

        System.out.println("Please enter your letter grades in the same order as the credits you entered beforehand");
        String[] grades = new String [classNo];
        for (int i = 0; i<classNo; i++){
            grades[i] = scan.next();
        }
            if (choice.equalsIgnoreCase("double")){
                transGrade = doubleTransformer(grades, classNo);                                                      
            }
            else if (choice.equalsIgnoreCase("single")) {
                transGrade = singleTransformer(grades, classNo);
            }
           


        for (int i=0; i<classNo; i++) {
            finalTotalCred += (allCred[i]*transGrade[i]); 
        }
    
        double singleGradeGPA = (finalTotalCred/allTotalCred);
       System.out.println("Your GPA is: " + singleGradeGPA);
        }
    }

    public static double[] singleTransformer(String[] singleGrades, int classNo){
        String gradeStr = " ";
        String[] gradeStrArr = singleGrades;
        double[] singleLetterToNum = new double[classNo];
        for(int i = 0; i<classNo; i++){
            gradeStr = gradeStrArr[i];

            switch (gradeStr) {

            case "A": 
                
            singleLetterToNum[i] = 4.0;
                break;
            case "A-": 
            singleLetterToNum[i] = 3.5;
                break;
            case "B": 
            singleLetterToNum[i] = 3.0;
                break;    
            case "B-": 
            singleLetterToNum[i] = 2.5;
                break;
            case "C": 
            singleLetterToNum[i] = 2.0;
                break;    
            case "C-": 
            singleLetterToNum[i] = 1.5;
                break;    
            case "D": 
            singleLetterToNum[i] = 1.0;
                break;
            case "F": 
            singleLetterToNum[i] = 0.5;
                break;    
            case "FX":
            singleLetterToNum[i] = 0;
                break;
            default:
                System.out.println("ERROR: There is grades that does not exist in given grades");      
        }
             
      }
        
        return singleLetterToNum;
            
      }
             

    public static double[] doubleTransformer(String[] doubleleGrades, int classNo){
        String[] gradeStrArr = doubleleGrades;
        double[] doubleLetterToNum = new double[classNo];
        for(int i = 0; i<classNo; i++){
           String gradeStr = gradeStrArr[i];

            switch (gradeStr) {

            case "AA":               
                doubleLetterToNum[i] = 4.0;
                break;
            case "BA": 
                doubleLetterToNum[i] = 3.5;
                break;
            case "BB": 
                doubleLetterToNum[i] = 3.0;
                break;    
            case "CB": 
                doubleLetterToNum[i] = 2.5;
                break;
            case "CC": 
                doubleLetterToNum[i] = 2.0;
                break;    
            case "DC": 
                doubleLetterToNum[i] = 1.5;
                break;    
            case "DD": 
                doubleLetterToNum[i] = 1.0;
                break;
            case "F": 
                doubleLetterToNum[i] = 0.5;
                break;    
            case "FX":
                doubleLetterToNum[i] = 0;
                break;
            default:
                System.out.println("ERROR: There is grades that does not exist in given grades");      
        }
             
      }
        
        return doubleLetterToNum;
    }

}