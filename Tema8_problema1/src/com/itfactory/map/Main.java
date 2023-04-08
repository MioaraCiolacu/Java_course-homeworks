package com.itfactory.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(1, "Ana");
        Person p2 = new Person(2, "Ioana");
        Person p3 = new Person(3, "Maria");
        Person p4 = new Person(4, "Antonia");
        Person p5 = new Person(5, "Sidonia");

        Department department = new Department("CRC");

        Map<Person, Department> map = new HashMap<>();
        map.put(p1, department);
        map.put(p2, department);
        map.put(p3, department);
        map.put(p4, department);
        map.put(p5, department);

        System.out.println(map);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input person's id:");
        int idIntrodus = Integer.parseInt(sc.nextLine());
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Input person's name:");
        String numeIntrodus = sc2.nextLine();

        //Introduc aceste date intr-un obiect de tip person nou

        Person persoanaIntrodusa = new Person(idIntrodus, numeIntrodus);

        if (map.containsKey(persoanaIntrodusa)) {
            System.out.println("Please input department's name: ");
            String departamentIntrodus = sc2.nextLine();

            if (department.getNameDepartment().equals(departamentIntrodus)) {
                System.out.println("We already have this department in our system for this person.");
            } else {
                System.out.println("We changed department for this person");
                Department department2 = new Department(departamentIntrodus);
                map.put(persoanaIntrodusa, department2);
                System.out.println("This person has now this department: " + departamentIntrodus);
            }
        } else {
            System.out.println("We don't have this person in our system");
        }
        System.out.println(map);

    }
}
