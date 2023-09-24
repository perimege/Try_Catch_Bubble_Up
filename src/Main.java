import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        a();
    }

    public static void a(){
        try{
            b();
        }catch (Exception e){
            System.out.println("Catch exception that came from b");
            System.out.println(e.getMessage());
        }

    }

    public static void b() throws TckNoDoesNotProperForm {
        try {
            c();
        }catch (Exception e){
            System.out.println("Catched exception that came from c");
            System.out.println("Throwed exception from b");
            throw new NullPointerException("TckNo null geldiği için gerekli işlem yapılamadı");
        }
    }

    public static void c() throws TckNoDoesNotProperForm {

       try{
           d();
       }catch (Exception e){
           System.out.println("Catched exception that came from d");
           System.out.println("Throwed exception from c");
           throw e;
       }

    }

    public static void d() throws TckNoDoesNotProperForm {
        String tckNo="1111111111";
        if(tckNo.length()!=11){
            System.out.println("Throwed exception from d");
            throw new TckNoDoesNotProperForm("TckNo does not proper form,tckno must be 11 character");
        }
    }
}



