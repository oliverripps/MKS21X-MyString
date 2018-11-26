public class MyString implements CharSequence/*,Comparable<CharSequence>*/{
  //THROW EXCEPTIONS FROM DOCUMENTATION
  private char[] data;
  public MyString(CharSequence s){
  for(int i=0;i<s.length();i++){
    data[i]=s.charAt(i);
  }
  }
  public char charAt(int index){
    if(index<length() && index>=0){
      return data[index];
    }
    else{
      throw new IndexOutOfBoundsException();
    }}
  public int length(){
    return data.length;
  }
  public CharSequence subSequence(int start, int end){

  }
  public String toString(){
    String s = "";
    for(int i=0; i<length();i++){
      s+=charAt(i);
    }
    return s;
  }

}
