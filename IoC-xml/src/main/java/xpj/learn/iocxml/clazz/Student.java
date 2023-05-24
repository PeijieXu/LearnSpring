package xpj.learn.iocxml.clazz;

public class Student {
    private String name;

    private Clazz clazz;

    public Student() {
    }

    public void study(){
        System.out.println(name + " is studying in class "+clazz.getNumber());
    }

    public String getName() {
        return name;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
}
