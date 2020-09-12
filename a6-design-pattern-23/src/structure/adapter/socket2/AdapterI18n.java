package structure.adapter.socket2;


public class AdapterI18n extends AbstratStoket {
    private AbstratStoket stocket;


    public AdapterI18n(AbstratStoket stocket) {
        this.stocket = stocket;
    }

    @Override
    public void use() {
        stocket.use();
    }
}
