public class ComputerGame {
    public static int[] ComputerGameStart(){
        System.out.print("Предсказать количество очков (2..12):\n");
        int  ComputerNumber = Servise.RandomComputer();
        System.out.println("Компьютер бросает кости:");
        System.out.println(ComputerNumber);
        int i = Servise.Random();
        int x =Servise.Random();
        int summ = i+x;
        printDaice.printDice(i);
        printDaice.printDice(x);
        int result = summ - Math.abs(summ - ComputerNumber) * 2;
        System.out.printf("На кости выпало %s очков.\n",summ);
        System.out.printf("Результат: %s-abs (%s-%s)*2: %s баллов.\n",summ,summ,ComputerNumber,result);
        int [] data = new int [3];
        data[0]= summ;
        data[1]= ComputerNumber;
        data[2]= result;
        return data;
    }
}
