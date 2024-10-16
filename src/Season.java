//根据用于指定月份，打印该月份所属的季节。
//3，4，5春季 6，7，8夏季 9，10，11秋季 12，1，2冬季
import java.util.Scanner;
public class Season {
    public static void main(String[] args){
        System.out.print("请输入月份：");
        Scanner scan = new Scanner(System.in);
        int seasonCount = scan.nextInt();
        switch (seasonCount){
            case 1, 2, 12:
                System.out.println("冬季");
                break;
            case 3, 5, 4:
                System.out.println("春季");
                break;
            case 6, 7, 8:
                System.out.println("夏季");
                break;
            case 9, 10, 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
