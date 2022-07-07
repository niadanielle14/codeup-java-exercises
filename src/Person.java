public class Person {
    private String name;
    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }
    public Person(String newName) {
        name = newName;
    }
    public void sayHello(){

        System.out.printf("Hello %s%n", name);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Kenny");
        p1.sayHello();
    }

}