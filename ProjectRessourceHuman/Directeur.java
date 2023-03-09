package ProjectRessourceHuman;

public class Directeur extends Employee{
    private int nombreResponsables;

    public Directeur(String nom, String prenom, int idNum, String tel, int nombreResponsables) {
        super(nom, prenom, idNum, tel);
        this.nombreResponsables = nombreResponsables;
    }

    @Override
    public void montreLinfos() {
        super.montreLinfos();
        System.out.println("Nombre de personnes dont le responsable a la charge"+nombreResponsables);
    }
    public void augmenterSalaire(int augmentation){
        System.out.println(getNom()+ " a employees " + augmentation + " a augmente le salaire");

    }
}
