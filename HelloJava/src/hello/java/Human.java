package hello.java;

public class Human {
    private String Name;
    private static int Life = 100;

    Human(String name){
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public static void setLife(int life) {
        Life = life;
    }

    public int getLife(){
        return Life;
    }

    public void Parrish(){
        if (Human.Life <= 0){
            System.out.println(getName() + " " + "says with a final breath, \"I did not expect this.... arrrghhh\"\n");
        }
    }
}
