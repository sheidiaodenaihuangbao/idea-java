//1.写一个名为Rectangle的类表示矩形。其属性包括宽width、高height
// 和颜色color，width和height都是double型的，而color则是String类型的。要求该类具有：
//(1)使用构造函数完成各属性的初始赋值
//(2)提供计算面积的getArea()方法
//(3)创建一个宽为4.5，高为8.6的矩形，并利用getArea()方法输出矩形面积。
public class Rectangle {
    double width;
    double height;
    String color;
    Rectangle(double v1,double v2, String i){
        width = v1;
        height = v2;
        color = i;
    }
    public double getArea(){
        return width * height;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.5,8.6,"红色");
        double i =rectangle.getArea();
        System.out.println(i);

    }
}
