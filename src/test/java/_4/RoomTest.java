package _4;

import com.google.common.collect.Multiset;
import org.junit.Assert;
import org.junit.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by kinder112 on 05.12.2016.
 */
public class RoomTest {

    @Test
    public void shouldParseStringParts() throws Exception {
        Room room = new Room("aaaaa-bbb-z-y-x-123[abxyz]");
        //Then
        Assert.assertThat(room.getName(), is("aaaaa-bbb-z-y-x"));
        Assert.assertThat(room.getSectorId(), is("123"));
        Assert.assertThat(room.getHash(), is("abxyz"));
    }

    @Test
    public void shouldCountOccurrencesInName() throws Exception {
        //When
        Room room = new Room("aaaaa-bbb-z-y-x-123[abxyz]");
        //Then
        final Multiset<Character> occurrences = room.getOccurrences();
        Assert.assertThat(occurrences.count('a'), is(5));
        Assert.assertThat(occurrences.count('b'), is(3));
        Assert.assertThat(occurrences.count('z'), is(1));
        Assert.assertThat(occurrences.count('y'), is(1));
        Assert.assertThat(occurrences.count('x'), is(1));
    }

    @Test
    public void shouldValidateCorrectly() throws Exception {
        //When
        Room room1 = new Room("aaaaa-bbb-z-y-x-123[abxyz]");
        Room room2 = new Room("a-b-c-d-e-f-g-h-987[abcde]");
        Room room3 = new Room("not-a-real-room-404[oarel]");
        Room room4 = new Room("totally-real-room-200[decoy]");
        //Then
        Assert.assertThat(room1.isValid(), is(TRUE));
        Assert.assertThat(room2.isValid(), is(TRUE));
        Assert.assertThat(room3.isValid(), is(TRUE));
        Assert.assertThat(room4.isValid(), is(FALSE));
    }
}