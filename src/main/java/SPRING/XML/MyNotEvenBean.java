package SPRING.XML;

public class MyNotEvenBean {

    private MySingletonBean mySingletonBean;
    public MyNotEvenBean(MySingletonBean mySingletonBean) {
        System.out.println("MyNotEvenBean is beaned too");
        System.out.println("MySingletonBean in MyNotEvenBean is: " + mySingletonBean);
        System.out.println("And he says: " + mySingletonBean.getTheMessage());
    }
}
