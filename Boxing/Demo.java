class Demo{
    public static void main (String [] args){
        //Primitve to object
        int a=100;
        Integer b=Integer.valueOf(a);//auto boxing
        Integer c=a;//auto boxing

        //Object to Primitive
        Character ch1='y';
        char ch2=ch1.charValue(); //UnBoxing
        char ch3=ch1; //UnBoxing

        //String to Primitive
        String s1="123";
        int d=Integer.parseInt(s1);
        //int f=s1; (Not possible)

        //Not possible
        String s2="Y";
        //char e=Character.parseChar(s2);

        //Primitive to String
        int g=100;
        String s3=Integer.toString(g);

        //Object to String
        Integer h=10;
        String s4=Integer.toString(h);

        //String to Object
        String s5="20";
        Integer i=Integer.parseInt(s5);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);

        System.out.println(d);

        System.out.println(s3);

        System.out.println(h);
        System.out.println(s4);

        System.out.println(s5);
        System.out.println(i);
    }
}