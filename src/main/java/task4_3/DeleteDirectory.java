package task4_3;

import java.io.File;
import java.io.IOException;

public class DeleteDirectory {
    public static void main(String[] args) throws IOException {
        File dirTest = new File("C:\\Users\\zverk\\IdeaProjects\\FileAndDirectoryJava\\src\\main\\java\\task4_3\\delete");

        System.out.println("Результат удаление каталога "+dirTest.getName()+" -> "+isEmptyDir(dirTest));
    }

    public static boolean isEmptyDir(File dir) throws IOException {
        if (!dir.exists() || !dir.isDirectory()) {
            return false;
        }
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                return false;
            }
        }
        for (File file: files) {
            file.delete();
        }
        return dir.delete();
    }
}

