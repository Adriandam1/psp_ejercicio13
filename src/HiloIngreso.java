
public class HiloIngreso extends Thread {
    private final Caja caja;

    public HiloIngreso(Caja caja) {
        this.caja = caja;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            double ingreso = Math.random() * 100 + 1;
            caja.ingresar(ingreso);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.err.println("Hilo de ingreso interrumpido.");
            }
        }
    }
}