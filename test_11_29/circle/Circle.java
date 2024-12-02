// 定义一个包名为 circle 的包
package circle;

// 导入 Shape 接口
import shape.Shape;

// 定义一个类 Circle 实现 Shape 接口
public class Circle implements Shape {
    // 定义一个属性 radius 表示圆的半径
    public double radius;

    // 定义一个构造器
    public Circle(double radius) {
        this.radius = radius;
    }

    // 实现 Shape 接口中的 area 方法

    public double area() {
        return PI * radius * radius;
    }

    // 定义一个方法 perimeter 求圆的周长
    public double perimeter() {
        return 2 * PI * radius;
    }
}
