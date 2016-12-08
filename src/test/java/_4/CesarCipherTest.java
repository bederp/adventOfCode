package _4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kinder112 on 08.12.2016.
 */
public class CesarCipherTest {
    @Test
    public void shouldDecipherRoomName() throws Exception {
        //Given
        Room r = new Room("qzmt-zixmtkozy-ivhz-343[abdce]");
        //When
        final String name = CesarCipher.decipher(r.getName(), r.getSectorId());
        //Then
        Assert.assertEquals("very-encrypted-name", name);
//        MatcherAssert.assertThat(name, equals("very encrypted name"));

    }
}