import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Utils{
    public static String readContentFromFile(String path) {
        String content = "";
        try{
            BufferedReader in = new BufferedReader(new FileReader(path));
            String line;
            while ((line = in.readLine()) != null) {
                content += line;
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void writeContentToFile(String content, String path) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(path));
            out.write(content);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeContentToFile_(String content, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter out = new BufferedWriter(fileWriter);
            out.write(content);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].getName().equals(fileName)) return files[i];
            } 
        }
        return null;
    }

    public static void main(String[] args) {
        File file = findFileByName("D:\\file_lap_trinh\\Java\\week13", "input.txt");
        if (file != null) {
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
            String content = readContentFromFile(file.getAbsolutePath());
            System.out.println(content);
            writeContentToFile("Hello\n", "output.txt");
            writeContentToFile_("Bye\n", "output.txt");
        }
    }
}