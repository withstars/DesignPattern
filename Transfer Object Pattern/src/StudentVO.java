/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-03-05
 * Time: 22:38
 * Mail: withstars@126.com
 */
public class StudentVO {

    private String name;

    private int rollNo;

    public StudentVO(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student :[RollNo:"
                + rollNo +",Name:"+ name +"]";

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}
