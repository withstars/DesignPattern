public class Main {

    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        for (StudentVO student : studentBusinessObject.getAllStudents()){
            System.out.println("Student :[RollNo:"
            +student.getRollNo()+",Name:"+student.getName()+"]"
            );
        }

        StudentVO student = studentBusinessObject.getStudent(0);
        student.setName("Jack");
        studentBusinessObject.updateStudent(student);

        StudentVO newStudent=studentBusinessObject.getStudent(0);
        System.out.println(newStudent);
    }
}
