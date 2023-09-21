import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class AppData {
    private String[] header;

    private int[][] data;

    public AppData() {
    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    @Override
    public String toString() {
        String stringDate = "";
        for (String word : header)
            stringDate += word + "\t";
        stringDate += "\n";
        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[0].length; column++) {
                stringDate += data[row][column] + "\t";
            }
            stringDate += "\n";
        }
        return stringDate;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }
}
