//（1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
//（2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：public void printAreas(Circle c,int time)
//在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
//（3）在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示。
public class Circle {
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double findArea(double i){
        return Math.PI*radius*radius;
    }
    class PassObject {
        public void printAreas(Circle c,int time){
            for(double i=1;i<=time;i++){
                System.out.println(i+" "+c.findArea(i));
            }
        }
    }
    public class Main {
        public void main(String[] args) {
            Circle circle = new Circle(5); // 初始半径可以任意设置，因为会在printAreas中改变
            PassObject passObject = new PassObject();

            int times = 5; // 可以根据需要修改这个值
            passObject.printAreas(circle, times);

            // 输出当前半径值
            System.out.println("Current Radius: " + circle.getRadius());
        }
    }
}
