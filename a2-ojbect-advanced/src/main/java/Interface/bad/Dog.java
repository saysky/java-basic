package Interface.bad;

class Dog implements Animal {

    public void eat() {
        System.out.println("骨头");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }


}
