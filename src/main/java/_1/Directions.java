package _1;

import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by kinder112 on 01.12.2016.
 */
enum Directions {
    EAST,
    WEST,
    NORTH,
    SOUTH;

    private static final Map<Directions, Directions> LEFT = Collections.unmodifiableMap(Stream.of(
            new SimpleEntry<>(EAST, NORTH),
            new SimpleEntry<>(WEST, SOUTH),
            new SimpleEntry<>(NORTH, WEST),
            new SimpleEntry<>(SOUTH, EAST))
            .collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue)));

    private static final Map<Directions, Directions> RIGHT = Collections.unmodifiableMap(Stream.of(
            new SimpleEntry<>(EAST, SOUTH),
            new SimpleEntry<>(WEST, NORTH),
            new SimpleEntry<>(NORTH, EAST),
            new SimpleEntry<>(SOUTH, WEST))
            .collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue)));

    Directions left(){
        return LEFT.get(this);
    }

    Directions right(){
        return RIGHT.get(this);
    }
}
