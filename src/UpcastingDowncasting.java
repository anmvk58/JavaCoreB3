public class UpcastingDowncasting {
    public static void main(String[] args) {
        //Demo cho Upcasting:
        byte x = 10;
        long y = (long) x;
        System.out.println("y = " + y);

        //Demo cho Downcasting:
        int a = 1000;
        byte b = (byte) a;
        System.out.println("b = " + b); //Gia tri cua b bi sai lech
    }
}
