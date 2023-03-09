package ProjectRessourceHuman;

public class Developpeur extends Employee{

    private String langues;
    public Developpeur(String nom, String prenom, int idNum, String tel, String langues) {
        super(nom, prenom, idNum, tel);
        this.langues = langues;

    }

    @Override
    public void montreLinfos() {
        super.montreLinfos();
        System.out.println("Les langues que developpeur : " + langues);
    }

    public void formatez(String OS){//operating system
        System.out.println(getNom() + " " + OS+ " install");
    }
}
