package hello.java;

public class CompuBot {
    private String Name = "Bot";
    private String CodeWord = "Rabble";
    private int IQ = 100;
    private int Oil = 10;
    static String Model = "CompuBot";


    public CompuBot(String name, String codeword, int iq, int oil){
        Name = name;
        CodeWord = codeword;
        if(!codeword.equals("Rabble")){
            IQ = 50;
        }
        else {
            IQ = iq;
        }
        Oil = oil;
    }

    public void setName(String name){
        Name = name;
    }

    public String getName(){
        return Name;
    }

    public String getCodeWord (){
        return CodeWord;
    }
    public void setIQ (int iq){
        IQ = iq;
    }

    public int getIQ (){
        return IQ;
    }

    public void setOil (int oil){
        Oil = oil;
    }

    public int getOil (){
        return Oil;
    }

    public static String getModel(){
        System.out.println(Model);
        return Model;
    }

    public void maintenanceCall(){
        if(getOil() <= 0){
            IQ = 0;
            System.out.println(getName() + "Requires Servicing... beep, boop, beep");
        }
        else {
            System.out.println(getName() + "Servicing Not Required... beep, boop, beep");
        }
    }

}
