public class HashcodeDemo {
    public static void main(String[] args) {
        String s1 = "i love you";
        String s2 = "i love you";
        String s3 = "i Hate you";

        Student student1 = new Student("ABCD");
        Student student2 = new Student("ABCD");
        System.out.println(student1.toString());
        System.out.println(student1.hashCode());
        System.out.println(student1.equals(student2));

//        System.out.println("S1 hashcode = " + s1.hashCode());
//        System.out.println("S2 hashcode = " + s2.hashCode());
//        System.out.println("S3 hashcode = " + s3.hashCode());
    }
}
