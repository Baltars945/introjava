package fr.dampierre.Tp_mentalisme;

public class Assistant {
    private int age;
    private int argent;
    private int trmagic;

    Assistant(int age, int argent){
        this.age = age;
        this.argent =argent;
    }

    void magic(int age,int argent){
        trmagic = (age * 2 + 5 )* 50 + argent - 365;
    }
    public int getTrmagic() {
        return trmagic;
    }
    public int getAge() {
        return age;
    }
    public int getArgent() {
        return argent;
    }
}
