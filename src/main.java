
public class main {
        public static void main (String[] args) {

            RelogioInterface relogio = new RelogioInterface();

            while (true) {
                relogio.atualizarHora();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
}
