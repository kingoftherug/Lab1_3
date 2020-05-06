public class Lab3 {
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
        System.out.println(getBinary(100));
    }
}