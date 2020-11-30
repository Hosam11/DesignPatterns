package creational.abstract_factory;

import creational.factory_method.Computer;

/**
 * Notice that createComputer() method is returning an instance of super class Computer.
 * Now our factory classes will implement this interface and return their respective sub-class.
 */
public interface ComputerAbstractFactory {

    Computer createComputer();
}
