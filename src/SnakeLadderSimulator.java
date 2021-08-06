public class SnakeLadderSimulator {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Snake and Ladder Siimulator problem.");
        int player=1;
        int position=0;
        int randomCheck=(int) Math.floor(Math.random()+1)%6;
        System.out.println("Random Dice number is:"+randomCheck);
        int place=(int) Math.floor(Math.random())%3;
        System.out.println("Position is:"+place);
        if(place==1)
        {
            System.out.println("Ladder moves ahead by the position received in the die.");
        }
        if(place==2)
        {
            System.out.println("Snake moves behind by the position received in the die.");
        }
        else
        {
            System.out.println("The player stays on the same position.");
        }
    }
}
