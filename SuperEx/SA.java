class SA extends Account{
    int acc_id;
    int acc_amount;
        SA(int id,String name,String email,String loc,int amount){
            super(name,loc,email);
            this.acc_id=id;
            this.acc_amount=amount;
        }

}