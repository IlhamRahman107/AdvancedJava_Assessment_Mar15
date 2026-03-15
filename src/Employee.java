import java.time.*;
import java.time.temporal.ChronoUnit;

public class Employee {
    private int e_id;
    private String e_name;
    private LocalDate e_dob;
    private String e_email;
    private LocalDate e_joiningData;

    private int totalVacationDays;
    private int totalSickDays;

    public Employee(int e_id, String e_name, LocalDate e_dob, String e_email, LocalDate e_joiningData, int totalVacationDays, int totalSickDays){
        this.e_id=e_id;
        this.e_name=e_name;
        this.e_dob=e_dob;
        this.e_email=e_email;
        this.e_joiningData=e_joiningData;
        this.totalVacationDays=totalVacationDays;
        this.totalSickDays=totalSickDays;
    }

    public int getVacationDays(){
        LocalDate endDate = LocalDate.of(2025,12,31);
        long days = ChronoUnit.DAYS.between(e_joiningData,endDate)+1;
        double value = (days*10)/365.0;

        if(value<0.5){
            return (int)Math.floor(value);
        }else{
            return (int)Math.ceil(value);
        }
    }

    public int getSickDays(){
        LocalDate endDate = LocalDate.of(2025,12,31);
        long days = ChronoUnit.DAYS.between(e_joiningData,endDate)+1;
        double value = (days*7)/365.0;

        if(value<0.5){
            return (int)Math.floor(value);
        }else{
            return (int)Math.ceil(value);
        }
    }

    @Override
    public String toString(){
        return "Employee{" +
                "\nId = "+e_id +
                "\nName = "+e_name +
                "\nDate of Birth = "+e_dob +
                "\nEmail = "+e_email +
                "\nJoining Date = "+e_joiningData +
                "\nVacation Days = "+getVacationDays() +
                "\nSick Days = "+ getSickDays() +
                "\n}";
    }
}
