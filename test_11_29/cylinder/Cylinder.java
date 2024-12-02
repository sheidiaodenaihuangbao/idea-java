// 定义一个包名为 cylinder 的包
package cylinder;

// 导入 Circle 类
import circle.Circle;
import shape.Shape;

// 定义一个类 Cylinder 继承 Circle 类
public class Cylinder extends Circle {
    // 定义一个属性 height 表示圆柱体的高度
    private double height;

    // 定义一个构造器
    public Cylinder(double radius, double height) {
        super(radius); // 调用父类的构造器
        this.height = height;
    }

    // 重写 area 方法，求圆柱体的表面积

    public double area() {
        // 表面积 = 2 * 圆面积 + 侧面积
        return 2 * super.area() + 2 * Shape.PI * super.radius * height;
    }

    // 定义一个方法 volume 求圆柱体的体积
    public double volume() {
        return super.area() * height;
    }
}
