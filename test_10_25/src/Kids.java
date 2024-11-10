public class Kids extends ManKind {
    private int yearsOld;

    // 构造方法
    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    // 方法：打印yearsOld的值
    public void printAge() {
        System.out.println("Age: " + yearsOld);
    }

    // 覆盖父类的employeed()方法
    @Override
    public void employeed() {
        System.out.println("Kids should study and no job.");
    }

    // 获取yearsOld
    public int getYearsOld() {
        return yearsOld;
    }

    // 设置yearsOld
    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
