
public class HiloExtraccion extends Thread {
    private final Caja caja;

    public HiloExtraccion(Caja caja) {
        this.caja = caja;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            double extraccion = Math.random() * 80 + 1;
            caja.extraer(extraccion);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.err.println("Hilo de extracción interrumpido.");
            }
        }
    }
}