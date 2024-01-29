package Draft.task1OOP;


public class Main {
    public static void main(String[] args) {
        /** method verification
         * */

        Paper paper = new Paper();
        paper.setSheets(3);
        paper.toBurn(paper.getSheets());


        Napkin paperNapkin = new Napkin();
        paperNapkin.setSheets(5);
        paperNapkin.toBurn(paperNapkin.getSheets());


        Paper floor = new Paper();
        floor.toBurn();

        paper.fold(4);
        paper.tore(4);
        paperNapkin.fold(8);
        paperNapkin.tore(8);
        paperNapkin.whatColor();
        paper.whatColor();

    }

}
