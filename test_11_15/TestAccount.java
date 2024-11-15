public class TestAccount {
    public static void main(String[] args) {
        // 创建 Account 对象
        Account account = new Account(1122, 20000, 4.5);

        // 测试取款功能
        account.withdraw(30000); // 应该显示余额不足
        System.out.println("您的帐户余额为：" + account.getBalance());

        // 再次尝试取款
        account.withdraw(2500);

        // 存款
        account.deposit(3000);

        // 统一打印最终余额和月利率
        System.out.println("您的帐户余额为：" + account.getBalance());
        System.out.println("月利率为：" + account.getMonthlyInterest());
    }
}
