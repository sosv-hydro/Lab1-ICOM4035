import java.util.ArrayList;
import java.util.Scanner;

public class Nrequests {

    ArrayList<Integer> integerArr;

    public ArrayList<Integer> getIntegerArr() {
        return integerArr;
    }

    public void setIntegerArr(ArrayList<Integer> integerArr) {
        this.integerArr = integerArr;
    }

    public static void main(String args[]) {
        System.out.println("add two requests: ");
        ArrayList<Integer> integers = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            int request = sc.nextInt();
            int addNo;

    //        System.out.println(request + "  " + addNo);
            switch (request) {
            case 1:
                addNo = sc.nextInt();
                addNumber(addNo, integers);
                break;

            case 2:
                addNo = sc.nextInt();
                removeNumber(addNo, integers);
                break;

            case 3:
                System.out.println(returnSize(integers));
                break;
            case 4:
                System.out.println(returnNumbers(integers));
                break;
            default:
                System.out.println("Incorrect input");
                break; 
            }
        }
    }

    public static void addNumber(int num, ArrayList<Integer> arr) {
        arr.add(num);
    }

    public static void removeNumber(int num, ArrayList<Integer> arr) {
        if (!(arr.size() == 0)) {
            if(arr.contains(num)){
                for(int i = 0; i < arr.size(); i++){
                    if(arr.get(i) == num){
                        arr.remove(i);
                        i--;
                    }
                }
            }
        } else
            System.out.println("Cannot remove more elements");
    }

    public static ArrayList<Integer> returnNumbers(ArrayList<Integer> arr) {
        
        return arr;
    }
    
    public static Integer returnSize(ArrayList<Integer> arr) {
        
        return arr.size();
    }

}
