package creational.factory_method;

public class FactoryMethodTest {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "8", "500 GB", "2.4 GH");
        Computer server = ComputerFactory.getComputer("server", "24", "2 TB", "3.6 GH");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
