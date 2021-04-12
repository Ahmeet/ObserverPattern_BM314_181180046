import java.util.*;
/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public abstract class Observable {
    private List<Observer> observerList;

    public Observable () {
        observerList = new ArrayList<>();
    }

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void delete(Observer observer) {
        observerList.remove(observer);
    }

    public void inform() {
        for(Observer observer : observerList) {
            observer.update(this);
        }
    }
}
