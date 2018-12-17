package ua.org.oa.mrsuperdan;

public abstract class UniversityWorker extends Person {
    protected int payment;

    public int calculatePayment(int workedHours, int paymentPerHour) {
        payment = workedHours * paymentPerHour;
        return payment;
    }

}
