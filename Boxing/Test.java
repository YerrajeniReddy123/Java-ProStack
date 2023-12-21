class Emp{}
class Test{
    public static void main (String [] args){
        int [] ids={101,102,103};
        Emp e1=new Emp();
        String s1=new String("Rahul");

        int id=101;
        Integer eid=id; //Auto boxing

        System.out.println(ids);
        System.out.println(e1);
        System.out.println(s1);
        System.out.println(eid);
        System.out.println(id);

    }
}