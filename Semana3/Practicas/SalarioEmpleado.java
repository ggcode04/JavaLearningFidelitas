import javax.swing.JOptionPane;

public class SalarioEmpleado {

    public static void main(String[] args) {

        String sAnos;
        String sHoras;
        String sSalario;

        int nAnos;
        int nHoras;

        double dPagoHora;
        double dSalarioBruto;
        double dBono = 0;
        double dDeduccion = 0;
        double dSalarioNeto;

        // Solicitar datos
        sAnos = JOptionPane.showInputDialog("Ingrese los años de antigüedad en la empresa");
        nAnos = Integer.parseInt(sAnos);

        sHoras = JOptionPane.showInputDialog("Ingrese la cantidad de horas laboradas por semana");
        nHoras = Integer.parseInt(sHoras);

        sSalario = JOptionPane.showInputDialog("Ingrese el pago que recibe por hora");
        dPagoHora = Double.parseDouble(sSalario);

        // Calcular salario bruto
        dSalarioBruto = nHoras * dPagoHora;

        // Aplicar bono si tiene más de 12 años
        if (nAnos > 12) {
            dBono = dSalarioBruto * 0.055;
            dSalarioBruto = dSalarioBruto + dBono;
        }

        // Aplicar deducciones
        if (dSalarioBruto > 3500) {
            dDeduccion = dSalarioBruto * 0.038;

        } else if (dSalarioBruto > 2500) {
            dDeduccion = dSalarioBruto * 0.027;
        }

        // Calcular salario neto
        dSalarioNeto = dSalarioBruto - dDeduccion;

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "Salario bruto: $" + dSalarioBruto + "\nBono aplicado: $" + dBono + "\nDeducción aplicada: $" + dDeduccion + "\nSalario neto final: $" + dSalarioNeto);
    }
}