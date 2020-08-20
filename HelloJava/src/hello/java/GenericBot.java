package hello.java;

public class GenericBot extends CompuBot {
    // now let's give those bots some unintended enhancements!.....
    private int fluxCapacitor = 20;
    private int humansDestroyed = 0;

    public GenericBot(String name, String codeword, int iq, int oil, int fluxcapacitor) {
        super(name, codeword, iq, oil);
        fluxCapacitor = fluxcapacitor;
    }

    public void setFluxCapacitor(int fluxcapacitor){
        fluxCapacitor = fluxcapacitor;
    }

    public int getFluxCapacitor(){
        return fluxCapacitor;
    }

    public void destroyHuman(){
        Human.setLife(0);
        ++humansDestroyed;
    }
}
