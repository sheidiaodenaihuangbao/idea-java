public class ManKind {
    private int sex;
    private int salary;

    // 构造方法
    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    // 方法：根据sex的值显示“man”或“woman”
    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("man");
        } else if (sex == 0) {
            System.out.println("woman");
        } else {
            System.out.println("Unknown sex");
        }
    }

    // 方法：根据salary的值显示“no job”或“job”
    public void employeed() {
        if (salary == 0) {
            System.out.println("no job");
        } else {
            System.out.println("job");
        }
    }

    // 获取sex
    public int getSex() {
        return sex;
    }

    // 设置sex
    public void setSex(int sex) {
        this.sex = sex;
    }

    // 获取salary
    public int getSalary() {
        return salary;
    }

    // 设置salary
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
