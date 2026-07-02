import javax.swing.JOptionPane;

public class MainCuentaBancaria {
     public static void main(String[] args) {

        // Crear la cuenta
        JOptionPane.showMessageDialog(null, "Ingrese los datos de la Cuenta Bancaria");

        String numero  = JOptionPane.showInputDialog("Número de cuenta:");
        String titular = JOptionPane.showInputDialog("Titular:");
        double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial:"));

        CuentaBancaria cuenta = new CuentaBancaria(numero, titular, saldoInicial);

        JOptionPane.showMessageDialog(null,
            "Cuenta creada exitosamente.\nSaldo inicial: " + cuenta.consultarSaldo(),
            "Cuenta Bancaria", JOptionPane.INFORMATION_MESSAGE);

        // Depósito
        double montoDeposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
        if (montoDeposito > 0) {
            cuenta.depositar(montoDeposito);
            JOptionPane.showMessageDialog(null,
                "Depósito realizado.\nNuevo saldo: " + cuenta.consultarSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "El monto debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Retiro válido
        double montoRetiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
        if (montoRetiro > cuenta.consultarSaldo()) {
            JOptionPane.showMessageDialog(null,
                "Fondos insuficientes.\nSaldo actual: " + cuenta.consultarSaldo(),
                "Retiro fallido", JOptionPane.WARNING_MESSAGE);
        } else {
            cuenta.retirar(montoRetiro);
            JOptionPane.showMessageDialog(null,
                "Retiro realizado.\nNuevo saldo: " + cuenta.consultarSaldo());
        }

        // Retiro que excede el saldo (prueba de validación)
        double montoExcesivo = Double.parseDouble(JOptionPane.showInputDialog(
            "Ingrese un monto mayor al saldo para probar la validación\n(Saldo actual: " + cuenta.consultarSaldo() + "):"));
        if (montoExcesivo > cuenta.consultarSaldo()) {
            JOptionPane.showMessageDialog(null,
                "Fondos insuficientes.\nNo se puede retirar " + montoExcesivo +
                ".\nSaldo actual: " + cuenta.consultarSaldo(),
                "Retiro fallido", JOptionPane.WARNING_MESSAGE);
        } else {
            cuenta.retirar(montoExcesivo);
            JOptionPane.showMessageDialog(null, "Retiro realizado.\nNuevo saldo: " + cuenta.consultarSaldo());
        }
    }
}