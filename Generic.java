import java.util.*;
class Test<T>{
    T obj;
    Test(T t){
        
         this.obj=t;
    }
  public void getObject(){
       System.out.println(obj);
  }
  public static void main(String args[]){
      Test<String> vamsi=new Test<String>("vamsi");
      vamsi.getObject();
  }
     
}
class Generic{
     public static void main(String args[]){
      Test<String> vamsi=new Test<String>("vamsi");
     // System.out.println(vamsi.getObject());
     vamsi.getObject();
     
     Test<Integer> inte=new Test<Integer>(123);
     inte.getObject();
  }
}
