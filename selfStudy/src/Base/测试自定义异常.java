package Base;

public class 测试自定义异常 {
    /**
     * 编写自定义异常类MyException 继承异常类
     * 编写账号类Account 账号，余额，可以存取，查看余额，设置账号
     * 编写主方法，测试取款异常
     */
    public static class MyException extends Exception{
        double amount;
        public MyException(double amount) {
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }
    }
    public static class Account{
        private Integer number;
        private double balance;

        public Account(Integer number) {
            this.number = number;
        }

        public double getBalance() {
            return balance;
        }
        public void Deposit(double amount){
            balance += amount;
        }
        public void WithdrawMoney(double amount) throws MyException {
            if(amount > balance){
                double needs = amount - balance;
                throw new MyException(needs);
            }
            else {
                balance -= amount;
            }
        }

    }

    public static void main(String[] args) throws MyException {
        Account account = new Account(12);
        System.out.println(account.getBalance());
        account.Deposit(800);
        account.WithdrawMoney(100);
        try{account.WithdrawMoney(1000);}
        catch (MyException e){
            System.out.printf("取款金额超出余额 %f 元",e.getAmount());
        }
    }

}
