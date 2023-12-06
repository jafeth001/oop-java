public class Main {
    //we make variables private not to be accessed to outside this class
    private String name;
    private int age;

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //provide getters and setters to access and update the variables
    public void setName(String name) {
        this.name = name;
    }
    public void setName(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Main main = new Main("jafeth",20);
        System.out.println("name is "+main.getName()+"age is "+main.getAge());
    }
}