public class Teache {
    private String id;
    private String name;
    private String title;
    private double salary;
    public static String school;

    // 构造函数
    public Teache(String id, String name, String title, double salary) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    // Getter 方法
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "工号: " + id + ", 姓名: " + name + ", 职称: " + title + ", 薪水: " + salary + ", 学校: " + school;
    }
}
