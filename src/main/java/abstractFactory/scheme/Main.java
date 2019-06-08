package abstractFactory.scheme;

public class Main {
    public static void main(String[] args) {
        //prepare
        AbstractFactory factory1 = new FactoryA();
        AbstractFactory factory2 = new FactoryB();
        //end

        AbstractClass object1 = factory1.create();
        AbstractClass object2 = factory2.create();

        object1.method();
        object2.method();

        ClassA objA = (ClassA) object1;
        objA.print();
    }
}
