class Test{
    public static void main (String[] args){
        //System.out.println("Hello GM!!");
        Account a1=new Account();
        a1.open_Account();
        System.out.println(a1.deposit_Amount(5000));
        System.out.println(a1.bal_details());
        a1.withdrawl_amount(20000);
        System.out.println(a1.check_bal());
        
    }
}