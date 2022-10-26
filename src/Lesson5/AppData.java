package Lesson5;

import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    @Override
    public String toString() {
        return  headerValuesToString(header) + "\n" +
                dataToString() ;

    }

    private String dataToString() {
        StringBuilder builder = new StringBuilder("[");
        for (int[] values : data) {
            builder.append(dataValuesToString(values)).append(";");
        }
        return builder.delete(builder.length() - 1, builder.length()).append("]").toString();
    }

    private String dataValuesToString(int[] values) {
        StringBuilder builder = new StringBuilder("[");
        for (int intValue : values) {
            builder.append(intValue).append(";");
        }
        return builder.delete(builder.length() - 1, builder.length()).append("]").toString();
    }

    private String headerValuesToString(String[] values) {
        StringBuilder builder = new StringBuilder(" ");
        for (String intValue : values) {
            builder.append(intValue).append(";");
        }
        return builder.delete(builder.length() - 1, builder.length()).append(" ").toString();
    }
}


