package two;

public class Professor {
    String[][] stu = new String[5][4];
    String[]courses = new String[5];
    int[] status = {0,0,0,0,0};
    public Professor(String name, int id, String courses[]) {
        this.name = name;
        this.id = id;
        this.courses = courses;
    }
    protected String name;
    protected int id;
    protected String studentName;
    protected int  studentId;
    protected int num = 0;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getNum() {
        return num;
    }
    public String getStatus(int i) {
        if(status[i] == 0) {
            return "可以选择";
        } else {
            return "已被选择";
        }
    }
    public void setStatus(int i) {
        status[i] = 1;
    }
    public String getCourses(int i) {
        return courses[i];
    }
    public void setStudent(String name, int id, String courses) {
        num++;
        stu[num-1][0] = name;
        stu[num-1][1] = String.valueOf(id);
        stu[num-1][2] = courses;
    }
}
