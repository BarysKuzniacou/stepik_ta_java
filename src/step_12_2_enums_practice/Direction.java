package step_12_2_enums_practice;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction closestToDegrees(int degrees) {
        Direction result  = Direction.N;

        if (0 <= degrees && degrees < 23) {
            return Direction.N;
        } else if (23 <= degrees && degrees < 68) {
            return Direction.NE;
        } else if (68 <= degrees && degrees < 113) {
            return Direction.E;
        } else if (113 <= degrees && degrees < 158) {
            return Direction.SE;
        } else if (158 <= degrees && degrees < 203) {
            return Direction.S;
        } else if (203 <= degrees && degrees < 248) {
            return Direction.SW;
        } else if (248 <= degrees && degrees < 293) {
            return Direction.W;
        } else if (degrees >= 293) {
            return Direction.NW;
        }

        return result;
    }
}
