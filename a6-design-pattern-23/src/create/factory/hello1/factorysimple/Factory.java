package create.factory.hello1.factorysimple;

import create.factory.hello1.factorysimple.model.Aodi;
import create.factory.hello1.factorysimple.model.Aodi4;
import create.factory.hello1.factorysimple.model.Aodi6;

public class Factory {


    public static Aodi create(int type) {
        switch (type) {

            case 4:
                return new Aodi4();

            case 6:
                return new Aodi6();

            default:
                break;
        }
        return null;
    }
}
