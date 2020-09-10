package spring.functional_interface.stream.utils;

import spring.functional_interface.stream.model.Faculty;
import spring.functional_interface.stream.model.Student;

import java.util.ArrayList;
import java.util.List;

public class OldApproach {

    public static List<Student> generate(Student harryPotter, Student jennyWeasley, Student drakoMalfoy, Student cedricDigory) {

        List<Student> resList = new ArrayList<>();
        resList.add(harryPotter);
        resList.add(jennyWeasley);
        resList.add(drakoMalfoy);
        resList.add(cedricDigory);

        return resList;
    }

    public static List<Student> getGryffindorStudents(List<Student> students) {
        List<Student> gryffindorList = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty() == Faculty.GRYFFINDOR) {
                students.add(student);
            }

        }
        return gryffindorList;

    }
}
