package FactoryMethodPatternExample;

public class PdfDocument implements Document {
    @Override
    public void open()
    {
        System.out.println("Opening Pdf Document");
    }
    @Override
    public void save()
    {
        System.out.println("Saving Pdf Document");
    } 
    
}
