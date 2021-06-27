package behaviouralPatterns.visitorPattern.visitor;

import behaviouralPatterns.visitorPattern.shapes.Circle;
import behaviouralPatterns.visitorPattern.shapes.CompoundShape;
import behaviouralPatterns.visitorPattern.shapes.Dot;
import behaviouralPatterns.visitorPattern.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}