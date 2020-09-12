package create.factory.hello2.factorymethod.model;

public abstract class Aodi {
    public String getType() {
        return "";
    }

    ;

    public String getCompany() {
        return "宝马";
    }

    public String info() {
        return getCompany() + getType();
    }
}
