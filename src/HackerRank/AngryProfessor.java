package HackerRank;
import java.util.ArrayList;
import java.util.List;


public class AngryProfessor {
    public static void main(String[] args){

        ArrayList<Integer> students = new ArrayList<>();
        students.add(-2);
        students.add(-1);
        students.add(0);
        students.add(1);
        students.add(2);
        System.out.println(angryProfessor(3,students));

    }


    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        ArrayList<Integer> students = new ArrayList<>(a);
        int count = 0;

        for (Integer student : students) {
            if (student <= 0) {
                count++;
            }
        }

        System.out.println("count = "+count);
        if (count < k){
            return "YES";
        }
        else return "NO";

    }
}
