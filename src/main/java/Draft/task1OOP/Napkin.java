package Draft.task1OOP;

/**
 * heir Class*/
class Napkin extends Сellulose {
    private int sheets;

    protected void setSheets(int sheets) {
        this.sheets = sheets;
    }

    @Override
    public void whatColor() {
        System.out.println("Blue");
    }

    @Override
    public int getSheets() {
        return sheets;
    }


    @Override
    public int toBurn(int sheets) {
        System.out.printf("Салфеток было: " + sheets);
        sheets = 0;
        System.out.println();
        System.out.printf("Салфетки сгорели и их стало: " + sheets);
        System.out.println();
        return (sheets);
    }

    @Override
    public int fold(int sheets) {
        System.out.printf("Вы сложили салфетку " + sheets + "%n" + "И получили " + sheets/2 + "%n");
        this.sheets = sheets/2;
        return sheets;
    }

    @Override
    public int tore(int sheets) {
        System.out.printf("Вы разорвали салфетку " + sheets + "%n" + "И получили " + sheets*2 + "%n");
        this.sheets = sheets*2;
        return sheets;
    }
}
