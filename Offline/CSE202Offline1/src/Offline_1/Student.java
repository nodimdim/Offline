package Offline_1;

/**
 * Created by cry-my-name on 9/18/15.
 */

public class Student {
    private String studentName;
    private String studentNo;
    private Room room;

    public Student(){}
    public Student(String name,String no,Room r){
        studentName=name;
        studentNo=no;
        room=r;
    }
    String getStudentName(){
        return studentName;
    }
    void setStudentName(String name){
        studentName=name;
    }
    String getStudentNo(){
        return studentNo;
    }
    void setStudentNo(String no){
        studentNo=no;
    }
    Room getRoom(){
        return room;
    }
    void setRoom(Room r){
        room=r;
    }
    void print(){
        System.out.println("Student No "+studentNo+", "+studentName+" resides on "+room.getHallName()+"Hall, Room no, "+room.getRoomNo());
    }
}
