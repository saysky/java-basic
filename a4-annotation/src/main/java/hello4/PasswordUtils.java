package hello4;

import java.lang.reflect.Method;

import hello4.anno.AnnoAlgorithm;
import hello4.imp.ImpClearTextPassword;
import hello4.imp.ImpMd5Password;
import hello4.imp.InfAlgorithm;

/**
 * @author liuyanzhao
 */
public class PasswordUtils {
    InfAlgorithm algorithm;

    @AnnoAlgorithm(name = "CLEAR")
    public String encryptPassword(String password) throws Exception {
        Object obj = Class.forName("case9.PasswordUtils").newInstance();
        Method method = obj.getClass().getMethod("encryptPassword", String.class);
        AnnoAlgorithm annoAlgorithm = method.getAnnotation(AnnoAlgorithm.class);
        if (annoAlgorithm.name().equals("MD5")) {
            ImpMd5Password impMd5Password = new ImpMd5Password();
            algorithm = impMd5Password;
        }
        if (annoAlgorithm.name().equals("CLEAR")) {
            ImpClearTextPassword impClearTextPassword = new ImpClearTextPassword();
            algorithm = impClearTextPassword;
        }

        return algorithm.encrypt(password);
    }


}
