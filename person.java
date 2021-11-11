public class Person
{
 private String myName ; // name of the person
 private int myAge; // person's age
 private String myGender; // "M" for male, "F" for female
 

 public Person(String name, int age, String gender){
 myName = name;
 myAge = age;
 myGender = gender;
 }

 public String getName(){
 return myName;
 }

public int getAge(){
 return myAge;
}
 public String getGender(){
 return myGender;
 }
 public void setName(String name){
 myName = name;
 }
 public void setAge(int age){
 myAge = age;
 }
 public void setGender(String gender){
 myGender = gender;
 }
 public String toString(){
 return myName + ", age: " + myAge + ", gender: " +myGender;
 }
}

public class Student extends Person{
private String myIdNum; // Student Id Number
private double myGPA; 

public Student(String name, int age, String gender,String idNum, double gpa)
{

super(name, age, gender);
// initialize what's new to Student
myIdNum = idNum;
myGPA = gpa;
}
public String getIdNum(){
return myIdNum;
}
public double getGPA(){
return myGPA;
 }
public void setIdNum(String idNum){
myIdNum = idNum;
}
public void setGPA(double gpa){
myGPA = gpa;
}

public String toString(){
return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
}
}
