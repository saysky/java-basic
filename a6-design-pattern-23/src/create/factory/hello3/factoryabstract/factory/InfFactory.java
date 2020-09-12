package create.factory.hello3.factoryabstract.factory;

import create.factory.hello3.factoryabstract.model.parent.Aircondition;
import create.factory.hello3.factoryabstract.model.parent.Aodi;


public interface InfFactory {
    Aodi createAodi();

    Aircondition installAircondition();
} 
