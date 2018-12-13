import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Iterator> iterList = new ArrayList<>(); //存放Iterator
        BookShelf bookShelf = new BookShelf(4);//实例化第一个书架
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("Cinderella"));
        Iterator it  = bookShelf.iterator();
        iterList.add(it);

        BookShelf1 bookShelf1 = new BookShelf1(4);//实例化第二个书架
        bookShelf1.appendBook(new Book("Around the World in 80 Days__"));
        bookShelf1.appendBook(new Book("Bible__"));
        bookShelf1.appendBook(new Book("Daddy-Long-Legs__"));
        bookShelf1.appendBook(new Book("Cinderella__"));
        Iterator it1  = bookShelf1.iterator();
        iterList.add(it1);
        for (int i = 0; i < iterList.size(); i++) {
            Iterator iterator = iterList.get(i);
            while (iterator.hasNext()){
                Book book = (Book) iterator.next();
                System.out.println(book.getName());
            }
        }


    }
}
