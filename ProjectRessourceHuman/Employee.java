package ProjectRessourceHuman;

public class Employee {
    private String nom;
    private String prenom;
    private int idNum;
    private String tel;

    public Employee(String nom, String prenom, int idNum, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.idNum = idNum;
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void montreLinfos(){
        System.out.println("Les Infos de Personnel");
        System.out.println("Nom : "+nom);
        System.out.println("Prenom : "+prenom);
        System.out.println("Id : "+idNum);
        System.out.println("Tel : "+tel);


    }
}
