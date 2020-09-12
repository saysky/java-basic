package create.factory.hello3.factoryabstract.factory;

import create.factory.hello3.factoryabstract.model.AirconditionGL;
import create.factory.hello3.factoryabstract.model.Aodi6;
import create.factory.hello3.factoryabstract.model.parent.Aircondition;
import create.factory.hello3.factoryabstract.model.parent.Aodi;


public class ImpFactoryAodi6 implements InfFactory {

    @Override
    public Aodi createAodi() {

        Aodi6 a6 = new Aodi6();
        a6.setAircondition(installAircondition());
        return a6;
    }

    @Override
    public Aircondition installAircondition() {
        return new AirconditionGL();
    }

}
