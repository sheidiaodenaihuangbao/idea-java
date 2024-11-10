//1.写一个名为Rectangle的类表示矩形。
// 其属性包括宽width、高height和颜色color，
// width和height都是double型的，而color则是String类型的。要求该类具有：
//        (1)使用构造函数完成各属性的初始赋值
//        (2)使用getter和setter的形式完成属性的访问及修改
//        (3)提供计算面积的getArea()方法
    public class Rectangle {
    double width;
    double height;
    String color;
    public Rectangle(double width,double height,String color){
        this.width=width;
        this.height=height;
        this.color=color;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height){
        this. height = height;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color= color;
    }
    public double getArea(){
        return width*height;
    }
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(3.5,4.4,"红色");
        System.out.println(r1.getArea());
    }
}
