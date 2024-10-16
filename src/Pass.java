//对于学生成绩大于60分的，输出"合格"。
// 低于60分的，输出"不合格"。
import java.util.Scanner;

public class Pass {
    public static void main(String[] ager) {
        System.out.print("请输入成绩：");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score >= 60) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }
    }

}
