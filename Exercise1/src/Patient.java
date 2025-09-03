import java.time.LocalDate;

public class Patient {
    final private String name;
    final private String ssn;
    private String journal;

    public Patient(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
        this.journal = "";
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String note) {
        journal += LocalDate.now().toString() + "; " + note + "\n";
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", journal='" + journal + '\'' +
                '}';
    }
}