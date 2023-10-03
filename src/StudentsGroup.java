import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class StudentsGroup {

    Collection<Student> students = Arrays.asList(
            new Student("Dmitri",17,Gender.MAN),
            new Student("Maxim",20,Gender.MAN),
            new Student("Ekaterina",20,Gender.WOMAN),
            new Student("Michail",28,Gender.WOMAN)
    );

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{"+
                    "name='"+name+'\''+
                    ", age="+age+
                    ", gender="+gender+
                    "'}'";
        }

        @Override
        public int hashCode() {
            return Objects.hash(name,age,gender);
        }
    }
}
