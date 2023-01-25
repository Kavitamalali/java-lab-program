interface Resume{
	void biodata();
}
class Teacher implements Resume{
	String name,Qualification,Achievement;
	float expe;
	public void biodata(){
		name="yash";
		Qualification="M.Tech";
		Achievement="Android developer";
		expe=10.6f;
		System.out.println("Name:"+name);
		System.out.println("Qualification:"+Qualification);
		System.out.println("Achievement:"+Achievement);
	}
}
class Student implements Resume{
	String name,Discipline;
	float result;
	public void biodata(){
	   name="kavita";
	   Discipline="CSE";
	   result=9.5f;
	   System.out.println("Name:"+name);
	   System.out.println("Discipline:"+Discipline);
	   System.out.println("Result:"+result+"CGPA");
   }
}
public class InterfaceE {
	public static void main(String args[]){
	Teacher T1=new Teacher();
	T1.biodata();
	Student S1=new Student();
	S1.biodata();
	}
}





