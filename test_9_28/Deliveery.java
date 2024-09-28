import java.util.Scanner;

public class Deliveery {
    public static void main(String[] args) {
        //创建一个scanner对象用于接
        Scanner scanner = new Scanner(System.in);
        //输入整数
        System.out.println("输入整数:");
        int integer = scanner.nextInt();
        //个
        int units = integer % 10;
        //十
        int tens = integer / 10 % 10;
        //百
        int hundred = integer / 100 % 10;
        System.out.printf("个位" + units + "十位" + tens + "百位" + hundred);
    }
}