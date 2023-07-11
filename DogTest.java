package SuperClass_01;

class Animal1
{
    public void sound()
    {

    }
}
class Dog extends Animal1
{
    public void sound()
    {
        System.out.println("멍멍 ! ");
    }
};
public class DogTest {
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.sound();
    }
}
