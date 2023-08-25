import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListDataTest {

    @Test
    public void testArguments(){
        ListData argsData = new ListData(new String[] {"t=n", "'v=0,-1,3,1,10'"});
        ListData argsData2 = new ListData(new String[] {"t=c", "'v=z,a,Z,A,b'"});

        assertEquals("n",argsData.getType());
        assertEquals("c",argsData2.getType());
    }

    @Test
    public void testArray(){
        ListData argsData = new ListData(new String[] {"t=n", "v=0,-1,3,1,10\""});
        ListData argsData2 = new ListData(new String[] {"t=c", "v=z,a,Z,A,b"});


        assertEquals("[0, -1, 3, 1, 10]", Arrays.toString(argsData.getArrayInteger()));
        assertEquals("[z, a, Z, A, b]",Arrays.toString(argsData2.getArrayCharacter()));
    }

}