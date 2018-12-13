import java.util.ArrayList;

public class BookShelf {

    private Book[] books;
//    private ArrayList<Book> books ;//使用ArrayList实现
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
//        this.books = new ArrayList<>(maxsize);//初始大小
    }

    public Book getBookAt(int index){
        return books[index];
//        return  books.get(index);
    }

    public void appendBook(Book book){
        this.books[last] = book;
//        this.books.add(book);
        last++;
    }

    public int getLength(){
        return  last;
//        return  books.size();
    }

    public Iterator iterator() {
//        return new BookShelfIterator(this);
        return  new BookShelfIterator();
        //tips:使用ArrayList时，这里也可以直接返回ArrayList内置的迭代器
    }

    class  BookShelfIterator implements  Iterator{
//        private BookShelf bookShelf; //采用内部类，可以直接调用外部类方法，不用添加引用。
        private int index ;
        public BookShelfIterator() {
//            this.bookShelf=bookShelf;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            if (index < getLength()){
                return  true;
            }else {
                return  false;
            }
        }
        @Override
        public Object next() {
            Book book  = getBookAt(index);
            index++;
            return book;
        }
    }
}
