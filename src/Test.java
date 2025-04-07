public class Test {
    public static void main(String[] args) {
        char ch = '1';
        boolean b = (int) ch >= 49 || (int) ch <= 122 || ch - '0' >= 0 && ch - '0' < 10 ;

        System.out.println(ch - '0');
    }
}
