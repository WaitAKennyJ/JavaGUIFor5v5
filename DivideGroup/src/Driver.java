import java.util.ArrayList;
import java.util.List;

/**
 * Created by kennywzj on 2017/10/26.
 */
public class Driver {
    public static void main(String[] args) throws Exception{
        Driver driver = new Driver();
        driver.driverDivide(driver.stubMember());
    }

    public List<String> stubMember ()throws Exception{
        List<String> Member = new ArrayList<String>();
        for (Integer i =0;i<10;i++){
            Member.add(i.toString());
        }
        return Member;
    }


    public void driverDivide(List<String> m){
        new DivideGroup(m);
    }
}


