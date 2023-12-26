class Demo{
    public static void main(String[] args){
        String [] names={"YDR","YVR","YSR"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        try{
            System.out.println(names[3]);
        }
        catch(Exception e){
            System.out.println(names[2]);
        }
    }
}