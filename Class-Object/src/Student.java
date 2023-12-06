public class Student {
    //class student - template for creating object (student)
    public String name;
    public int marks;
    public String regno;
    /*this is a constructor - block of code that creates an instance of an object student.
    it is similar to object though the constructor does not  return value
     */

    public Student(String name, int marks, String regno) {
        this.name = name;
        this.marks = marks;
        this.regno = regno;
    }
//setters - set the value of variable
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }
//getters () method- retrieves the value of variable
    public int getMarks() {
        return marks;
    }

    public String getRegno() {
        return regno;
    }
//toString() method - returns string representation of the objects

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", regno='" + regno + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("jafeth",40,"ic-2020");
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println(student.getMarks());
        System.out.println(student.getRegno());
    }
}
