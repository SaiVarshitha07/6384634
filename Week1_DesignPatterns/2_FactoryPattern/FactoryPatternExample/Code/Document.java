public interface Document {
    void open();
}
class WordDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening a Word Document");
    }
}
class PdfDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening a Pdf Document");
    }
}
class ExcelDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening an Excel Document");
    }
}
