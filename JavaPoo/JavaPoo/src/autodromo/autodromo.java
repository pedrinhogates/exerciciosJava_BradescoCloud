package autodromo;

public class autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("1234567890");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("0987654321");
        //z400.ligar();

        Veiculo coringa = z400;

        coringa.ligar();


    }
}
