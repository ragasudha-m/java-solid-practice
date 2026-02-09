package solid.lsp.fixed;


class Square extends Shape {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }



    @Override
    public double area() {
        return side * side;
    }
}

