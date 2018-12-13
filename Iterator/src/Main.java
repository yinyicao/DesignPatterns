public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("Cinderella"));
        Iterator it  = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

        BookShelf1 bookShelf1 = new BookShelf1(4);
        bookShelf1.appendBook(new Book("Around the World in 80 Days__"));
        bookShelf1.appendBook(new Book("Bible__"));
        bookShelf1.appendBook(new Book("Daddy-Long-Legs__"));
        bookShelf1.appendBook(new Book("Cinderella__"));
        Iterator it1  = bookShelf1.iterator();
        while (it1.hasNext()){
            Book book = (Book) it1.next();
            System.out.println(book.getName());
        }

    }
}
