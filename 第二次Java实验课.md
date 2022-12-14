# the_second_work
一、实验目的  
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；掌握面向对象的类设计方法（属性、方法）；掌握通过构造方法实例化对象

二、业务要求  
学校人员分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。初期为了设计简单，每名教师讲1门课程，每名学生选1门课程。对象示例：教师（编号、姓名、性别、所授课程）学生（编号、姓名、性别、所选课程）课程（编号、课程名称、上课地点、时间）

三、解题思路  
首先定义四个系统角色类，分别是Main类、Professor类、Student类、Teacher类。   
“import java.util.*;” 把util这个包下的全部类导入到程序中；  
在主类创建对象p、a、l、scanner  
设定初始界面“欢迎使用选课系统，请选择需要操作的对象 1、教师系统 | 2、学生系统”  
判断输入整型为1还是2，并作一次确认操作  
开始输入教师开设的课程信息  
学生部分同理  

四、流程图  
![image](https://github.com/audience11/the_second_work/blob/main/%E6%B5%81%E7%A8%8B%E5%9B%BE.png)
五、关键代码  
1、创建arraylist类数组队列，存放Professor型元素（P为对象名，Professor泛指数据类型，用于设置p的数据类型，只能为引用数据类型）  
ArrayList<Professor> p = new ArrayList<Professor>();  
2、输出初始界面  
System.out.println("欢迎使用选课系统，请选择需要操作的对象");  
            System.out.println("1、教师系统 | 2、学生系统");  
3、选择分支结构，输入1进入教师系统，输入2进入学生系统  
if(Objects.equals(choice, "1") ) {  
                teachernum++;  
                System.out.println("成功进入教师系统，请再次按1");  
                String choices = scanner.next();  
                switch (choices) {  
                    case "1":  
                        addProfessor(p);  
                        break;   
                }  
            }  
            else if(Objects.equals(choice,"2"))……  
4、判断该课程是否已经被选择，如没有被选择执行else语句进行选课  
if(p1.getStatus (c1 - 1) == "已被选择") {  
                                System.out.println("重选！");  
                            } else {  
                                p1.setStudent(name,id1, p1.getCourses(c1 - 1));  
                                p1.setStatus(c1 - 1);  
                                p.set((int) Math.ceil((double) c / 5) - 1,p1);  
                                System.out.println("选课完成！\n");  
                                break;  
                            }  
5、再次输入教师信息查看学生选课情况，并判断，如没有学生选该课则输出if语句中的内容，否则输出选课学生信息  
if(p.get(i).getNum() == 0) {  
                    System.out.println("还没有学生选择您的课程！\n");  
                } else {  
                    for(int j = 0; j < p.get(i).getNum(); j++) {  
                        System.out.println("姓名:   " + p.get(i).stu[j][0] + "   id:   "+ p.get(i).stu[j][1] + "    课程:   " + p.get(i).stu[j][2]);  
                    }  
                }  
6、分别创建 String类型二维数组，以存放5行4列和类名对应的对象  
         String类型的一维数组，以存放5个类名对应的对象  
         Int类型的一维数组，以存放5个类名对应的对象1，并分别赋初值为0  
String[][] stu = new String[5][4];  
String[]courses = new String[5];  
int[] status = {0,0,0,0,0};  

                                                         
六、系统运行截图  
![image](https://github.com/audience11/the_second_work/blob/main/%E6%93%8D%E4%BD%9C%E6%BC%94%E7%A4%BA1.png)
![image](https://github.com/audience11/the_second_work/blob/main/%E6%93%8D%E4%BD%9C%E6%BC%94%E7%A4%BA2.png)

                                                         
七、感想与体会  
通过这次制作初步的用Java实现学生选课系统，加深了我对面向对象设计与类的创建和实例化；理清了学生选课过程业务逻辑关系。初步了解了分析系统需求，从学生选课角度了解系统中的实体以及其关系，也学会了定义类中的属性以及方法；掌握了面向对象的类设计方法和通过构造方法实例化对象。最后，也希望更加深入地去学习Java的其他内容，提高自己的编程与逻辑分析能力；感谢自己这几天的努力，也由衷地感谢老师的辛勤付出。
