import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    public void nullPointerEx() throws NullPointerException {
        String str = null;
        System.out.println(str.length());
    }

    /**
     * Javadoc.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return "";
        } catch (NullPointerException e) {
            // e.printStackTrace();
            return "Lỗi Null Pointer";
        }
    }

    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];
        arr[8] = 8;
    }

    /**
     * Javadoc.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return "";
        } catch (ArrayIndexOutOfBoundsException e) {
            // e.printStackTrace();
            return "Lỗi Array Index Out of Bounds";
        }
    }

    public void arithmeticEx() throws ArithmeticException {
        int res = 12 / 0;
    }

    /**
     * Javadoc.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return "";
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            return "Lỗi Arithmetic";
        }
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        FileReader file = new FileReader("random.java");
    }

    /**
     * Javadoc.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return "";
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            return "Lỗi File Not Found";
        }
    }

    public void ioEx() throws IOException {
        FileReader file = new FileReader("random.java");
        file.close();
    }

    /**
     * Javadoc.
     */
    public String ioExTest() {
        try {
            ioEx();
            return "";
        } catch (IOException e) {
            // e.printStackTrace();
            return "Lỗi IO";
        }
    }

    /**
     * Javadoc.
     */
    public static void main(String[] args) {
        Week8Task2 ex = new Week8Task2();
        System.out.println(ex.nullPointerExTest());
        System.out.println(ex.arrayIndexOutOfBoundsExTest());
        System.out.println(ex.arithmeticExTest());
        System.out.println(ex.fileNotFoundExTest());
        System.out.println(ex.ioExTest());
    }
}