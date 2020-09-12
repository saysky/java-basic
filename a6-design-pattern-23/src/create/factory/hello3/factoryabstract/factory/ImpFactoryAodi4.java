package create.factory.hello3.factoryabstract.factory;

import create.factory.hello3.factoryabstract.model.AirconditionMD;
import create.factory.hello3.factoryabstract.model.Aodi4;
import create.factory.hello3.factoryabstract.model.parent.Aircondition;
import create.factory.hello3.factoryabstract.model.parent.Aodi;


public class ImpFactoryAodi4 implements InfFactory {

    @Override
    public Aodi createAodi() {
        Aodi4 a4 = new Aodi4();
        a4.setAircondition(installAircondition());
        return a4;
    }

    @Override
    public Aircondition installAircondition() {
        return new AirconditionMD();
    }

}
