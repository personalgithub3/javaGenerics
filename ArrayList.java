import java.util.*;
public class ArrayList{
public static void main(String ardg[]){

ArrayList<String> st=new ArrayList<String>();

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
