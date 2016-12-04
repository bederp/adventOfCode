package _3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by kinder112 on 03.12.2016.
 */
public class _3 {
    private static int a;
    private static int b;
    private static int c;
    private static int counter;

    static Triangle t1;
    static Triangle t2;
    static Triangle t3;
    static int mod3;

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("target/classes/input3.txt");
        TriangleColumnReader tcr = new TriangleColumnReader();
        Files.lines(path).forEach(
                e -> {
                    tcr.parse(e);
                    final String[] splited = e.trim().split("\\s+");
                    assignSides(splited);
                    counter += isValid();
                }
        );
        System.out.println(counter);

        final List<Triangle> triangles = tcr.getTriangles();

        final long count = triangles.stream().filter(Triangle::isValid).count();

        System.out.println("Column valid triangles count = " + count);

    }

    private static int isValid() {
        if (a + b <= c)
            return 0;
        if (b + c <= a)
            return 0;
        if (a + c <= b)
            return 0;
        return 1;
    }

    private static void assignSides(String[] splited) {
        a = Integer.parseInt(splited[0]);
        b = Integer.parseInt(splited[1]);
        c = Integer.parseInt(splited[2]);
    }


}
