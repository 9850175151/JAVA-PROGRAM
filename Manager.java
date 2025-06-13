class sarthak {
    String name;
    int age;

    void info(String name) {
        System.out.println("Name: " + name);
    }

    void info(int age) {
        System.out.println("Age: " + age);
    }
}

public class Manager {
    public static void main(String[] args) {
        sarthak s1 = new sarthak();
        s1.info("wagh"); 
        s1.info(22);        
    }
}

