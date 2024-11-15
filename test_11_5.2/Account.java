public class Account {
    protected int id;
    protected double balance;
    protected double annualInterestRate;

    // 构造器
    // 初始化账户的ID、余额和年利率
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    // 获取账户ID
    public int getId() {
        return id;
    }

    // 设置账户ID
    public void setId(int id) {
        this.id = id;
    }

    // 获取账户余额
    public double getBalance() {
        return balance;
    }

    // 设置账户余额
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 获取年利率
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // 设置年利率
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // 返回月利率
    // 计算并返回月利率，即年利率除以12再除以100转换为小数形式
    public double getMonthlyInterest() {
        return annualInterestRate / 12 / 100; // 将年利率转换为月利率并转换为小数形式
    }

    // 取款方法
    // 尝试从账户中取款，如果余额不足则打印提示信息并返回false，否则扣除金额并返回true
    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("余额不足！");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    // 存款方法
    // 向账户中存入指定金额
    public void deposit(double amount) {
        balance += amount;
    }
}

