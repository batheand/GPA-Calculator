import java.util.*;


public class main {
    
    public static void main(String[] args) {
        startMenu();
    }

    public static void startMenu() {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Would you like to calculate using numbers or letters? Type N to calculate with numbers or type L to calculate with numbers");
        String type = stdin.nextLine();
        if (type.equalsIgnoreCase("N")) {
            byNumber();
        } else if (type.equalsIgnoreCase("L")) {
            System.out.println("byLetter();");
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

    public static void byLetter() {
         Scanner scan = new Scanner(System.in);
         
         
         System.out.println("Would you like to calculate your grades by AA, BA, BB grading system or A, A-, B+ grading system? Type double for the first one and single for the second one");
         String choice = scan.next();
         if (choice.equalsIgnoreCase("double")){
          startDouble();                                                      
         }
         else if (choice.equalsIgnoreCase("single")) {
          startSingle();
         }
         else {
            System.out.println("WRONG INPUT! TRY AGAIN!!!!");
            startMenu();
        }
    }

    private static void startSingle() {
        
        String gradeStr = " ";
        double gradeVal = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of classes you have");
        int classNo = scan.nextInt();
        System.out.println("Please enter the credits for classes in an order you have chosen");
        double allCred[] = new double [classNo];
        for (int i = 0; i<classNo; i++){
            allCred[i] = scan.nextInt();
        }
        System.out.println("Please enter your grades in the same order as the credits you entered beforehand");
        String singleGrades[] = new String [classNo];
        for (int i = 0; i<classNo; i++){
            singleGrades[i] = scan.next();
        }

        switch (gradeStr) {
            case "A": 
                gradeVal = 4.0;
                break;
            case "A-": 
                gradeVal = 3.7;
                break;
            case "B+": 
                gradeVal = 3.3;
                break;    
            case "B": 
                gradeVal = 3.0;
                break;
            case "B-": 
                gradeVal = 2.7;
                break;    
            case "C+": 
                gradeVal = 2.3;
                break;    
            case "C": 
                gradeVal = 2.0;
                break;
            case "C-": 
                gradeVal = 1.7;
                break;    
            case "D+":
                gradeVal = 1.3;
                break;
            case "D":
                gradeVal = 1.0;
                break;    
            case "F":
                gradeVal = 0;
                break;    
            case "FX":
                gradeVal = 0;
                break;      
            case "FZ":
                gradeVal = 0;
                break;      
                
        }


        for (int i = 0; i<classNo; i++) {
            
        }

        for (int i=0; i<classNo; i++) {
        double finalTotal = (allCred[i]*singleGrades[i]); // her dersin kredisi * o dersten alınan not değerlerinin toplamı
        }
    
    }

    private static void startDouble() {

    } 

}