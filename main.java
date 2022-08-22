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

}
