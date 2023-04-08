package itfactory.com;

public class ExercitiulSapte {
    public static void main(String[] args) {
//        Se da urmatorul text:
//"avion avion avion avion avion avion avion avion , masina masina masina masina masina masina masina"
//Scrieti un program prin care sa se inlcouiasca primele 5 instante ale cuvantului "avion" cu cuvantul "racheta"
// si primele 3 instante ale cuvantului "masina" cu cuvantul "autobuz" din textul dat.
//
//Aspecte.
//2. Output: racheta racheta racheta racheta racheta avion avion avion , autobuz autobuz autobuz masina masina
// masina masina

        String text = "avion avion avion avion avion avion avion avion , masina masina masina masina masina masina masina";
        String modificat = text.replace("avion avion avion avion avion ", "racheta racheta racheta racheta racheta ");
        String modificat2 = modificat.replaceFirst("masina masina masina ", "autobuz autobuz autobuz ");
        System.out.println(modificat2);
    }
}
