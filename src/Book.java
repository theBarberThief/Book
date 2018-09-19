public class Book {
    private int numPages;
    private int currentPage;

    public Book(int theNumPages){
        currentPage = 1;
        numPages = theNumPages;

    }

    public void setNumPages( int numPages){
        this.numPages = numPages;

    }

    public void setCurrentPage( int currentPage){
        this.currentPage = currentPage;
    }

    public int getNumPages(){
        return numPages;
    }

    public int getCurrentPage(){
        return currentPage;
    }

    public void nextPage(){
        if(currentPage < numPages){
            currentPage++;
        }
    }
}
