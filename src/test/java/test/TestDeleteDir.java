package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task4_3.DeleteDirectory;

import java.io.File;
import java.io.IOException;


public class TestDeleteDir {

    @Test
    public void testDeleteDir() throws IOException {
        File testDir = new File("C:\\Users\\zverk\\IdeaProjects\\FileAndDirectoryJava\\src\\main\\java\\task4_3\\delete");
        System.out.println(DeleteDirectory.isEmptyDir(testDir));
        Assertions.assertFalse(testDir.exists());
    }
}
