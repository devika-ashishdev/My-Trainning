class Student {
int id;
String name;
static String college="obsqura";
public static void main(String arg[])
{
Student s1=new Student();
s1.id=101;
s1.name="devika";
Student s2=new Student();
s2.id=102;
s2.name="raj";
System.out.println(s1.id);
System.out.println(s1.name);
System.out.println(college);
System.out.println(s2.id);
System.out.println(s2.name);
System.out.println(college);
}
}