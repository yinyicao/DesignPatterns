import java.util.ArrayList;

public class BookShelf1 {

    private ArrayList<Book> books ;//使用ArrayList实现

    public BookShelf1(int maxsize) {
        this.books = new ArrayList<>(maxsize);//初始大小
    }

    public Book getBookAt(int index){
        return  books.get(index);
    }

    public void appendBook(Book book){
        this.books.add(book);
    }

    public int getLength(){
        return  books.size();
    }

    public Iterator iterator() {
        return  new BookShelfIterator();
    }

//    //传统模式
////    public ArrayList<Book> getBooks(){
////        return  books;
////    }

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
