public class Professor {
    private String nome; 
    private regimePagamento regimePagamento;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRegimePagamento(regimePagamento regimePagamento) {
        this.regimePagamento = regimePagamento;
    }
    public regimePagamento getRegimePagamento() {
        return regimePagamento;
    }

    
}
