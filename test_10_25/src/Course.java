public class Course {
    private String courseId;
    private String courseName;
    private int theoryHours;
    private int labHours;
    private int credits;
    private Teacher teacher;

    // 构造函数
    public Course(String courseId, String courseName, int theoryHours, int labHours, int credits, Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.theoryHours = theoryHours;
        this.labHours = labHours;
        this.credits = credits;
        this.teacher = teacher;
    }

    // 获取教师对象
    public Teacher getTeacher() {
        return teacher;
    }

    // 输出课程和教师信息
    public void printDetails() {
        System.out.println("课程编号: " + courseId);
        System.out.println("课程名称: " + courseName);
        System.out.println("理论课时: " + theoryHours);
        System.out.println("实验课时: " + labHours);
        System.out.println("学分: " + credits);
        System.out.println("任课教师: " + teacher);
    }
}
class Main {
    public static void main(String[] args) {
        // 设置学校名称
        Teacher.school = "XYZ University";

        // 创建教师对象
        Teacher teacher = new Teacher("T001", "张三", "副教授", 8000.0);

        // 创建课程对象
        Course course = new Course("C001", "计算机科学导论", 60, 30, 5, teacher);

        // 输出课程及教师信息
        course.printDetails();
    }
}

