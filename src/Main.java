import model.*;
import model.exceptions.*;
import view.*;
import controllers.*;

public class Main {

    public static void main(String... args) {
        final Field field = new Field();

        for (int i = 0; i < field.getSize(); i++) {
            for (int i2 = 0; i2 < field.getSize(); i2++) {
                final Point p = new Point();
                p.x = i;
                p.y = i2;
                field.setFigure(p, String.format("%d-%d", i, i2));
            }
        }
        for (int i = 0; i < field.getSize(); i++) {
            for (int i2 = 0; i2 < field.getSize(); i2++) {
                final Point p = new Point();
                p.x = i;
                p.y = i2;
                final String figure = String.format("%d-%d", i, i2);
                if (!field.getFigure(p).equals(figure)) {
                    throw new RuntimeException(String.format("figure on X=%d, Y=%d equals to %s instead of %s", i, i2, field.getFigure(p), figure));
                }
            }
        }


    }

}