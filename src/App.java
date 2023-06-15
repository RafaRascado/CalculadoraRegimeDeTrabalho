public class App {
    public static void main(String[] args) throws Exception {

        Professor professor1 = new Professor();
        professor1.setNome("Rafael");

        regimePagamento reg1 = new regimePagamento();

        professor1.setRegimePagamento(reg1);
        reg1.setProfessor(professor1);

        reg1.setTipoPagamento("CPF");
        reg1.verificarPagamento();
    }
}
