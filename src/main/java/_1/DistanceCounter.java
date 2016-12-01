package _1;

import java.util.Arrays;
import java.util.EnumMap;

import static _1.Directions.*;

/**
 * Created by kinder112 on 01.12.2016.
 */
class DistanceCounter {
    private Directions currentDirection = Directions.NORTH;
    private EnumMap<Directions, Long> directionsDistance = new EnumMap<>(Directions.class);

    DistanceCounter() {
        Arrays.stream(Directions.values()).forEach(
                e -> directionsDistance.put(e, 0L)
        );
    }

    void parseStep(String step) {
        turn(step.substring(0, 1));
        increaseDistance(step.substring(1, step.length()));
    }

    private void turn(String turn) {
        if (turn.equals("L")) {
            currentDirection = currentDirection.left();
        } else {
            currentDirection = currentDirection.right();
        }
    }

    private void increaseDistance(String distance) {
        Long currentDistance = directionsDistance.get(currentDirection);
        currentDistance += Long.valueOf(distance);
        directionsDistance.put(currentDirection, currentDistance);
    }

    long calculateDistance() {
        final Long east = directionsDistance.get(EAST);
        final Long west = directionsDistance.get(WEST);
        final Long north = directionsDistance.get(NORTH);
        final Long south = directionsDistance.get(SOUTH);

        return Math.abs(east - west) + Math.abs(north - south);
    }
}
