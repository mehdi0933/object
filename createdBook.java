public class createdBook {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook();
        book.titre = "nana";
        book.auteur ="zola";
        book.anneePublication = 1879;
        book.numeroISBN = 123432;
        book.disponible = false;
        book.livreInformation();
    }
}
