/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public class Student implements Observer{

    private String name;

    public Student(String name) {
        this.name = name;
    }
    @Override
    public void update(Observable observable) {
        ExamCalendar examCalendar = (ExamCalendar) observable;
        System.out.println(name + ": OMG! I have an exam at " +examCalendar.getDayTime()+"!");
    }
}
