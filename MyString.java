public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
//Loop through CharSequence and put values into data
    data=new char[s.length()];
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

  public int compareTo(CharSequence o){
    //checking for null CharSequences
    if(o==null || this==null){
      throw new NullPointerException();
    }
    //creating an integer value as last check of compareTo
    int lastcomp=this.length();
    //if one length is longer than another, set it to the shorter one
    if(this.length()>o.length()){
      lastcomp=o.length();
    }
    //looping through the two CharSequences and once one has a higher ASki value, the proper number gets returned
    for(int i =0;i<lastcomp;i++){
      int cur1 = (int) this.charAt(i);
      int cur2 = (int) o.charAt(i);
      if(cur1<cur2){
        return -1;
      }
      if(cur1>cur2){
        return 1;
      }
    }
    //assuming the are the same through the smaller number of letter's letters, you check length
      if(this.length()> o.length()){
        return 1;
      }
      if(o.length()>this.length()){
        return -1;
      }
    //if they are still the same it means they are the same and 0 is returned
      return 0;}


    }
