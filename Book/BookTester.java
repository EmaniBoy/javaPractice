package Book;
/**
 * BookTester.java
 * Author: ChatGPT
 * 
 * This class tests the functionality of the Book class.
 * It demonstrates the use of constructors, accessors, mutators,
 * and other methods including toString, equals, applyDiscount, and isThick.
 */
public class BookTester {
    /**
     * The main method where the Book class is tested.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        // -------------------------------
        // Test the Default Constructor
        // -------------------------------
        Book defaultBook = new Book();
        System.out.println("Default Book: " + defaultBook.toString());
        
        // ----------------------------------------------------
        // Test the Parameterized Constructor with valid input
        // ----------------------------------------------------
        Book paramBook = new Book("Java Programming", "John Smith", 350, 59.99);
        System.out.println("Parameterized Book: " + paramBook.toString());
        
        // ------------------------------------------------------------------
        // Test the Parameterized Constructor with invalid input values.
        // Invalid values should revert to default values.
        // ------------------------------------------------------------------
        Book invalidBook = new Book("No", null, 15000, -10.0);
        System.out.println("Invalid Book (should use default values): " + invalidBook.toString());
        
        // -------------------------------
        // Test the Mutator Methods
        // -------------------------------
        // Update defaultBook's details using mutators.
        defaultBook.setTitle("Advanced Java");
        defaultBook.setAuthor("Jane Doe");
        defaultBook.setPages(400);
        defaultBook.setPrice(49.99);
        System.out.println("Updated Default Book: " + defaultBook.toString());
        
        // -------------------------------
        // Test the Accessor Methods
        // -------------------------------
        System.out.println("Title of Updated Default Book: " + defaultBook.getTitle());
        System.out.println("Author of Updated Default Book: " + defaultBook.getAuthor());
        System.out.println("Pages of Updated Default Book: " + defaultBook.getPages());
        System.out.println("Price of Updated Default Book: " + defaultBook.getPrice());
        
        // -------------------------------
        // Test the equals Method
        // -------------------------------
        Book anotherBook = new Book("Advanced Java", "Jane Doe", 400, 49.99);
        System.out.println("Updated Default Book equals Another Book: " + defaultBook.equals(anotherBook));
        System.out.println("Parameterized Book equals Another Book: " + paramBook.equals(anotherBook));
        
        // -------------------------------
        // Test the Bonus Methods
        // -------------------------------
        // Apply a discount to the paramBook and display its price before and after.
        System.out.println("Price before discount for Parameterized Book: " + paramBook.getPrice());
        paramBook.applyDiscount(10); // Apply a 10% discount.
        System.out.println("Price after 10% discount: " + paramBook.getPrice());
        
        // Check if the books are considered "thick".
        System.out.println("Is the Updated Default Book thick? " + defaultBook.isThick());
        System.out.println("Is the Parameterized Book thick? " + paramBook.isThick());
    }
}
