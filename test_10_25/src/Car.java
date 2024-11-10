public class Car extends Vehicle {
    private int passenger;

    // 构造方法
    public Car(int speed, String type, int passenger) {
        super(speed, type);
        this.passenger = passenger;
    }

    // 获取可容纳旅客的人数
    public int getPassenger() {
        return passenger;
    }

    // 设置可容纳旅客的人数
    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    // 获取最大速度
    public int getMaxSpeed() {
        // 假设最大速度为当前速度的两倍
        return getSpeed() * 2;
    }
}
