package docs;

// odwołując się do interface mozna tworzyc obiekty klas korzystających z tego interface

public class DocumentChecker {

    public static void main(String[] args) {
        //ExcelDocument excelDocument = new ExcelDocument();
       // Document doc = new ExcelDocument();
        Document doc = new PdfDocument();
        doc.getDescription();
    }
}
