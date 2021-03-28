
class ArraysManipulation{
  public static void main(String[] args) {
    String[] arrData = {“Alice”, “Bob”, “Jeremy”, “Sam”, “Henry”, “Sarah”, “Ashley”};
    
   //A. Print each value in the array on a new line with the prefix “Hello my name is “
 for(int i=0; i< arrData.length; i++){
      System.out.println(“Hello my name is”+ “ ” + arrData[i]);
    }
    
    //B.Print the 1st, 3rd, 5th and 7th name.

      System.out.println(“Hello my name is”+ “ ” + arrData[0])
      System.out.println(“Hello my name is”+ “ ” + arrData[2])
      System.out.println(“Hello my name is”+ “ ” + arrData[4]
      System.out.println(“Hello my name is”+ “ ” + arrData[6])
   
      //C.Print the array backwards
      for(i= arrData.length-1; i>=0; i--) {
       System.out.println(“Hello my name is”+ “ ” + arrData[i]);                   
    }
      //D.Print the last name in the array
      System.out.println(“Hello my name is”+ “ ” + arrData.length-1);                   
 
  }
}
