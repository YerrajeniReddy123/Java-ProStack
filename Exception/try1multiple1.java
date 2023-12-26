class try1multiple1{
    public static void main(String[] args){
        try{
            System.out.println(1/0);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException s){
            System.out.println(s.getMessage());
        }
    }
}