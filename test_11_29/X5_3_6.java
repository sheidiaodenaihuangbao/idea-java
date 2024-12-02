// 导入 Circle 类
import circle.Circle;

// 导入 Cylinder 类
import cylinder.Cylinder;

// 定义一个主类 X5_3_6
public class X5_3_6 {
    // 定义主方法 main
    public static void main(String[] args) {
        // 创建两个圆对象
        Circle cir1 = new Circle(5.0);
        Circle cir2 = new Circle(7.0);

        // 显示圆的面积和周长
        System.out.println("圆1的面积: " + cir1.area());
        System.out.println("圆1的周长: " + cir1.perimeter());
        System.out.println("圆2的面积: " + cir2.area());
        System.out.println("圆2的周长: " + cir2.perimeter());

        // 创建两个圆柱体对象
        Cylinder cy1 = new Cylinder(5.0, 10.0);
        Cylinder cy2 = new Cylinder(7.0, 15.0);

        // 显示圆柱体的底圆的面积和周长以及体积和表面积
        System.out.println("圆柱体1的底圆面积: " + cy1.area() / 2);
        System.out.println("圆柱体1的底圆周长: " + cy1.perimeter());
        System.out.println("圆柱体1的体积: " + cy1.volume());
        System.out.println("圆柱体1的表面积: " + cy1.area());

        System.out.println("圆柱体2的底圆面积: " + cy2.area() / 2);
        System.out.println("圆柱体2的底圆周长: " + cy2.perimeter());
        System.out.println("圆柱体2的体积: " + cy2.volume());
        System.out.println("圆柱体2的表面积: " + cy2.area());
    }
}
