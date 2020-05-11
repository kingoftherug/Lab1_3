package Lab1;
import Tools.UserInpurt;

public class Lab1_3 {
    public static String getBinary (int num) {
        StringBuilder a = new StringBuilder();
        while (num>0) {
            a.append(num%2);
            num=num/2;
        }
        a.reverse();
        return a.toString();
    }

    public static void main(String[] args) {
        UserInpurt ui = new UserInpurt();
        ui.setStr("Input decimal number: ");
        try {
            System.out.println(getBinary(Integer.parseInt(ui.getStr())));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
