public class SnakeLadderSimulator {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Snake and Ladder Siimulator problem.");
        int player=1;
        int position=0;
        int randomCheck=(int) Math.floor(Math.random()+1)%6;
        System.out.println("Random Dice number is:"+randomCheck);
    }
}
