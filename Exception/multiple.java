class multiple{
    public static void main(String[] args){
        try{
            System.out.println(1/0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            int [] ids={1,2};
            System.out.println(ids[3]);
        }
        catch(Exception s){
            System.out.println(s.getMessage());
        }
    }
}