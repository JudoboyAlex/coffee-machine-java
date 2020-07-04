import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();

        switch (shape) {
            case "triangle":
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                double p = (a+b+c) * 0.5;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(area);
                break;
            case "rectangle":
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                double area2 = a2 * b2;
                System.out.println(area2);
                break;
            case "circle":
                int a3 = sc.nextInt();
                double area3 = a3 * a3 * 3.14;
                System.out.println(area3);
                break;
            default:
                System.out.println("error!");
        }
    }
}
