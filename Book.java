/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Matt Dornick)
 * @version (Feb 4, 2019)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numpages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numpages;
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
        
    public String getTitle()
    {
       return title;   
    }    
    
    public int getPages()
    {
        return pages;
    }    
    
    public void printAuthor()
    {
     System.out.println("By:" +author);   
    }    
    
    public void printTitle()
    {
        System.out.println(title);
    }

    public void printDetails()
    {
        System.out.println("Title:" +title+ "Author:" +author+ "Pages:" +pages);
    }    



}
