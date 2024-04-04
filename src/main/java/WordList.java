import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
int jacob = 0;
    for (int i = myList.size()-1; i>=0; i--){
    if (myList.get(i).length() == len )
    jacob++;
  }
  return jacob;    
  }

  public void removeWordsOfLength(int len)
  {
 for (int i = myList.size()-1; i>=0; i--){
if (myList.get(i).length() == len)
 myList.remove(i);
  }
  }
}
