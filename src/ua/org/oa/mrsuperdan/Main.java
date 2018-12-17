package ua.org.oa.mrsuperdan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Daniil Vorotyntsev", "Java", 5));
        students.add(new Student("Ivan Petrov", "Java", 5));
        students.add(new Student("Ehor Navalniy", "Java", 5));
        students.add(new Student("Alex Korotun", "CPP", 5));
        students.add(new Student("Nikita Liluhin", "JS", 5));

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Название группы: ");
        //String groupName = scanner.next();
        //studentsGroupInfo(students, groupName);

        System.out.println("Введите минимальный рейтинг: ");
        int minRating = scanner.nextInt();
        System.out.println("Введите максимальный рейтинг: ");
        int maxRating = scanner.nextInt();
        studentRatingInfo(students, minRating, maxRating);

        System.out.println("======================");

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Victor Ivanovich", "docent"));
        teachers.add(new Teacher("Petr Aleksandrovich", "master"));
        teachers.add(new Teacher("Ivan Artemovich", "docent"));
        teachers.add(new Teacher("Lev Yurievich", "docent"));
        teachers.add(new Teacher("Pavel Pavlovich", "PhD"));

        System.out.println("Docents: ");
        displayDocentTeachers(teachers);

    }

    // У меня возникла проблема с этим методом, он берет название группы только последнего объекта. Не знаю как это исправить
    static void studentsGroupInfo(ArrayList<Student> array, String groupName) {
        for (int i = 0; i < array.size(); i++) {
            String groupOfStudent = array.get(i).getGroup();
            if (groupName.equals(groupOfStudent)) {
                System.out.println(array.get(i).getFullName());
            }
        }
    }


    static void studentRatingInfo(ArrayList<Student> array, int minRate, int maxRate) {
        for (int i = 0; i < array.size(); i++) {
            if ((array.get(i)).getRating() >= minRate && (array.get(i)).getRating() <= maxRate) {
                System.out.println((array.get(i)).getFullName() + " " + (array.get(i)).getRating());
            }
        }
    }

    static void displayDocentTeachers(ArrayList<Teacher> array) {
        for (int i = 0; i < array.size(); i++) {
            if (( array.get(i)).getRank() == "docent") {
                System.out.println(array.get(i).getFullName());
            }
        }
    }

}
