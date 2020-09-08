import java.io.Serializable;
import java.time.LocalDate;

/**
 * 🦄
 *
 * @author Viktoria Cseke
 * R00180598 Feb 2020
 */
public class Activity  {
    private String week;
    private LocalDate userDate;
    private String activity;
    private int points;

    public Activity(){

    }

    public Activity(String myWeek, LocalDate myUserDate, String myActivity, int myPoints) {
//        this.week = myWeek;
//        this.userDate = myUserDate;
//        this.activity = myActivity;
//        this.points = myPoints;
        setWeek(myWeek);
        setUserDate(myUserDate);
        setActivity(myActivity);
        setPoints(myPoints);
    }
//
//    public String getWeek() {
//        return week;
//    }
//
//    public LocalDate getUserDate() {
//        return userDate;
//    }
//
//    public String getActivity() {
//        return activity;
//    }

    public int getPoints() {
        return points;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public void setUserDate(LocalDate userDate) {
        this.userDate = userDate;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String toFile(){
        return activity+","+points+","+userDate+","+week;
    }

    public String toString(){
        return activity+" "+points+" points, at: "+week+" "+userDate;
    }

    public void printData(){
        System.out.println(toString());
    }
}
