class Account{
    int voter_id;
    String voter_Name;
    Account(int id,String name){
        this.voter_id = id;
        this.voter_Name = name;
        System.out.println("Hello Constructor");
    }
    
    public static void main (String [] args){
        
        Account a1 = new Account(101,"Dilip");
        System.out,println(a1.voter_id +":"+a1.voter_Name);
        System.out.println("Hello Main Method");
    }
}