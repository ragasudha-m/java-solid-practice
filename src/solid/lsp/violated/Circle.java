package solid.lsp.violated;


class Circle extends Shape {
    private double radius;

    @Override
    public void setWidth(double width) {
        throw new UnsupportedOperationException("Circle doesn't have width");
    }

    @Override
    public void setHeight(double height) {
        throw new UnsupportedOperationException("Circle doesn't have height");
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
