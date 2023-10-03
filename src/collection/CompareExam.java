package collection;

import java.util.HashMap;
import java.util.Map;

public class CompareExam {
    public static Map getOriginalGrade() {
        Map grade = new HashMap();
        grade.put("Angie", 76);
        grade.put("John", 57);
        grade.put("Jane", 89);
        grade.put("Mike", 54);
        grade.put("Charlie", 59);

        return grade;
    }

    public static Map getMakeupGrade() {
        Map grade = new HashMap();
        grade.put("Angie", 67);
        grade.put("John", 78);
        grade.put("Jane", 67);
        grade.put("Mike", 87);
        grade.put("Charlie", 56);

        return grade;
    }

    public static void main(String[] args) {
        Map original = getOriginalGrade();
        Map makeup = getMakeupGrade();
        Map finalScore = new HashMap();

        original.forEach((ok, ov) -> {
            int score = (int) makeup.get(ok);
            if (score > (int) ov) {
                finalScore.putIfAbsent(ok, score);
            } else {
                finalScore.putIfAbsent(ok, ov);
            }
        });

        System.out.println(finalScore);
    }
}
