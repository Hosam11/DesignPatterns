package creational.abstract_factory;

import creational.factory_method.Computer;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(
                new PCFactory("8 GB", "500 GB", "2.4 GH")
        );
        Computer server = ComputerFactory.getComputer(
                new ServerFactory("24 GB", "2 TB", "3.6 GH")
        );

        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }


}
