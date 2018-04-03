public class Main {

    public static void main(String[] args) {
	// write your code here
        Direction dir0 = Direction.UP;
        Direction dir1 = Direction.valueOf("RIGHT");


        System.out.println(dir1);

        if(dir0 ==Direction.RIGHT){
            System.out.println("Right = right?");

            switch (dir0){
                case RIGHT:
                    System.out.println("Move right");
                    break;
                case UP:
                    System.out.println("Move UP");
                    break;
                default:
                    break;

            }

        }

        int pos = dir1.ordinal();
        System.out.println(pos);

        int diff = dir0.compareTo(dir1);
        System.out.println(diff);

        System.out.println(dir0.getMove());

        Direction [] dir = Direction.values();
        for(Direction direction: dir){
            System.out.println(direction + " - > " + direction.getMoveInfo());


        }
    }
}
