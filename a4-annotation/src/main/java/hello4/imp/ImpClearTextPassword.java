package hello4.imp;


/**
 * @author liuyanzhao
 */
public class ImpClearTextPassword implements InfAlgorithm {

    @Override
    public String encrypt(String password) {
        return password;
    }


}
