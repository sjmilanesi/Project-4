package Main.OlympianManager;


public class OlympianManager {

    public Olympian[] olympians = new Olympian[15];
    public int count = 0;
    
    public OlympianManager(){
        addOlympian("Steven", Sex.Male, 22);
        addOlympian("Andrew", Sex.Male, 24);
        addOlympian("Vanessa", Sex.Female, 21);
        addOlympian("Gary", Sex.Male, 61);
        addOlympian("Mary", Sex.Female, 55);
        addOlympian("Jeremy", Sex.Male, 32);
        addOlympian("Armand", Sex.Male, 45);
        addOlympian("Chloe", Sex.Female, 12);
        addOlympian("Ellen", Sex.Female, 40);
        addOlympian("Anthony", Sex.Male, 35);
        addOlympian("Rob", Sex.Male, 36);
        addOlympian("Michael", Sex.Male, 32);
        addOlympian("Nicole", Sex.Male, 29);
        addOlympian("Kevin", Sex.Male, 28);
        addOlympian("Christopher", Sex.Male, 18);
    }

    private void addOlympian(String name, Sex sex, int age){
        Olympain temp= new Olympian();
        temp.setName(name);
        temp.setSex(sex);
        temp.setAge(age);
        olympains[count] = temp;
        count ++;
    }

    public Olympian[] getOlympians()
    {
        return olympians;
    }
}
