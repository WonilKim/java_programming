package chapter11;

public class ExceptionTest {
    public static void main(String[] args) {

        try {
            int arr[] = new int[3];
            arr[3] = 30;
            System.out.println("OK");
                
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }
    }
}
