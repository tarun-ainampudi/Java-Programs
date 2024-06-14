class MovieReservationSystem {
    int availableSeats=5;

   public synchronized void book(int seats) {
       while (availableSeats < seats) {

           System.out.println(Thread.currentThread().getName() + " wants to book " + seats + " seats but only " + availableSeats + " are available. Waiting for cancellation...");

           try {

               wait(); // Wait until seats are available​

           } catch (InterruptedException e) {

               Thread.currentThread().interrupt(); // Restore the interrupted status​

               System.out.println(Thread.currentThread().getName() + " was interrupted.");

        }

       }

       availableSeats -= seats;

       System.out.println(Thread.currentThread().getName() + " booked " + seats + " seats. Remaining seats: " + availableSeats);

   }


   public synchronized void cancel(int seats) {

       availableSeats += seats;

       System.out.println(Thread.currentThread().getName() + " cancelled " + seats + " seats. Available seats: " + availableSeats);

       notify(); // Notify a waiting thread that seats have been cancelled​

   }

}
class CustomerBook extends Thread {

    MovieReservationSystem rs;

    int seatsToBook;

​

    public CustomerBook(MovieReservationSystem rs, int seatsToBook) {

        this.rs = rs;

        this.seatsToBook = seatsToBook;

    }

​

    @Override

    public void run() {

        rs.book(seatsToBook);

    }

}

​

class CustomerCancel extends Thread {

    MovieReservationSystem rs;

    int seatsToCancel;

​

    public CustomerCancel(MovieReservationSystem rs, int seatsToCancel) {

        this.rs = rs;

        this.seatsToCancel = seatsToCancel;

    }

​

    @Override

    public void run() {

        rs.cancel(seatsToCancel);

    }
    public class ReservationApp {

        public static void main(String[] args) {
    
            MovieReservationSystem res = new MovieReservationSystem(); 
    
    
    
            CustomerBook customer1 = new CustomerBook(res, 4);
    
            CustomerBook customer2 = new CustomerBook(res, 3);
    
            CustomerCancel customer3 = new CustomerCancel(res, 2);
    
            
    
            customer1.setName("Customer1");
    
            customer2.setName("Customer2");
    
            customer3.setName("Customer3");
    
         
    
    
    
            customer1.start();
    
            customer2.start();
    
            customer3.start();
    
            
    
        }
    
    }
