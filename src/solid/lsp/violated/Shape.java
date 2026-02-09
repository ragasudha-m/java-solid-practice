package solid.lsp.violated;


class Shape {
    public double area() {
        return 0.0;
    }

    public void setWidth(double width) {
        throw new UnsupportedOperationException("Width not supported");
    }

    public void setHeight(double height) {
        throw new UnsupportedOperationException("Height not supported");
    }
}
