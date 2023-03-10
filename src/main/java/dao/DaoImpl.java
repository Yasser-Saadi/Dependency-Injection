package dao;

public class DaoImpl implements Idao {

    @Override
    public double getData() {
        System.out.println("Version base de donnees !!");
        double tmp = Math.random()*40;
        return tmp;
    }
}
