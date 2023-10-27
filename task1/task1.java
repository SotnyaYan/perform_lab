public class task1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int temp = 1;
        do {
            System.out.print(temp);
            temp = (temp + m - 2) % n + 1;
        } while (temp != 1);
    }
}