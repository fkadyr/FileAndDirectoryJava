package task4_2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        String path = "C:\\Users\\zverk\\IdeaProjects\\FileAndDirectoryJava\\src\\main\\java\\task4_2\\test";
        String existing = "txt";

        fileAndDir(path, existing, true).forEach(System.out::println);
    }

    public static List<List<String>> fileAndDir(String path, String existing, boolean flag) {
        File dir = new File(path);
        ArrayList<File> expand = new ArrayList<File>();
        List<String> listFile = new ArrayList<>();
        List<String> listDir = new ArrayList<>();

        expand.addAll(Arrays.asList(dir.listFiles()));

        for (int i = 0; i < 2; i++) {
            File[] expandCopy = expand.toArray(new File[expand.size()]);
            expand.clear();

            for (File file: expandCopy) {
                if (file.isDirectory()) {
                    listDir.add(file.getName());
                    expand.addAll(Arrays.asList(file.listFiles()));
                } else {
                    if (file.getName().endsWith(existing)) {
                        listFile.add(file.getName());
                    }
                }
            }
            if (!flag) {
                break;
            }
        }
        List<List<String>> out = new ArrayList<>();
        out.add(listDir);
        out.add(listFile);

        return out;
    }
}
