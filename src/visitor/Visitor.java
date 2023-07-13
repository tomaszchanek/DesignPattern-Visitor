package visitor;

import shapes.Circle;
import shapes.Dot;
import shapes.Rectangle;
import shapes.CompoundShape;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape compoundShape);
}
