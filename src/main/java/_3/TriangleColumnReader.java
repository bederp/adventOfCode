package _3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kinder112 on 04.12.2016.
 */
class TriangleColumnReader {
    private boolean firstPass = true;
    private int columns;
    private int currentLine;
    private Triangle[] currentTriangles;
    private List<Triangle> triangles = new ArrayList<>();

    void parse(String line) {
        final String[] splited = line.trim().split("\\s+");
        if (firstPass) {
            determineColumnNumber(splited);
        }
        assignSides(splited);
    }

    private void assignSides(String[] splited) {
        if (isFirstTriangleRow()) {
            for (int i = 0; i <currentTriangles.length ; i++) {
                currentTriangles[i] = new Triangle();
            }
        }

        setSides(splited);

        if (isThirdTriangleRow()) {
            triangles.addAll(Arrays.asList(currentTriangles));
        }
        currentLine++;
    }

    private boolean isThirdTriangleRow() {
        return currentLine % 3 == 2;
    }

    private void setSides(String[] splited) {
        for (int i = 0; i < splited.length; i++) {
            setSide(splited[i], i);
        }
    }

    private boolean isFirstTriangleRow() {
        return currentLine % 3 == 0;
    }

    private void setSide(String splited, int i) {
        final long side = Long.parseLong(splited);
        switch (currentLine % 3) {
            case 0:
                currentTriangles[i].setA(side);
            case 1:
                currentTriangles[i].setB(side);
            case 2:
                currentTriangles[i].setC(side);
        }
    }

    private void determineColumnNumber(String[] splited) {
        columns = splited.length;
        currentTriangles = new Triangle[columns];
        firstPass = false;
    }

    List<Triangle> getTriangles() {
        return triangles;
    }
}
