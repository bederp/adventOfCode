package _4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by kinder112 on 07.12.2016.
 */
public class _4 {

    private static int counter;
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("target/classes/input4.txt");

        Files.lines(path).forEach(
                e -> {
                    final Room room = new Room(e);
                    if (room.isValid()) {
                        counter+=room.getSectorId();
                    }
                    final String roomName = CesarCipher.decipher(room.getName(), room.getSectorId());
                    System.out.println(roomName + " " + room.getSectorId());
                }
        );
        System.out.println(counter);
    }
}
