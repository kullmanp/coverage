package ch.kup.sonar.prodcode;

import java.util.Set;
import java.util.stream.Collectors;

public class SomeHelper {

    private final String aField;

    public SomeHelper() {
        this.aField = "hello";
    }

    String doSomethingStupid() {
        Set<Object> set = System.getProperties().entrySet().stream()
                .map(p -> p.getKey())
                .sorted()
                .collect(Collectors.toSet());
        System.out.println(set);
        return set.toString();
    }

    public String getaField() {
        return aField;
    }
}
