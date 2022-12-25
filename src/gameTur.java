import java.util.Arrays;

public class gameTur {
    static public void Games(){
        int[][] computerList = new int[3][3];
        int[][] userList = new int[3][3];
        for (int i = 0; i <3 ; i++) {
            System.out.printf("---          Start game %s         ---\n\n",i+1);
            int [] user = UserGame.UserGameStart();
            int [] computer = ComputerGame.ComputerGameStart();
            System.out.printf("----------Очки игроков--------- \n Пользователь:        %s \n Компьютер:           %s \n",user[2] , computer[2]);
            if (user[2]>computer[2]){
                System.out.println(" Пользователь выигрывает на " + (user[2]-computer[2])+"!\n" +
                        "----------------------------------\n");
            }else{
            System.out.println(" Копьютер выигрывает на " + (computer[2]-user[2])+"!\n" +
                    "----------------------------------\n");

            }
            computerList[i] = computer;
            userList[i] = user;
        }
        System.out.println("-------------- Finish game --------------");
        System.out.println(" Round |           User |      Computer");
        System.out.println("-------+----------------+----------------");
        for (int i = 0; i <computerList.length; i++) {
            int inex = i;
            System.out.printf("       | Predicted:  %2s | Predicted:   %2s\n",userList[i][0],computerList[i][0]);
            System.out.printf(" - "+(inex+1)+" - | Dice:       %2s | Dice:        %2s\n",userList[i][1],computerList[i][1]);
            System.out.printf("       | Result:     %2s | Result:      %2s\n",userList[i][2],computerList[i][2]);
            System.out.println("-------+----------------+----------------");
        }
        int  pointUser = 0;
        int pointComp = 0;
        for (int i = 0; i <userList.length ; i++) {
            pointUser = pointUser + userList[i][2];
            pointComp = pointComp + computerList[i][2];
        }
        System.out.printf("Total  | Points:    %3s | Points:     %3s\n",pointUser,pointComp);
        if (pointUser>pointComp){
            System.out.printf("Пользователи выигрывают на %s очков больше.\n",pointUser-pointComp);
            System.out.println("Поздравляю!");
            Games();
        }else if (pointUser<pointComp){
            System.out.printf("Компьютер выигрывают на %s очков больше.\n",pointComp-pointUser);
            System.out.println("Вы проиграли");
            Games();
        }else {
            System.out.println("Ничия");
        }
    }
}

