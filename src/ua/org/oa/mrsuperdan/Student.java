package ua.org.oa.mrsuperdan;

public class Student extends Person {
    public static final int MAX_MARK = 12;
    public static final int MIN_MARK = 1;
    private static String group;
    private double rating;

    public Student(String fullName, String group, int countOfMarks) {
        this.fullName = fullName;
        this.group = group;
        rating = calculateRating(countOfMarks);
    }

    public double getRating() {
        return rating;
    }

    public static String getGroup() {
        return group;
    }

    private int randomMark() {
        int randomMark = (int) (Math.random() * MAX_MARK) + MIN_MARK;
        return randomMark;
    }

    private double calculateRating(int countOfMarks) {
        int totalMark = 0;
        for (int i = 0; i < countOfMarks; i++) {
            totalMark += randomMark();
        }
        return rating = totalMark / countOfMarks;
    }

}

