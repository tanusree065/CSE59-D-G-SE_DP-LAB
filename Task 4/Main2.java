package Lab4;
interface Printer {
    void printDocument();
}
interface Scanner {
    void scanDocument();
}
interface FaxMachine {
    void faxDocument();
}
class MultiFunctionCopier implements Printer, Scanner, FaxMachine { 
public void printDocument() { 
        System.out.println("MultiFunctionCopier: Printing"); 
    }
    public void scanDocument() { 
        System.out.println("MultiFunctionCopier: Scanning"); 
    }
    public void faxDocument() { 
        System.out.println("MultiFunctionCopier: Faxing"); 
    }
}
class BasicPrinter implements Printer {
    public void printDocument() { 
        System.out.println("BasicPrinter: Printing"); 
    }
}
public class Main2 {
    public static void main(String[] args) {
        System.out.println(" Testing MultiFunctionCopier");
        MultiFunctionCopier mfp = new MultiFunctionCopier();
        mfp.printDocument();
        mfp.scanDocument();
        mfp.faxDocument();

        System.out.println("\n Testing BasicPrinter");
        BasicPrinter printer = new BasicPrinter();
        printer.printDocument(); 
   }
}  


