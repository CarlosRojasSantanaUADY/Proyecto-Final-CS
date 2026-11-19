public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Ventas - Cine");
        calcularTotalDulceria(2, 1);
    }

    public static void calcularTotalDulceria(int combosPalomitas, int refrescos) {
        double precioCombo = 120.0;
        double precioRefresco = 45.0;
        double total = (combosPalomitas * precioCombo) + (refrescos * precioRefresco);
        System.out.println("Total a pagar en dulceria: $" + total);
    }
}
