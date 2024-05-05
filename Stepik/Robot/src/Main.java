public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.DOWN);
        moveRobot(robot, -10, 20);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = Direction.UP;
        int x = robot.getX();
        int y = robot.getY();

        if (x > toX) {
            direction = Direction.LEFT;
        } else if (x < toX) {
            direction = Direction.RIGHT;
        }

        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
        for (int i = 0; i < Math.abs(toX - x); i++) {
            robot.stepForward();
        }

        if (y > toY) {
            direction = Direction.DOWN;
        } else if (y < toY) {
            direction = Direction.UP;
        }

        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
        for (int i = 0; i < Math.abs(toY - y); i++) {
            robot.stepForward();
        }
        System.out.println(robot.getX());
        System.out.println(robot.getY());
    }
}