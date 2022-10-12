package StringQuestion;
//Question 3:
//        Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa viết hoa chữ cái đầu thì viết hoa lên

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tên: ");
        String inputText = scanner.nextLine();
        System.out.println("Before fix: " + inputText);

        //chuẩn hóa xâu: (sử dụng phương thức static)
        String yourName = QuestionOne.chuanHoaXau(inputText);

        //Xử lý viết hoa kí tự đầu tên lên:
        String result = "";
        result = result + String.valueOf(Character.toUpperCase(yourName.charAt(0)));

        for(int i = 0; i < yourName.length() - 1 ; i++){
            if(yourName.charAt(i) == ' '){
                result += String.valueOf(Character.toUpperCase(yourName.charAt(i+1)));
            } else {
                result += String.valueOf(Character.toLowerCase(yourName.charAt(i+1)));
            }
        }

        System.out.println("Result: " + result);
    }
}
