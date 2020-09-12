package hello2;

public enum EnumTest {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}




/*
这段代码实际上调用了7次 Enum(String name, int ordinal)：
new Enum("MON",0);
new Enum("TUE",1);
new Enum("WED",2);
 */
