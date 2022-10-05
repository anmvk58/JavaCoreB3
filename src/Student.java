public class Student {
    //thuộc tính
    int id;
    float salary;
    String title;
    boolean isStudy;
    //phương thức

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", salary=" + salary +
                ", title='" + title + '\'' +
                ", isStudy=" + isStudy +
                '}';
    }
}
