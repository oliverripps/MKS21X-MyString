public class MyString implements CharSequence/*,Comparable<CharSequence>*/{
  private char[] data;

public MyString(CharSequence s){
//Loop through CharSequence and put values into data
  for(int i=0;i<s.length();i++){
    data[i]=s.charAt(i);
  }
  }

  public char charAt(int index){
    //Check if index is valid
    if(index<length() && index>=0){
      //return the character at
      return data[index];
    }
    else{
      //handle cases in which indeces are not correcy
      throw new IndexOutOfBoundsException();
    }}

  public int length(){
    //returns the length of the Array
    return data.length;
  }
  public CharSequence subSequence(int start, int end){
    String s = "";
    //checks that start is not after end and that the values are valid
    if(start<=end && start>=0 && end>=0){
      //loop through and add each value to the String
      for(int i=start;i<end;i++){
        s+=charAt(i);
      }
    }
    else{
      //handling invalid imputs
      throw new IndexOutOfBoundsException();
    }
    //creating an instance of MyString with this string
    CharSequence c = new MyString(s);
    //returning the charSequence made
    return c;
  }
  public String toString(){
    String s = "";
    //looping through and adding to the string each character
    for(int i=0;i<length();i++){
      s+=charAt(i);
    }
    return s;
  }

}
