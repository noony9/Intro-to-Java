package hello.java;

public abstract class Bot {
    private String _name = "bot";
    private int _IQ = 100;
    private int _oil = 10;

    public static String _model = "Bot";
    final static String _codeWord = "Rabble";

    public Bot(String _name, int _IQ, int _oil){
        setName(_name);
        setIQ(_IQ);
        setOil(_oil);
    }

    private void setName(String _name){
        this._name = _name;
    }

    public String getName(){
        return _name;
    }

    public String getCodeWord (){
        return _codeWord;
    }
    private void setIQ (int _IQ){
        this._IQ = _IQ;
    }

    public int getIQ (){
        return _IQ;
    }

    private void setOil (int _oil){
        this._oil = _oil;
    }

    public int getOil (){
        return _oil;
    }

    public void maintenanceCall(){
        if(getOil() <= 0){
            _IQ = 0;
            System.out.println(getName() + "Requires Servicing... beep, boop, beep");
        }
        else {
            System.out.println(getName() + "Servicing Not Required... beep, boop, beep");
        }
    }

    public abstract void render();

}
