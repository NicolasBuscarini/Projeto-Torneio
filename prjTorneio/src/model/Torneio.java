
package model;


public class Torneio {
    private String nome;
    private int idade;

    
    public Torneio(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public void ImprimirDados(){
        System.out.println("Nome     :..........."+this.getNome()+
                         "\nIdade    :..........."+this.getIdade()+
                         "\nCategoria:..........."+this.verificarDados());
    }
    
    public String verificarDados(){
        //int idade = this.getIdade();
        if (this.idade<5){
            return "Não possui categoria para essa idade!!!";
        }
        else{
            if(this.idade >= 5 && this.idade<=7){
                return "Infantil";
            }
            else{
                if(this.idade >=8 && this.idade <=10){
                    return "Juvenil";
                }
                else{
                    if(this.idade >= 11 && this.idade <=15){
                        return "Adolescente";
                    }
                    else{
                        if(this.idade >=16 && this.idade <= 30){
                            return "Adulto";
                        }
                        else{
                            return "Senior";
                        }
                    }
                }
            }
        }
        
    }
}
