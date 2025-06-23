public class ExceptionsPractice {

    public static  int division(int a,int b)
    {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
        finally {
            System.out.println("i am triggered in finally"); // this will always get executed no matter which block gets called try/catch
        }
    }

    //throws actually used with checked exceptions i,e which are checked at compile time
    //Ex: IOException in that case we can use throws keyword instead of try catch
    //in this case where this function may go into Runtime exception it is not needed
    public static int division2(int a, int b) throws Exception {
        return a / b;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {12,23,1,3,34,34,0,23,28,1};

        for (int i = 0; i < arr.length; i++) {
            try {
                int result = division2(arr[i], arr2[i]);
                System.out.println(arr[i] + " / " + arr2[i] + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide " + arr[i] + " by " + arr2[i] + " — Division by zero");
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
}
