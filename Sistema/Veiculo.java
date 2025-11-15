public class Veiculo {

    // Atributos
    private String marca;
    private String modelo;
    private int ano;

    //Construtor

    public Veiculo(){

    }
    
    // Getters e Setters

    // Getter e Setter para marca
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    // Getter e Setter para modelo
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    // Getter e Setter para ano
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

   
    // Métodos

    public String ligar() {
        return "Sistema de Gestão de Veículos iniciado.";
    }

    public String mostrarInfo() {
        return "Informações do Veículo:";
    }

    public String mostrarInfoMarca() {
        return "Marca do veículo: " + this.marca;
    }
    public String mostrarInfoModelo() {
        return "Modelo do veículo: " + this.modelo;
    }
    public String mostrarInfoAno() {
        return "Ano do veículo: " + this.ano;
    }


}