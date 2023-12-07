class Account{
    int bal=0;
    static int min_bal=500;
    public void open_Account(){
        System.out.println("Account is Successfully opened");
    }
    public boolean deposit_Amount(int amnt){
        this.bal = this.bal + amnt;
        return true;
    }
    public int bal_details(){
        return this.bal = this.bal - this.min_bal;
    }
    public void withdrawl_amount(int amount){
        this.bal = this.bal - amount;
    }
    public int check_bal(){
        return this.bal = this.bal - this.min_bal;
    }

}