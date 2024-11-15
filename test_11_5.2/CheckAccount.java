//CheckAccount类继承自Account类，表示一个可以透支的支票账户
//它增加了一个透支额度的功能，允许账户余额在一定限额内为负

public class CheckAccount extends Account {
    // 可透支限额
    private double overdraft;


// 初始化一个新的CheckAccount对象，除了基础的账户信息外，还需要指定透支额度
//param id              账户ID
//param balance         账户初始余额
//param annualInterestRate 年利率
// overdraft       可透支限额

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    //获取可透支限额

    public double getOverdraft() {
        return overdraft;
    }

    // 设置可透支限额

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

     //重写取款方法
     //允许账户在透支额度内进行取款操作如果取款金额超过余额加上透支额度，则取款失败

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            double neededOverdraft = amount - balance;
            if (neededOverdraft <= overdraft) {
                balance = 0;
                overdraft -= neededOverdraft;
                return true;
            } else {
                System.out.println("超过可透支额的限额！");
                return false;
            }
        }
    }
}
