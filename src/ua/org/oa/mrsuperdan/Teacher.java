package ua.org.oa.mrsuperdan;

public class Teacher extends UniversityWorker {
    private String rank;

    public Teacher(String fullName, String rank) {
        this.fullName = fullName;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
