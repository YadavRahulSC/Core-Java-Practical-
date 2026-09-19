package Exception;

public class exc1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            System.out.println(a / b);
        }
        catch(Exception e){
            System.out.println("It cannot b e divided by zero");
        }
    }
}
