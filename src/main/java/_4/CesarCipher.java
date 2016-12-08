package _4;

import java.util.stream.Collectors;

/**
 * Created by kinder112 on 07.12.2016.
 */
class CesarCipher {
    private static final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f',
                                                 'g', 'h', 'i', 'j', 'k', 'l',
                                                 'm', 'n', 'o', 'p', 'q', 'r',
                                                 's', 't', 'u', 'v', 'w', 'q',
                                                 'y', 'z'};
    private static final int alphabetLength = alphabet.length;

    static String decipher(String roomName, int sectorId) {
        return roomName.chars().map(i -> {
            if (isAsciiCharacter(i)) {
                final int alphabetOffset = i - 97;
                final int cipherShift = (alphabetOffset + sectorId) % alphabetLength;
                return alphabet[cipherShift];
            } else {
                return i;
            }
        }).mapToObj(c ->String.valueOf((char) c)).collect(Collectors.joining());
    }

    private static boolean isAsciiCharacter(int i) {
        return i > 96 && i < 123;
    }
}
