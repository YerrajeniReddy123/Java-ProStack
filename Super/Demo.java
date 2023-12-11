class Parent{
    Parent(int b){
        System.out.println(b);
    }
}
class Child extends Parent{
    Child(int a,int b){
        super(b);
        System.out.println(a + b);
    }
}
class Demo{
    public static void main(String[] args){
        Child a1=new Child(10,20);
        
    }
}