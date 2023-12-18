class Equals{
    public static void main (String[] args){
        String fName="Pro";
        String IName="Pro";
        String mName=new String("Pro");
        String nName=new String("Pro");

        //For String Literals -->Content Comparision
        System.out.println(fName.equals(IName)); //Content Comparision
        System.out.println(fName==IName); //Content Comparision

        //For String Literal and String Object ---> Reference Comparision
        System.out.println(fName==mName);

        //For String Object ---> Reference Comparision
        System.out.println(mName==nName);
    }
}