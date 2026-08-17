import java.util.ArrayList;

public class assignment5_studentcourse {
    public static void main(String[] args) {

        ArrayList<String> subjectList = new ArrayList<>();

        subjectList.add("Programming With Java");
        subjectList.add("Discrete Mathematics");
        subjectList.add("Data Structures");
        subjectList.add("Operating Systems");

        // Removing one course
        subjectList.remove(1);

        StringBuffer result = new StringBuffer();
        result.append("My Registered Courses:\n");

        int count = 1;
        for (String subject : subjectList) {
            result.append(count).append(". ")
                  .append(subject).append("\n");
            count++;
        }

        System.out.println(result.toString());
    }
}
