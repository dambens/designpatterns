package abstractFactory.scheme;

public class FactoryA implements AbstractFactory {
    public AbstractClass create() {
        return new ClassA();
    }
}
