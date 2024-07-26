 public class book{
    static int totalNoOfBooks;

   String author;
   
   String title;

   String isbn;

    boolean isBorrowed;


   static{
       totalNoOfBooks = 0;
   }

   {    //object init..
       totalNoOfBooks++;
   }

  String Book(String isbn,String title,String author){
       this.isbn = isbn;
       this.title = title;
       this.author = author;

   }

  String Book(String isbn){
        this(isbn, title:"Unknown",author:"Unknown");
   }

   static int getTotalNoOfBook(){
       return totalNoOfBooks;
   }

   void borrowbook(){
       if(isBorrowed){
           System.out.println("book is already borrowed");
       }else{   
           this.isBorrowed = true;
           System.out.println("Enjoy the book..");
       }
   }

   void returnBook(){
       if(isBorrowed){
           this.isBorrowed = false;
           System.out.println("hope you enjoyed, please leave a review..");
       }else{
        System.out.println("This book is alredy in the library");
       }
   }


   private static void main(String[] args) {
       Book designOfThings = new Book( isbn :"1", title :"Design", author :"Harshad");
       Book myBook = new Book(isbn:"2");
       System.out.println(Book.getTotaNoOfBooks());
       designOfThings.borrowbook();
       myBook.borrowbook();
       designOfThings.borrowbook();
       designOfThings.returnBook();
       designOfThings.returnBook();
   }
 }


























