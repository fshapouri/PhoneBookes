
import java.util.Scanner;

public class TestPhoneBookes {
    public static void main(String[] args) throws Exception {
        view p = new view();
              p.doContact();
             PhoneBook phoneBook=new PhoneBook();
              PhoneBooKDAO.insertPhonebook(phoneBook);



    }
}
