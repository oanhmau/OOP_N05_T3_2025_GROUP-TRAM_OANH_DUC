public class Book{
    String title;
    String author;
    int numPages;
    Book{};
    public Book(String t, String a, int p){
        title = t;
        author = a;
        numPages = p;
    }
    public Book(String au, int pages){
        author = au;
        numPages = pages;
    }
    public static void test(){

    
        Book myObj = new Book("a", "b", 2);
        Book ob = new Book("test", 100);
        System.out.println(myObj.title);
        System.out.println("author: " + ob.author + " pages: " + ob.numPages);
    }
    }
