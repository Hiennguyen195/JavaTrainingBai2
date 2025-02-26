package JavaBai4;

import java.util.*;
import java.util.stream.Collectors;

public class Bai7 {
    public static void main(String[] args) {

        List<Person> peopleList = Arrays.asList(
                new Person("Hien", 18),
                new Person("Anh", 25),
                new Person("Hung", 30),
                new Person("Hien", 25)
        );

        System.out.println("List of people: " + peopleList);

        Map<String, Person> personMap = peopleList.stream()
                .collect(Collectors.toMap(Person::getName,
                        person -> person,
                        (existing, replacement) -> existing  // Giữ giá trị cũ nếu trùng key
                ));

        personMap.forEach((name, person) -> System.out.println(name + "=> " + person));
    }
}
