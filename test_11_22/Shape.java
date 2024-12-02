// 定义抽象类 Shape
abstract class Shape {
    // 私有属性 color
    private String color;

    // 构造器，为 color 赋值
    public Shape(String color) {
        this.color = color;
    }

    // 抽象方法，用于计算周长
    public abstract double calcPerimeter();

    // 获取颜色的方法
    public String getColor() {
        return color;
    }
}

// 定义子类 Triangle
class Triangle extends Shape {
    // 三角形的三条边
    private double side1;
    private double side2;
    private double side3;

    // 构造器
    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // 实现计算周长的方法
    @Override
    public double calcPerimeter() {
        return side1 + side2 + side3;
    }
}

// 定义子类 Circle
class Circle extends Shape {
    // 圆的半径
    private double radius;

    // 构造器
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // 实现计算周长的方法
    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }
}
