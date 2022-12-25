public class UserGame {
    public static int[] UserGameStart(){
        System.out.print("Предсказать количество очков (2..12):\n");
        int  userNumber = Servise.RandomComputer();
        System.out.println("Пользователь бросает кости:\n");
        int i = Servise.Random();
        int x =Servise.Random();
        int summ = i+x;
        printDaice.printDice(i);
        printDaice.printDice(x);
        int result = summ - Math.abs(summ - userNumber) * 2;
        System.out.printf("На кости выпало %s очков.\n",summ);
        System.out.printf("Результат: %s-abs (%s-%s)*2: %s баллов.\n",summ,summ,userNumber,result);
        int [] data = new int [3];
        data[0]= summ;
        data[1]= userNumber;
        data[2]= result;
        return data;
    }
}
