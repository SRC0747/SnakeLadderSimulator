public class SnakeLadderSimulator {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Snake and Ladder Siimulator problem.");
        int player=1;
        int position;
        int position1=0;
        while(position1<100) {
            int randomCheck = (int) Math.floor(Math.random() + 1) % 6;
            System.out.println("Random Dice number is:" + randomCheck);
            int place = (int) Math.floor(Math.random()) % 3;
            System.out.println("Position is:" + place);
            if (place == 1) {
                position1 = position1+randomCheck;
            }
            if (place == 2) {
                position1 = position1-randomCheck;
                if (position1 < 0)
                {
                    position1 = 0;
                }
            } else {
                position1 = position1+0;
            }
            System.out.println("The player wins with the position" + position1);
        }
    }
}
