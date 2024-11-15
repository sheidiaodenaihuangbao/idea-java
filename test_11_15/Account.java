public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    // 构造器
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    //获取账户ID
    public int getId() {
        return id;
    }

    //设置账户ID
    public void setId(int id) {
        this.id = id;
    }

    // 获取账户余额
    public double getBalance() {
        return balance;
    }

    //设置账户余额
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //获取年利率
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // 设置年利率
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // 计算并返回月利率
    //月利率通过将年利率除以12并转换为小数形式得到
    public double getMonthlyInterest() {
        return annualInterestRate / 12 / 100; // 将年利率转换为月利率并转换为小数形式
    }

    // 取款方法
    // 如果取款金额大于账户余额，则显示错误信息并返回false
    // 否则，从余额中扣除取款金额并返回true
    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("余额不足！");
            return false;
        } else {
            //取款金额 如果取款成功则为true，否则为false
            balance -= amount;
            return true;
        }
    }

    // 存款方法
    //将指定金额添加到账户余额中
    public void deposit(double amount) {
        balance += amount;
    }
}
