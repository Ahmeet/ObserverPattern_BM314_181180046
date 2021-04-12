/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public class ExamCalendar extends Observable {

    private int[] examHours;
    private int dayTime;

    public ExamCalendar(int[] examHours) {
        this.examHours = examHours;
        this.dayTime = 0;
    }
    public void setDayTime(int dayTime) {
        this.dayTime = dayTime;
        System.out.println("Time is "+ dayTime+" o'clock");
        checkForExams();
    }
    public int getDayTime() {
        return dayTime;
    }
    private void checkForExams() {
        for(int examHour : examHours) {
            if (examHour == dayTime) {
                inform();
            }
        }
    }

}
