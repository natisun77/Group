package homework.homeworks.tenth.robot;

public class Robot {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean isMoved = false;
        for (int i = 0; i < 3; i++) {
            if (!isMoved) {
                try (RobotConnection connection = robotConnectionManager.getConnection();) {
                    connection.moveRobotTo(toX, toY);
                    isMoved = true;
                } catch (RobotConnectionException e) {
                }
            }
        }
        if (!isMoved) {
            throw new RobotConnectionException("Connection was not set after three tries.");
        }
    }
}
