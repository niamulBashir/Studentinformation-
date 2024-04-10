import java.util.HashMap;
import java.util.Map;

class StudentInfo{    
public void Add(int id, String name, int age, double grade){
Student.names.put(id, name);
Student.Age.put(id, age);
Student.grade.put(id,grade);

}

public void update(int id, String name, int age, int grade){
if(name !=null)
{
   for(Integer key : Student.names.keySet())
   {
      if(key==id)
      {
         Student.names.put(id,name);
      }
   }
}
}

public void Remove(int id){
 Student.names.remove(id);   
 Student.Age.remove(id);
 Student.grade.remove(id);
}

public void display(){
for (Integer  id : Student.names.keySet()) 
{
    System.out.println( id + ". Name is :" + Student.names.get(id)+ " age is :" + Student.Age.get(id) + " Grades is :" + Student.grade.get(id));
}
}


}

public class Student{
   static Map<Integer,String> names = new HashMap<>();
   static Map<Integer,Integer> Age = new HashMap<>();
   static  Map<Integer,Double> grade = new HashMap<>();
 public static void main(String a[]){

    StudentInfo obj1 = new StudentInfo();
    obj1.Add(1,"Ruhul", 34,4);
    obj1.Add(2,"Niamul", 36,3.8);
    obj1.Add(3,"Bashir", 37,3.8);
    obj1.display();
    obj1.Remove(1);
    System.out.println("After remove");

    obj1.display();
    obj1.update(3, "Khan", 0, 0);
    obj1.display();

 }   

}