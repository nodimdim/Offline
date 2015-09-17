package Offline_1;

/**
 * Created by cry-my-name on 9/18/15.
 */

public class Room {
    private String hallName;
    private int roomNo;
    private boolean status;

    public Room(){}
    public Room(String hall,int no){
        hallName =hall;
        roomNo=no;
        status=false;
    }
    String getHallName(){
        return hallName;
    }
    void setHallName(String hall){
        hallName=hall;
    }
    int getRoomNo(){
        return roomNo;
    }
    void setRoomNo(int no) {
        roomNo = no;
    }
    boolean getStatus(){
        return status;
    }
    void setStatus(boolean state){
        status=state;
    }
    void print(){
        if (status){
            System.out.println("Room No "+roomNo+" of "+hallName+" Hall is currently allotted.");
        }
        else{
            System.out.println("Room No "+roomNo+" of "+hallName+" Hall is currently available for allotment.");
        }
    }
}
