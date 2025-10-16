package first_exam;

public class loop {
    public static void main(String[] args) {
        int x = 2;
        for (int i = 0; i <= 3; i++) {
            x = x*i + x;
        }
        System.out.println(x);
    }
}
