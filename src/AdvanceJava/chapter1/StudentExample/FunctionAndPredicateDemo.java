package AdvanceJava.chapter1.StudentExample;

import java.nio.file.DirectoryStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAndPredicateDemo {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("Shohag", 26, Student.Gender.MALE),
                new Student("Mehedi", 28, Student.Gender.MALE),
                new Student("Rana", 28, Student.Gender.MALE),
                new Student("Naimur", 27, Student.Gender.MALE),
                new Student("Kat", 29, Student.Gender.FEMALE),
                new Student("Sunny", 25, Student.Gender.FEMALE));

        Function<Student, String> studentStringFunction = (Student s) -> s.getName();
        Function<Student, String> studentAge =  (Student s) -> String.valueOf(s.getAge());
        Function<Student, String> studentGender =  (Student s) -> String.valueOf(s.getGender());

        StudentProcessor processor = new StudentProcessor();

        List<String>  namelist = processor.process(studentList, studentStringFunction);
        System.out.println("All Student Name List");
        namelist.forEach(System.out::println);
        List<String>  age = processor.process(studentList, studentAge);
        System.out.println("All Student Age List");
        age.forEach(System.out::println);
        List<String>  genderWise = processor.process(studentList, studentGender);
        System.out.println("All Student Gender List");
        genderWise.forEach(System.out::println);

        Predicate<Student> studentFilter = (Student s) -> s.getAge() > 27;
        Predicate<Student> studentFemale = (Student s) -> s.getAge() > 27 && s.getGender().equals(Student.Gender.FEMALE);

        List<Student> olderThan27 = processor.filter(studentList, studentFilter);
        System.out.println("olderThan27 Student Name List");
        olderThan27.forEach(System.out::println);
        List<Student> femaleAndOlder27 = processor.filter(studentList, studentFemale);
        System.out.println("femaleAndOlder27 Student Name List");
        femaleAndOlder27.forEach(System.out::println);
    }
}
