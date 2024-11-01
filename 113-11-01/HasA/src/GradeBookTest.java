public class GradeBookTest {
    public  static  void main(String[] arge) {
        final int NUMBER_OF_STUDENTS = 3;
        Student[] students = new Student[NUMBER_OF_STUDENTS];
        students[0] = new Student("A112223021", "陳品澈");
        students[0] = new Student("A112223022", "黃繼田");
        students[0] = new Student("A112223023", "劉彥谷");
        GradeBook gradeBook = new GradeBook("Java程式設計", students, NUMBER_OF_STUDENTS);
        gradeBook.processStudentsGrades();
        gradeBook.displayGradeReport();
    }
}
