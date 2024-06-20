package document;

// wskazując klasę bazową Document można odwołać się do elementów z klas rozszerzających -

public class DocumentChecker {
    public static void main(String[] args) {
         ExcelDocument document = new ExcelDocument();
         Document doc = new PdfDocument();
         Document pdfDocument = new PdfDocument();

         doc.getDescription();
         document.getDescription();
         pdfDocument.getDescription();


    }
}
