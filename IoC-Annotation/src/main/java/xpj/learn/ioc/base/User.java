package xpj.learn.ioc.base;


import org.springframework.stereotype.Component;

@Component(value = "ioc-user")   // default will be user
public class User {
    private String name;

//    public User() {
//    }
//
//    public User(String name) {
//        this.name = name;
//    }


}
