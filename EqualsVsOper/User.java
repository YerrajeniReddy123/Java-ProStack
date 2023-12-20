class User{
    public static void main (String[] args){
        String s1=new String("YDR");
        String s2="YDR";
        String s3=new String("YDR");

        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}