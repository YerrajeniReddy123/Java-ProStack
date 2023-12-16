class Writer{
    public String toString(){
        return "Rahul";
    }
}
class User extends Writer{
    public static void main (String[] args){
        User a1=new User();
        System.out.println(a1);
        User a2=new User();
        System.out.println(a1==a2); //false(address is different)
       // System.out.println(a1.equalto(a2)); //CTE
        
        
        //System.out.println(a1.toString());
        //System.out.println(a1);


    }
}