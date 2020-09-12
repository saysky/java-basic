package h2data;

import java.text.NumberFormat;


public class UtilNumberFormat {

    public static void main(String[] args) {
        int b = 1;
        Integer a = new Integer(1);


        System.out.println(Double.parseDouble("50"));
        System.out.println(Double.parseDouble("16252928"));

        NumberFormat nfNumber = NumberFormat.getNumberInstance();
        System.out.println(nfNumber.format(Double.parseDouble("16252928")));
        System.out.println(nfNumber.format(Double.parseDouble("16252928") / 1000000));

        nfNumber.setMinimumFractionDigits(6); //设置显示最小6为小数
        System.out.println(nfNumber.format(Double.parseDouble("16252928") / 1000000));
    }

}
