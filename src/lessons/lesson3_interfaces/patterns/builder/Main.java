package lessons.lesson3_interfaces.patterns.builder;

import lombok.Builder;
import lombok.Data;

public class Main {
    public static void main(String[] args) {


        User asdasda =
                User.builder()
                        .id(111)
                        .name("asdasda")
                        .status(true).build();
    }
}


@Data
@Builder
class User {
    private int id;
    private String name;
    private boolean status;

//    public static Builder builder() {
//        return new Builder();
//    }
//
//
//    public static class Builder {
//        private User user = new User();
//
//        public Builder id(int id) {
//            user.id = id;
//            return this;
//        }
//
//        public Builder name(String name) {
//            user.name = name;
//            return this;
//        }
//
//        public Builder status(boolean status) {
//            user.status = status;
//            return this;
//        }
//
//        public User build() {
//            return user;
//        }
//
//
//    }


}


