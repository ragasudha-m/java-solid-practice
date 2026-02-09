package solid.lsp.violated;


class Square extends Shape {
    private double side;

    @Override
    public void setWidth(double width) {
        this.side = width;
    }

    @Override
    public void setHeight(double height) {
        this.side = height;
    }

    @Override
    public double area() {
        return side * side;
    }
}

