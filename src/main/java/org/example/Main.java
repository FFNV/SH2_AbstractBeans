package org.example;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        A a = context.getBean(A.class);
        B b = context.getBean(B.class);
        C c = context.getBean(C.class);
        D d = context.getBean(D.class);
        E e = context.getBean(E.class);
        e.methodToReplace();
        F f = context.getBean(F.class);

        context.close();
    }
}
