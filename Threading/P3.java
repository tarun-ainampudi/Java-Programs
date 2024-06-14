import java.util.*;
class Booking extends Thread{

    static ArrayList<Integer> Seats = new ArrayList<>();
    void Intialise(int num){
        for(int i=1;i<=num;i++){Seats.add(i);}
    }
    public void getAvailableSeats(){
        System.out.println("Available Seats :"+Seats);
    }
    synchronized void BookSeat(int num){
        if (Seats.contains(Integer.valueOf(num))){
        System.out.println("Seat Booked Sucessfully , Seat Number : "+num);
        Seats.remove(Integer.valueOf(num));
        System.out.println("Available Seats :"+Seats);
    }
        else{
            System.out.println("You are in Waiting......!");
            try{
            wait();
            BookSeat(num);
        }
            catch(Exception e){
                System.out.println("An Error Occured!");
            }
        }
    }
    synchronized void CancelBooking(int num){
        Seats.add(num);
        System.out.println("Seat Cancelled Sucessfully , Seat Number : "+num);
        notifyAll();
    }

    
}
public class P3 {
    public static void main(String[] args) throws InterruptedException {
        Booking admin = new Booking();
        admin.Intialise(20);

    }
    static void Book(Booking o,int num){
        Thread thread = new Thread(){
            public void run(){
            o.BookSeat(num);}};
        thread.start();
        try{
        thread.join(2000);}
        catch(Exception e){System.out.println(e);}
    
    }
    static void Cancel(Booking o,int num){
        Thread th = new Thread(){
            public void run(){
            o.CancelBooking(num);}};
        th.start();
        try{
            th.join(2000);}
            catch(Exception e){System.out.println(e);}
      
    }
}
