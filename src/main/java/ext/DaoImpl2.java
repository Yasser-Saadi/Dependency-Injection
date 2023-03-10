package ext;

import dao.Idao;

public class DaoImpl2 implements Idao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs !");
        double temp = 200;
        return temp;
    }
}
