class Parent{}
class Child extends Parent{}
class Emp{}
class Demo{
    public static void main(String[] args){
        String s1=new String("YDR");
        String s2=new String("YDR");

        String s3="YDR";
        String s4="YDR";

        Parent p1=new Parent();
        Child c1=new Child();
        Emp e1=new Emp();
        Emp e2=new Emp();

        int a=100;
        int b=200;
        int c=100;

        System.out.println(s1==s2);  //ref. comparision 
        System.out.println(s1.equals(s2)); //content comparision 

        System.out.println(p1==c1);
        System.out.println(p1.equals(c1)); //ref. Comparision

        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        System.out.println(a==c);
        //System.out.println(a.equals(c)); //CTE
    }
}