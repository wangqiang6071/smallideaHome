package springBeas.HellWorld;

public class StuBean {
    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public void sayHello(){
        System.out.println(name+age);
    }
}
