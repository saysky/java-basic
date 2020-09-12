package Interface.bad;

class Pig implements Animal {

    public void eat() {
        System.out.println("饲料");

    }

    @Override
    public void sleep() {
        System.out.println("睡觉");

    }


}
