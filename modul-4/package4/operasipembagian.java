
package package4;


class OperasiPembagian extends OperasiAbstract{
    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected void set_C() {
        this.c = a / b;
    }

    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }

    @Override
    protected double get_C() {
        return c;
    }

    @Override
    protected void tampil() {
        System.out.println("x Hasil Pembagian ");
        System.out.println("x " + get_A() + " / " + get_B() + " = " + get_C());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
