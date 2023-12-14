package OOP2.task0;


public class Main {
    public static void main(String[] args) {
        // добавим листы

        Paper paper = new Paper();
        paper.setSheets(3);
        paper.toBurn(paper.getSheets());


        Napkin paperNapkin = new Napkin();
        paperNapkin.setSheets(5);
        paperNapkin.toBurn(paperNapkin.getSheets());

       // проверка перезгузки
        Paper floor = new Paper();
        floor.toBurn();
        //3) понять что такое полиморфизм.
        //  3.1) Написать интерфейс, ключевое слово implements
        //  3.2) попробовать сделать override и overload методов
        paper.fold(4);
        paper.tore(4);
        paperNapkin.fold(8);
        paperNapkin.tore(8);

    }

}
