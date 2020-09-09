package hello.java;

public class Human {
    private String _name;
    private int _life = 100;

    Human(String _name){
        this._name = _name;
    }

    public String getName() {
        return _name;
    }

    public void setLife(int _life) {

        this._life = _life;
    }

    public int getLife(){

        return _life;
    }

    public void Parrish(){
        if (this._life <= 0){
            System.out.println(getName() + " " + "says with a final breath, \"I did not expect this.... arrrghhh\"\n");
        }
    }
}
