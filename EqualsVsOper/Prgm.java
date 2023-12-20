class Emp{
    Emp(String name){

    }
    public static void main (String[] args){
        String s1=new String ("YDR");
        String s2=new String("YDR");

        String s3="YDR";
        String s4="YDR";

        Emp e1=new Emp("YDR");
        Emp e2=new Emp("YDR");
        
        System.out.println(e1.equals(e2));
        System.out.println(s1.equals(s2));
        System.out.println(e1.equals(s1));
        System.out.println(e1==s1);
        
    }
}