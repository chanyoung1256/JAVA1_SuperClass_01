package SuperClass_01;

public class ManagerTest {
    public static void main(String[] args)
    {
        Manager m = new Manager("Tom", "Seoul", 1000000, 123456, 5000);
        System.out.println(m);
        m.test();
    }
}
