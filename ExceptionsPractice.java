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

    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        int[]arr2 = {12,23,1,3,34,34,0,23,28,1};

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(division(arr[i],arr2[i]));
        }
    }
}
