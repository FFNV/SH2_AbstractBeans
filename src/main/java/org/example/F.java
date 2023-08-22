package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class F implements InitializingBean, DisposableBean {
    public void stepInit() {
        System.out.println("инициализация");
    }

    public void stepDestroy() {
        System.out.println("разрушение");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Метод после установки свойств");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Метод уничтожения");
    }
}

