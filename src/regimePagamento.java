import javax.swing.JOptionPane;

public class regimePagamento {
    private Professor professor;
    private String tipoPagamento;

    public void verificarPagamento() {
        if (professor.getRegimePagamento().getTipoPagamento().equals("CPF")) {
            double ValorSalaio = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do seu salário"));
            JOptionPane.showMessageDialog(null, "O professor " + professor.getNome() + " receberá o valor de: R$ " + ValorSalaio + " seu regime de tabalho é: " + professor.getRegimePagamento().getTipoPagamento());
        } else if (professor.getRegimePagamento().getTipoPagamento().equals("Horista")) {
            int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de Horas trabalhadas"));
            double valorPorHorasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor por Horas trabalhadas"));
            double calcularHorasTrabalhadas = horasTrabalhadas * valorPorHorasTrabalhadas; 
            JOptionPane.showMessageDialog(null, "O professor " + professor.getNome() +" receberá o valor de: R$ " + calcularHorasTrabalhadas + " seu regime de tabalho é: " + professor.getRegimePagamento().getTipoPagamento());
        }else if (professor.getRegimePagamento().getTipoPagamento().equals("PJ")) {
            double valorContrato = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do contrato"));
            JOptionPane.showMessageDialog(null,"O professor " + professor.getNome() + " receberá o valor de: R$ " + valorContrato + " seu regime de tabalho é: " + professor.getRegimePagamento().getTipoPagamento());
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
