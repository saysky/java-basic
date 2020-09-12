package create.builder.hello2;

/**
 * 场景：
 * 我们做同一个菜，不同的做法。最后都是得到一个菜
 * <p>
 * <p>
 * 一个对象有很多方法， 可以按自己想组合的顺序进行调用
 */
public class Run {

    public static void main(String[] args) {
        User.Builder builder = new User.Builder();
        User user = builder.setName("corn").setAge(100).setAddress("广州").build();
    }
}

class User {

    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {
        private User user = new User();

        public Builder setName(String name) {
            user.name = name;
            return this;
        }

        public Builder setAge(int age) {
            user.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            user.address = address;
            return this;
        }

        public User build() {
            return user;
        }
    }
}
