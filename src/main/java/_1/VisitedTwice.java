package _1;

import java.awt.*;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;

/**
 * Created by kinder112 on 01.12.2016.
 */
class VisitedTwice {
    private Directions currentDirection = Directions.NORTH;
    private EnumMap<Directions, Long> directionsDistance = new EnumMap<>(Directions.class);
    private HashSet<Point> visitedPositions = new HashSet<>();
    private Point currentPosition = new Point();
    private Point firstVisitedTwicePosition = null;

    Point getFirstVisitedTwicePosition() {
        return firstVisitedTwicePosition;
    }


    VisitedTwice() {
        Arrays.stream(Directions.values()).forEach(
                e -> directionsDistance.put(e, 0L)
        );
        visitedPositions.add(new Point(currentPosition));
    }

    void parseStep(String step) {
        turn(step.substring(0, 1));
        changePosition(step.substring(1, step.length()));
    }

    private void changePosition(String distance) {
        Long move = Long.valueOf(distance);
        for (int i = 0; i < move; i++) {
            moveOneStep();
            addVisitedPosition();
        }
    }

    private void moveOneStep() {
        switch (currentDirection) {
            case EAST:
                currentPosition.translate(1, 0);
                break;
            case WEST:
                currentPosition.translate(-1, 0);
                break;
            case NORTH:
                currentPosition.translate(0, 1);
                break;
            case SOUTH:
                currentPosition.translate(0, -1);
                break;
        }
    }

    private void addVisitedPosition() {
        if (visitedPositions.contains(currentPosition)) {
            if (firstVisitedTwicePosition == null) {
                firstVisitedTwicePosition = new Point(currentPosition);
            }
        } else {
            visitedPositions.add(new Point(currentPosition));
        }
    }

    private void turn(String turn) {
        if (turn.equals("L")) {
            currentDirection = currentDirection.left();
        } else {
            currentDirection = currentDirection.right();
        }
    }
}
