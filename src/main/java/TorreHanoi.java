public class TorreHanoi {
    public int resolverTorreHanoi(int discos) throws NumNegException {
        if (discos < 0) {
            throw new NumNegException("Insira uma entrada válida >= 0");
        }
        else {
            return (int) Math.pow(2, discos) - 1;
        }
    }
}