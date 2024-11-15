public class TestCheckAccount {
    public static void main(String[] args) {
        // 创建 CheckAccount 对象
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 4.5, 5000);

        // 第一次取款 5000 元
        checkAccount.withdraw(5000);
        System.out.println("账户余额为：" + checkAccount.getBalance());
        System.out.println("可透支额为：" + checkAccount.getOverdraft());

        // 第二次取款 18000 元
        checkAccount.withdraw(18000);
        System.out.println("账户余额为：" + checkAccount.getBalance());
        System.out.println("可透支额为：" + checkAccount.getOverdraft());

        // 第三次取款 3000 元
        checkAccount.withdraw(3000);
        System.out.println("账户余额为：" + checkAccount.getBalance());
        System.out.println("可透支额为：" + checkAccount.getOverdraft());
    }
}
