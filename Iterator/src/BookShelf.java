
public class BookShelf {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return  last;
    }

//    //传统模式：
//    public Book[] getBooks(){
//        return  books;
//    }

    public Iterator iterator() {
//        return new BookShelfIterator(this);
        return  new BookShelfIterator();
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
