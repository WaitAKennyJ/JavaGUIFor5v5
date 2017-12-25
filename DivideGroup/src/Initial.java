/**
 * Created by kennywzj on 2017/10/25.
 */
import java.util.*;
public class Initial {

    public List<String> Member = new ArrayList<String>();
    public List<String> Team1 = new ArrayList<String>();
    public List<String> Team2 = new ArrayList<String>();

    public  List<String> getMember() {
        return Member;
    }

    public  List<String> getTeam1() {
        return Team1;
    }

    public  List<String> getTeam2() {
        return Team2;
    }


    public void clear(){
        Member.clear();
        Team1.clear();
        Team2.clear();
    }

    public void Add(List<String> team ,String name){
        team.add(name);
    }
}
