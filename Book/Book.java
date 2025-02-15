package Book;
/**
 * Book.java
 * Author: ChatGPT
 * 
 * This class represents a Book with a title, author, number of pages, and price.
 * It includes constructors, accessors, mutators with input validation,
 * a toString method for string representation, and an equals method to compare books.
 * Bonus methods include applying a discount and checking if the book is "thick".
 */
public class Book {
    // Instance variables with private access for encapsulation.
    private String title;
    private String author;
    private int pages;
    private double price;
    
    // Default values for instance variables.
    public static final String DEFAULT_TITLE = "Unknown";
    public static final String DEFAULT_AUTHOR = "Anonymous";
    public static final int DEFAULT_PAGES = 100;
    public static final double DEFAULT_PRICE = 0.0;
    
    /**
     * Default constructor.
     * Initializes a Book object with default values.
     */
    public Book() {
        this.title = DEFAULT_TITLE;
        this.author = DEFAULT_AUTHOR;
        this.pages = DEFAULT_PAGES;
        this.price = DEFAULT_PRICE;
    }
    
    /**
     * Parameterized constructor.
     * Initializes a Book object with given values after validating them.
     *
     * @param title  The title of the book. Must be non-null and at least 3 characters.
     * @param author The author of the book. Must be non-null.
     * @param pages  The number of pages. Must be between 1 and 10,000 (inclusive).
     * @param price  The price of the book. Must be non-negative.
     */
    public Book(String title, String author, int pages, double price) {
        // Validate and assign title
        if (title != null && title.length() >= 3) {
            this.title = title;
        } else {
            this.title = DEFAULT_TITLE;
        }
        
        // Validate and assign author
        if (author != null) {
            this.author = author;
        } else {
            this.author = DEFAULT_AUTHOR;
        }
        
        // Validate and assign pages
        if (pages >= 1 && pages <= 10000) {
            this.pages = pages;
        } else {
            this.pages = DEFAULT_PAGES;
        }
        
        // Validate and assign price
        if (price >= 0.0) {
            this.price = price;
        } else {
            this.price = DEFAULT_PRICE;
        }
    }
    
    // ===========================
    // Accessors (Getter Methods)
    // ===========================
    
    /**
     * Returns the title of the book.
     * @return the book's title.
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Returns the author of the book.
     * @return the book's author.
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * Returns the number of pages in the book.
     * @return the book's page count.
     */
    public int getPages() {
        return pages;
    }
    
    /**
     * Returns the price of the book.
     * @return the book's price.
     */
    public double getPrice() {
        return price;
    }
    
    // ===========================
    // Mutators (Setter Methods)
    // ===========================
    
    /**
     * Sets the title of the book after validating it.
     * If the input is invalid, the title is set to the default value.
     *
     * @param title the new title to set.
     */
    public void setTitle(String title) {
        if (title != null && title.length() >= 3) {
            this.title = title;
        } else {
            this.title = DEFAULT_TITLE;
        }
    }
    
    /**
     * Sets the author of the book after validating it.
     * If the input is invalid, the author is set to the default value.
     *
     * @param author the new author to set.
     */
    public void setAuthor(String author) {
        if (author != null) {
            this.author = author;
        } else {
            this.author = DEFAULT_AUTHOR;
        }
    }
    
    /**
     * Sets the number of pages in the book after validating it.
     * If the input is invalid, the pages are set to the default value.
     *
     * @param pages the new page count to set.
     */
    public void setPages(int pages) {
        if (pages >= 1 && pages <= 10000) {
            this.pages = pages;
        } else {
            this.pages = DEFAULT_PAGES;
        }
    }
    
    /**
     * Sets the price of the book after validating it.
     * If the input is invalid, the price is set to the default value.
     *
     * @param price the new price to set.
     */
    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        } else {
            this.price = DEFAULT_PRICE;
        }
    }
    
    /**
     * Returns a string representation of the Book object.
     *
     * @return a formatted string with the book's details.
     */
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Price: " + price;
    }
    
    /**
     * Compares this book to another book for equality.
     *
     * @param other the Book object to compare with.
     * @return true if all instance variables match; false otherwise.
     */
    public boolean equals(Book other) {
        if (other == null) {
            return false;
        }
        return this.title.equals(other.title) &&
               this.author.equals(other.author) &&
               this.pages == other.pages &&
               Double.compare(this.price, other.price) == 0;
    }
    
    // ===========================
    // Bonus Methods
    // ===========================
    
    /**
     * Applies a percentage discount to the book's price.
     * The discount is calculated as a percentage of the current price.
     * Ensures that the final price does not drop below 0.
     *
     * @param discountPercentage the discount percentage to apply.
     */
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage < 0) {
            // Negative discount values are ignored.
            return;
        }
        double discountAmount = this.price * (discountPercentage / 100);
        this.price -= discountAmount;
        if (this.price < 0) {
            this.price = 0.0;
        }
    }
    
    /**
     * Determines if the book is considered "thick".
     * A book is defined as thick if it has more than 300 pages.
     *
     * @return true if the book is thick; false otherwise.
     */
    public boolean isThick() {
        return this.pages > 300;
    }
}
