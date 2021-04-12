/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public class Main {

    public static void main(String[] args) {

        int[] mondayExamHours = {9,12,18};
        int[] tuesdayExamHours = {8,15,17};

        ExamCalendar examCalendarMonday = new ExamCalendar(mondayExamHours);
        ExamCalendar examCalendarTuesday = new ExamCalendar(tuesdayExamHours);

        Student student1 = new Student("Ahmet");
        Student student2 = new Student("Furkan");

        examCalendarMonday.add(student1);
        examCalendarMonday.add(student2);

        System.out.println("Monday");
        for( int i = examCalendarMonday.getDayTime(); i<=24; i++) {
            examCalendarMonday.setDayTime(i);
        }

        System.out.println("\nTuesday");
        for( int i = examCalendarTuesday.getDayTime(); i<=24; i++) {
            examCalendarTuesday.setDayTime(i);
        }
    }
}
