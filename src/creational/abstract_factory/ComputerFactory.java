package creational.abstract_factory;

import creational.factory_method.Computer;

/**
 * Notice that its a simple class and getComputer method is accepting ComputerAbstractFactory argument
 * and returning Computer object
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
