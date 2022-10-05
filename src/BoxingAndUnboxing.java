public class BoxingAndUnboxing {
    public static void main(String[] args) {
        //Boxing (Primitive -> Object)
        int x = 5;                          // x là primitive
        Integer y = Integer.valueOf(x);     // y là Object

        //Unboxing (Object -> Primitive)
        Integer a = new Integer(10);   // a là Object
        int b = a.intValue();               // b là primitive
    }
}
