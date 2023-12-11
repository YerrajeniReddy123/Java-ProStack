class Parent{
    Parent(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child class");
    }
}
class Test{
    public static void main(String[] args){
        Child a1=new Child();
    }
}