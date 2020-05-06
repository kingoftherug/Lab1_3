package Tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInpurt {

    private String str;

    public String getStr() {
        return str;
    }
    public void setStr (String promt) {
        String inputLine = null;
        System.out.print((promt + " "));
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) str = null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        str = inputLine;
    }
}
