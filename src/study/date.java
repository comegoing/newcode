package study;
import java.text.SimpleDateFormat;
public class date {
    public static void main(String[] args) {
        String pattern = "yyyy-MM-dd\\HH:mm:ss\\SS";
        SimpleDateFormat SDF = new SimpleDateFormat(pattern);
        long starttime = System.currentTimeMillis();
        String time1 = SDF.format(starttime);
        System.out.println(time1);
        
        long endtime = System.currentTimeMillis();
        String time2 = SDF.format(endtime);
        System.out.println(time2);
        System.out.println("enforce time is "+(endtime-starttime));
    }
}
