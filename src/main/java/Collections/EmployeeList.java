package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(10,"K",32,100));
        list.add(new Employee(1,"G",27,100));
        list.add(new Employee(13,"G",27,100));

        Collections.sort(list);

        System.out.println("Like" + list);

    }

}
