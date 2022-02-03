public class TablaConversor{
    public void ejecuta(){
        // Crea la tabla de conversión, muestra los encabezados etc

        System.out.println("C\tF\t\tR");
        for(int celsius = 0; celsius<=100; celsius += 5){
            Conversor c = new Fahrenheit();
            double resF = c.convertir(celsius);
            c = new Reaumur();
            double resR = c.convertir(celsius);
            System.out.println(celsius + "\t" + resF + "\t" + resR);
        }
    }
}
