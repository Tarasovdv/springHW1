package spring.functional_interface.stream.utils;

import spring.functional_interface.stream.model.Faculty;
import spring.functional_interface.stream.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class NewApproach {
    public static List<Student> generate(Student harryPotter, Student jennyWeasley, Student drakoMalfoy, Student cedricDigory) {
        return List.of(harryPotter,jennyWeasley,drakoMalfoy,cedricDigory);
    }

    public static List<Student> getGryffindorStudents(List<Student> hogvartsStudents){
        return  hogvartsStudents.stream()
                .filter(student -> student.getFaculty() == Faculty.GRYFFINDOR)
                .collect(Collectors.toList());
    }

    public static List<Integer> getCoursesGryffindorsStudents(List<Student> hogvartsStudents) {
        return  hogvartsStudents.stream()
                .filter(student -> student.getFaculty() == Faculty.GRYFFINDOR)
                .map(Student::getCourseNum)
                .limit(1)
                .collect(Collectors.toList());

        }
    }

