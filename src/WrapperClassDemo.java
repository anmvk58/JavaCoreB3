public class WrapperClassDemo {
    public static void main(String[] args) {
        int x = 5;
        Integer y = new Integer(5);

        String binaryOf5 = Integer.toBinaryString(x);
        System.out.println(binaryOf5);

        //1. bởi vì đối tượng thì mới có phương thức !
        int a = Integer.parseInt("1234");

        //2. Phục vụ cho xử lý Collection

    }
}
