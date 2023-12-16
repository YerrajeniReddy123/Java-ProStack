class Writer{
    public String toString(){
        return "Rahul";
    }
}
class User1 extends Writer{
    public static void main (String[] args){
        User1 a1=new User1();
        System.out.println(a1);
        User1 a2=new User1();
        System.out.println(a1==a2); //false(address is different)
       // System.out.println(a1.equalto(a2)); //CTE
        
        
        //System.out.println(a1.toString());
        //System.out.println(a1);


    }
}