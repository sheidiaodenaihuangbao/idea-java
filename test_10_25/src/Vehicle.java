public class Vehicle {
    private int speed;
    private String type;
    private String color;

    // 构造方法
    public Vehicle(int speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    // 设置颜色
    public void setColor(String color) {
        this.color = color;
    }

    // 获取颜色
    public String getColor() {
        return color;
    }

    // 获取速度
    public int getSpeed() {
        return speed;
    }

    // 设置速度
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // 获取种类
    public String getType() {
        return type;
    }
}

