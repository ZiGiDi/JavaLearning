/**
 * Created by ZiGiDi on 11.01.2018.
 */
public enum Direction {
    UP(1){
        @Override
        public String getMoveInfo() {
            return "Move UP " + this.getMove() +" position";
        }
    }, DOWN(-1){
        @Override
        public String getMoveInfo() {
            return "Move DOWN " + this.getMove() +" position";
        }
    },LEFT(-1){
        @Override
        public String getMoveInfo() {
            return "Move LEFT " + this.getMove() +" position";
        }
    },RIGHT(1){
        @Override
        public String getMoveInfo() {
            return "Move  RIGHT " + this.getMove() +" position";
        }
    },;
    private int move;

    private Direction(int move) {
        this.move = move;
    }

    private Direction() {
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public  abstract  String getMoveInfo();
}
