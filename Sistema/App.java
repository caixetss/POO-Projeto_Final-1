public class App {
    public static void main(String[] args) {

                
        Carro carro = new Carro();


            System.out.println(carro.mostrarInfo());
            System.out.println(carro.ligar());
    

            carro.setMarca("Toyota");
            carro.getMarca();
            System.out.println(carro.mostrarInfoMarca());
    

            carro.setModelo("Corolla");
            carro.getModelo();
            System.out.println(carro.mostrarInfoModelo());
    

            carro.setAno(2001);
            carro.getAno();
            System.out.println(carro.mostrarInfoAno());

        Moto moto = new Moto();
    
            System.out.println(moto.mostrarInfo());
            System.out.println(moto.ligar());
    
    
            moto.setMarca("Royal Enfield");
            moto.getMarca();
            System.out.println(moto.mostrarInfoMarca());
    

            moto.setModelo("Hunter 350");
            moto.getModelo();
            System.out.println(moto.mostrarInfoModelo());
    

            moto.setAno(2022);
            moto.getAno();
            System.out.println(moto.mostrarInfoAno());

    }
}