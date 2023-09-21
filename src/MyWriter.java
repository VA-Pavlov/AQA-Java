import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

abstract public class MyWriter {
    public static void saveInCsvFile(String[] header, int[][] data) {
        try {
            File file = new File("file.csv");

            if (!file.exists()) file.createNewFile();

            PrintWriter printWriter = new PrintWriter(file);

            for (int column = 0; column < header.length; column++) {
                if (column != header.length - 1)
                    printWriter.print(header[column] + ";");
                else printWriter.print(header[column] + "\n");
            }
            for (int row = 0; row < data.length; row++) {
                for (int column = 0; column < data[0].length; column++) {
                    if (column != data[0].length - 1) printWriter.print(data[row][column] + ";");
                    else printWriter.print(data[row][column] + "\n");
                }
            }

            printWriter.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void saveInCsvFile(AppData appData) {
        saveInCsvFile(appData.getHeader(), appData.getData());
    }
}
