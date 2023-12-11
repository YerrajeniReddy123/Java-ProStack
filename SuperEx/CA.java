class CA extends Account{
    String acc_name;
    String acc_loc;
    String acc_email;
    int acc_id;
    int acc_amount;
        CA(int id,String name,String email,String loc,int amount){
            super(name,loc,email);
            this.acc_name=name;
            this.acc_loc=loc;
            this.acc_email=email;      
            this.acc_id=id;
            this.acc_amount=amount;
            }
}