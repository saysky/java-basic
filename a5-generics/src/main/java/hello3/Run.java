package hello3;

/**
 * 类型通配符上限和类型通配符下限。
 **/
public class Run {

    public static void getData(Box<?> data) {
        System.out.println("data :" + data.getData());
    }

    public static void getUpperNumberData(Box<? extends Number> data) {
        System.out.println("data :" + data.getData());
    }

    public static void main(String[] args) {

        Box name = new Box("corn");
        Box age = new Box(712);
        Box number = new Box(314);

        getData(name);
        getData(age);
        getData(number);

        // getUpperNumberData(name); //会报错
        getUpperNumberData(age);
        getUpperNumberData(number);
    }


}
