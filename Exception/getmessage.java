class getmessage{
    public static void main(String[] arrgs){
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}