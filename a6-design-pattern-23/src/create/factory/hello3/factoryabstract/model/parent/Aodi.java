package create.factory.hello3.factoryabstract.model.parent;

public abstract class Aodi {
    public Aircondition aircondition;

    public String getType() {
        return "";
    }

    ;

    public String getCompany() {
        return "奥迪";
    }

    public String info() {
        return getCompany() + getType();
    }


    public Aircondition getAircondition() {
        return aircondition;
    }

    public void setAircondition(Aircondition aircondition) {
        this.aircondition = aircondition;
    }

    ;

}
