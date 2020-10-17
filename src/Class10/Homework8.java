package Class10;

public class Homework8 {

    /**
     * Create a printer
     *
     * max toner level = 100
     * max pages in tray = 100
     * with 1 page printing, 1 toner is being used
     *
     * 1. addToner
     * 2. addPages
     * 3.
     *      a) printSingle (1 toner = 1 page)
     *      b) printDouble (1 toner = 0.5 page)
     * 4. printerSummary
     *      Toner level:
     *      Pages count in tray:
     * 5. checkToner
     *      if toner is less than 10; it should warn to "Add toner"
     */

    /**
     * printerSummary   // T: 100, P:100
     * <p>
     * printSingle(10)
     * <p>
     * printerSummary   // T: 90, P:90
     * <p>
     * printDouble(10)
     * <p>
     * printerSummary   // T: 80, P:85
     */

    private static int toner = 100;
    private static int pages = 100;

    public void addToner(int tonerAdding) {
        if ((toner == 100) || (tonerAdding + toner > 100)) {
            System.out.println("Toner level at maximum amount!");
        } else toner += tonerAdding;
        System.out.println("Toner level: " + toner);

    }

    public void addPages(int pagesAdding) {
        if ((pages == 100) || (pagesAdding + pages > 100)) {
            System.out.println("Tray has reached maximum amount of pages!");
        } else pages += pagesAdding;
        System.out.println("Pages in tray: " + pages);

    }

    public void printSingle(int pageAmount) {
        toner = toner - pageAmount;
        pages = pages - pageAmount;
    }

    public void printDoubles(int pageAmount) {
        toner = toner - pageAmount;
        if (pageAmount % 2 == 0) {
            pages = pages - (pageAmount / 2);
        } else {
            pages = pages - ((pageAmount / 2) + 1);
        }
    }

    public void printerSummary() {
        System.out.println("Toner level : " + toner);
        System.out.println("Pages count in tray : " + pages);
    }

    public void checkToner() {
        if (toner < 10) {
            System.out.println("Add toner!!");
        } else {
            System.out.println("Enough toner in Printer.");
        }
    }

}

