package SPRING.XML;

public class MySingletonBean {

    private String myShortString;

    public MySingletonBean(String myShortString) {
        System.out.println("MySingletonBean is beaned");
        System.out.println("And my short string is: " + myShortString);
    }

    public String getTheMessage() {
        return "Hello my friend";
    }
}
