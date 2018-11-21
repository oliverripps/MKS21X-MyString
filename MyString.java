public class MyString implements CharSequence/*,Comparable<CharSequence>*/{
  //THROW EXCEPTIONS FROM DOCUMENTATION
  private char[] data;
  public MyString(CharSequence s){
  for(int i=0;i<s.length();i++){
    data[i]=charAt(i);
  }
  }
  public char charAt(int index){
    return data[index];

  }
  public int length(){
    return data.length();
  }
  public CharSequence subSequence(int start, int end){
  }
  public String toString(){
  }

}
