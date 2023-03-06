package ClassTutorial;


class Person{
    String name;
    int age;

    String getName() {
        return name;
    }

    public void setName(String new_name) {

        name = new_name;
    }

    int getAge(){
        return age;
    }

    public void setAge(int new_age){
        age = new_age;
    }

    public void setInfo(String name, int age){
        setName(name);
        setAge(age);
    }
}
public class ClassTutorial {
    public static void main(String[] args){

        Person madhav = new Person();
        madhav.name = "Madhav Garg";
        madhav.age = 19;
        System.out.println(madhav.name);
        System.out.println(madhav.getName());
        madhav.setName("Kaitlin Cranston");
        madhav.setAge(20);
        System.out.println(madhav.getName());
        System.out.println(madhav.getAge());
        madhav.setName("Madhav Garg");
        madhav.setAge(19);
        System.out.println(madhav.getName());
        System.out.println(madhav.getAge());
        madhav.setInfo("Bruno", 3);
    }
}
