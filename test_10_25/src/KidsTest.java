public class KidsTest {
    public static void main(String[] args) {
        // 实例化Kids的对象someKid
        Kids someKid = new Kids(0, 0, 10);

        // 访问父类的成员变量及方法
        System.out.println("Sex: " + someKid.getSex());
        System.out.println("Salary: " + someKid.getSalary());
        someKid.manOrWoman();
        someKid.employeed();

        // 访问子类的成员变量及方法
        someKid.printAge();
    }
}
