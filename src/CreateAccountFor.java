import java.util.Date;

public class CreateAccountFor {
    public static void main(String[] args) {
        //Khởi tạo mảng 5 phần từ Account
        Account[] accounts = new Account[10];

        // khai báo các giá trị
        for(int i = 0; i<10; i++){
            //Tạo một account tạm thời để gán giá trị
            Account accountTemp = new Account();
            accountTemp.email = "Email " + (i+1);
            accountTemp.username = "Username " + (i+1);
            accountTemp.fullName = "FullName " + (i+1);
            accountTemp.createDate = new Date();

            //Gán account vừa tạo ở trên vào trong mảng Accounts
            accounts[i] = accountTemp;
        }

        //in danh sach account ra:
        for(Account a : accounts){
            System.out.println(a.toString());
        }
    }
}
