public class StringCompareDemo {
    public static void main(String[] args) {
//        Student student1 = new Student("Nguyễn Văn A");
//        System.out.println("Student1 = " + student1.title);

        String s1 = "Nguyễn Văn A";
        String s2 = new String("Nguyễn Văn A");
        System.out.println("S1: " + s1);
        System.out.println("S2: " + s2);

//        System.out.println(s1 == s2);

        if(s1.equals(s2)){
            System.out.println("oke");
        } else {
            System.out.println("Not");
        }

//        if(student1.title == s1){
//            System.out.println("Hai học sinh bằng nhau");
//        } else {
//            System.out.println("VTI Railway 56");
//        }
    }
}
