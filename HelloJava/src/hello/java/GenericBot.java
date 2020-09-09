package hello.java;

public class GenericBot extends Bot {
    // now let's give those bots some unintended enhancements!.....
    private int _fluxCapacitor = 20;
    private int _humansDestroyed = 0;

    public GenericBot(String _name, int _IQ, int _oil, int _fluxCapacitor) {
        super(_name, _IQ, _oil);
        this._fluxCapacitor = _fluxCapacitor;
    }

    public void setFluxCapacitor(int _fluxCapacitor){
        this._fluxCapacitor = _fluxCapacitor;
    }

    public int getFluxCapacitor(){
        return _fluxCapacitor;
    }

    public void destroyHuman(Human human){
        human.setLife(0);
        ++this._humansDestroyed;
    }
}
