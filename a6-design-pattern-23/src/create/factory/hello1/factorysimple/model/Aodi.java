package create.factory.hello1.factorysimple.model;

public abstract class Aodi {
    public String getType() {
        return "";
    }

    ;

    public String getCompany() {
        return "大众";
    }

    public String info() {
        return getCompany() + getType();
    }
}
