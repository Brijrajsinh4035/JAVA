import java.util.*;
public class Books{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book b;
        System.out.println("enter book or paper");
        String str = sc.next();
        if(str.equals("book")){
            b = new book_publication("raj","xyz");
            b.getinfo();
        }
        else if(str.equals("paper")){
            b = new paper_publication("raj","abcpublication");
            b.getinfo();
        }
    }
}

class Book{
    private String author_name;
    
    Book(String str){
        author_name = str;
    }

    void getinfo(){

    }

    void getauthor(){
        System.out.println("author name "+author_name);
    } 
}

class book_publication extends Book{
    private String title;

    book_publication(String author,String title){
        super(author);
        this.title = title;
    }
    
    void getinfo(){
        super.getauthor();
        System.out.println("title "+title);
    }
}
class paper_publication extends Book{
    private String title;

    paper_publication(String author,String title){
        super(author);
        this.title = title;
    }
    
    void getinfo(){
        super.getauthor();
        System.out.println("title "+title);
    }
}
