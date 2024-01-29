package Draft.task1OOP;

/**
 * A validation class can implement multiple interfaces */
class Paper extends Сellulose implements Info, InfoInterSecond {
     private int sheets;

     protected void setSheets(int sheets) {
         this.sheets = sheets;
     }
/**
 * Overriding a method*/
    @Override
    public void whatColor() {
        System.out.println("Black");
    }

    public int getSheets() {
         return sheets;
     }

    /**
     *    Method overload
     */

     protected void toBurn() {
         System.out.println("Сожгли что-то не то ");
      }
     public int toBurn(int sheets) {
         System.out.printf("Листов было: " + sheets);
         sheets = 0;
         System.out.printf("Листы сгорели и их стало: " + sheets + "\n");
         return (sheets);
     }


     @Override
     public int fold(int sheets) {
         System.out.printf("Вы сложили лист бумаги " + sheets+"%n" + "И получили " + sheets/2 + "%n");
         this.sheets = sheets/2;
         return sheets;
     }

     @Override
     public int tore(int sheets) {
         System.out.printf("Вы разорвали бумагу " + sheets + "%n" + "И получили " + sheets*2 + "%n");
         this.sheets = sheets*2;
         return sheets;
     }

    @Override
    public int folded(int sheets) {
        return 0;
    }
}
