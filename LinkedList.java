import java.util.*;
public class LinkedList{
public static void main(String ardg[]){

LinkedList<String> st=new LinkedList<String>();

st.add("vamsi");
st.add("dinesh");

System.out.println(st.get(1));

Iterator<String> itr=st.iterator();

while(itr.hasNext())
{
    System.out.println(itr.next());
}


}
}
