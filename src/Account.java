import java.util.Date;

public class Account {
    String email;
    String username;
    String fullName;
    Date createDate;

    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
