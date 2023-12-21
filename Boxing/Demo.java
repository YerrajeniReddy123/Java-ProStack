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

        String s1="YDR";
        int d=Integer.parseInt(s1);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);

        System.out.println(d);
    }
}