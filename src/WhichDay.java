//编写程序：从键盘上输入2019年的"month"和"day",
//要求通过程序输出输入的日期为2019年的第几天。
import java.util.Scanner;
public class WhichDay {
    public static void main(String[] args){
        System.out.print("请输入月份：");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        System.out.print("\n请输入日期：");
        int day = scan.nextInt();
        int figuer = 0;
        switch(month) {
            case 1:
                figuer = day;
                System.out.println("日期是2019年的第"+figuer+"天。");
                break;
            case 2:
                figuer = 31 + day;
                System.out.println("日期是2019年的第"+figuer+"天。");
                break;
            case 3:
                figuer = 59 + day;
                System.out.println("日期是2019年的第"+figuer+"天。");
                break;
            case 4:
                figuer = 90 + day;
                System.out.println("日期是2019年的第"+figuer+"天。");
                break;
            case 5:
                figuer = 120 + day;
                System.out.println("日期是2019年的第"+figuer+"天。");
                break;
            case 6:
                figuer = 151 + day;
                System.out.println("日期是2019年的第"+figuer+"天。");
                break;
            case 7:
                figuer = 181 + day;
                System.out.println("日期是2019年的第"+figuer+"天。");
                break;
            case 8:
                figuer = 212 + day;
                System.out.println("日期是2019年的第"+figuer+"天。");
                break;
            case 9:
                figuer = 243 + day;
                System.out.println("日期是2019年的第"+figuer+"天。");
                break;
            case 10:
                figuer = 273 + day;
                System.out.println("日期是2019年的第"+figuer+"天。");
                break;
            case 11:
                figuer = 304 + day;
                System.out.println("日期是2019年的第"+figuer+"天。");
                break;
            case 12:
                figuer = 334 + day;
                System.out.println("日期是2019年的第"+figuer+"天。");
                break;
            default:
                System.out.println("输入有误！");
                break;
        }
    }
}
