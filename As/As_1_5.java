import java.util.Scanner;

class Restaurant {
    private String name;
    private String category;
    private int rating1;
    private int rating2;
    private int rating3;
    private int rating4;
    private int rating5;

    // Constructor
    public Restaurant(String name, String category) {
        this.name = name;
        this.category = category;
        this.rating1 = 0;
        this.rating2 = 0;
        this.rating3 = 0;
        this.rating4 = 0;
        this.rating5 = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Method to add a rating
    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            switch (rating) {
                case 1:
                    rating1++;
                    break;
                case 2:
                    rating2++;
                    break;
                case 3:
                    rating3++;
                    break;
                case 4:
                    rating4++;
                    break;
                case 5:
                    rating5++;
                    break;
            }
        } else {
            System.out.println("Invalid rating. Please provide a number between 1 and 5.");
        }
    }

    // Method to calculate average rating
    public double getAverage() {
        int totalRatings = rating1 + rating2 + rating3 + rating4 + rating5;
        if (totalRatings == 0) {
            return 0.0; // Avoid division by zero
        }
        double sum = rating1 + 2 * rating2 + 3 * rating3 + 4 * rating4 + 5 * rating5;
        return sum / totalRatings;
    }
}

public class As_1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two restaurant objects
        System.out.print("Enter name for Restaurant 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter category for Restaurant 1: ");
        String category1 = scanner.nextLine();
        Restaurant restaurant1 = new Restaurant(name1, category1);

        System.out.print("Enter name for Restaurant 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter category for Restaurant 2: ");
        String category2 = scanner.nextLine();
        Restaurant restaurant2 = new Restaurant(name2, category2);

        // Add ratings for each restaurant
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter rating (1-5) for " + name1 + ": ");
            int rating1 = scanner.nextInt();
            restaurant1.addRating(rating1);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter rating (1-5) for " + name2 + ": ");
            int rating2 = scanner.nextInt();
            restaurant2.addRating(rating2);
        }

        // Output restaurant details
        System.out.println("\nRestaurant 1 Details:");
        System.out.println("Name: " + restaurant1.getName());
        System.out.println("Category: " + restaurant1.getCategory());
        System.out.println("Average Rating: " + restaurant1.getAverage());

        System.out.println("\nRestaurant 2 Details:");
        System.out.println("Name: " + restaurant2.getName());
        System.out.println("Category: " + restaurant2.getCategory());
        System.out.println("Average Rating: " + restaurant2.getAverage());

        scanner.close();
    }
}


