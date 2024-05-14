package Library.Users;
public class LibraryUser {
    String UserId;
    String UserName;
    String UserAddress;
    long ContactNumber;
    public LibraryUser(String UserId,String UserName,String UserAddress,long ContactNumber){
        this.UserId = UserId;
        this.UserName = UserName;
        this.UserAddress = UserAddress;
        this.ContactNumber = ContactNumber;
    }
    public void Display(){
        System.out.println("User ID: " + UserId);
        System.out.println("User Name: " + UserName);
        System.out.println("User Address: " + UserAddress);
        System.out.println("Contact Number: " + ContactNumber);
    }
}
