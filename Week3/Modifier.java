package Online_Code_Samples.Week3;

public class Modifier {

    private String name;
    public String surname;

    public Modifier(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Surname: " + surname;
    }

    public static void main(String[] args) {

        Modifier md = new Modifier("Joy", "Efe");

        md.surname = "Okorobie";

        System.out.println(md.toString());

    }

}
