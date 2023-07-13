package shapes;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}

