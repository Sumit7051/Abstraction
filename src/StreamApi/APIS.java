package StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class APIS {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,23);
        list.add(1,25);
        list.add(2,26);
        list.add(3,2);
        list.add(4,27);
        list.add(5,28);

        System.out.println(list);

//        List<String> names = List.of("Sushil","Sumit","Udhav");
//        names.stream().filter(n -> n.startsWith("S"))
//                .map(String::toUpperCase)
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(names);



        // Uppercase Stream API

//                List<String> names = List.of("Sushil","Sumit","Udhav");
//       long num = names.stream().filter(n -> n.startsWith("S"))
//                .map(String::toUpperCase)
//                .sorted().count();
//        System.out.println(num);

//                names.stream().filter(n -> n.startsWith("S"))
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(n-> System.out.println(n));

        // EVEN Stream API
            List<Integer> numbers = Arrays.asList(1,2,4,5);
            List<Integer> even = numbers.reversed()
                    .stream().filter(n -> n %2 ==0)
                    .collect(Collectors.toList());
                    System.out.println(even);

        // Employee Stream API
//                    List<Employee> emp = Arrays.asList(
//                            new Employee("Sumit","Developer"),
//                            new Employee("Sunil","Lawyer"),
//                            new Employee("Udhav","Developer"));
//
//                    List<String>  dev = emp.stream()
//                .filter( e -> e.getRole().equals("Developer"))
//                .map(Employee::getName)
//                .collect(Collectors.toList());
//        System.out.println(dev);

        // Duplicates Stream API
    List<Integer> arr = Arrays.asList(12,34,23,55,12,55);
    List<Integer> call = arr.stream()
            .distinct().collect(Collectors.toList());
        System.out.println(call);

        // Sorting Stream API
        List<Employee> emp = Arrays.asList(
                            new Employee("Sumit","Developer",550000),
                            new Employee("Sunil","Lawyer",60000),
                            new Employee("Udhav","Developer",62000));

        List<Employee>  sort = emp.stream()
                .sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(sort);
    }
}
