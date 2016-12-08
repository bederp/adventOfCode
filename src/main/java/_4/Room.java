package _4;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset.Entry;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * Created by kinder112 on 04.12.2016.
 */
class Room {
    //    aaaaa-bbb-z-y-x-123[abxyz] is a real room because the most common letters are a (5), b (3), and then a tie between x, y, and z, which are listed alphabetically.
//    a-b-c-d-e-f-g-h-987[abcde] is a real room because although the letters are all tied (1 of each), the first five are listed alphabetically.
//    not-a-real-room-404[oarel] is a real room.
//    totally-real-room-200[decoy] is not.

    private static final String REGEX = "(.*)-(\\d{3})\\[(.*)\\]";
    private String input;
    private String name;
    private int sectorId;
    private String hash;
    private Multiset<Character> occurrences = HashMultiset.create();
    private boolean valid;

    Room(String input) {
        this.input = input;
        parseInput(input);
        calculateCharactersFrequency();
        checkValidity();
    }

    private static Comparator<Entry<Character>> comparingCountandLexographic() {
        Comparator<Entry<Character>> comparator = comparing(Entry::getCount);
        return comparator.reversed().thenComparing(Entry::getElement);
    }

    boolean isValid() {
        return valid;
    }

    private void checkValidity() {
        final String realOrder = occurrences.entrySet().stream().sorted(comparingCountandLexographic()).limit(5).map(e -> String.valueOf(e.getElement())).collect(Collectors.joining());
        valid = realOrder.equals(hash);
    }

    Multiset<Character> getOccurrences() {
        return occurrences;
    }

    private void calculateCharactersFrequency() {
        final String temp = name.replaceAll("-", "");
        temp.chars().forEach(c -> occurrences.add((char) c));
    }

    private void parseInput(String input) {
        final Pattern pattern = Pattern.compile(REGEX);
        final Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            this.name = matcher.group(1);
            this.sectorId = Integer.valueOf(matcher.group(2));
            this.hash = matcher.group(3);
        }else{
            throw new IllegalArgumentException("Room name does not match regexp");
        }
    }

    public String getInput() {
        return input;
    }

    String getName() {
        return name;
    }

    int getSectorId() {
        return sectorId;
    }

    String getHash() {
        return hash;
    }
}
