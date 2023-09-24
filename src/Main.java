import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    static Scanner sc=new Scanner(System.in);


    public static void ATakeName(){
        String name=sc.nextLine();

    }

    public static boolean BCheckNameAndTakeGender(String name){
        String gender=sc.nextLine();



        return "a";
    }

    public static String CTakeTckNo(){
        Scanner sc=new Scanner(System.in);
        String tckNo=sc.nextLine();
        try {
            if(DCheckTckNo(tckNo)){
                System.out.println("Proper form");
            }
        } catch (TckNoDoesNotProperForm e) {
            throw new RuntimeException(e);
        }


    }

    public static boolean DCheckTckNo(String tckNo) throws TckNoDoesNotProperForm {
        if(tckNo.length()!=11){
            throw new TckNoDoesNotProperForm("TckNo does not proper form,tckno must be 11 character");
        }else{
            return true;
        }


    }
}



