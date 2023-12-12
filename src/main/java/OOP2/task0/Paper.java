package OOP2.task0;

 class Paper implements Info{
     private int sheets;

     protected void setSheets(int sheets) {
         this.sheets = sheets;
     }

     protected int getSheets() {
         return sheets;
     }

     //перегрузка метода
     protected void toBurn() {
         System.out.println("Сожгли что-то не то ");
         System.out.println();
      }
     protected int toBurn(int sheets) {
         System.out.printf("Листов было: " + sheets);
         sheets = 0;
         System.out.println();
         System.out.printf("Листы сгорели и их стало: " + sheets);
         System.out.println();
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
 }
