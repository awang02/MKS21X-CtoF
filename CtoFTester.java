public class CtoFTester{
  public static double celsiusToFahrenheit(double temp) {
    return (1.8 * temp) + 32.0;
  }
  public static double fahrenheitToCelsius(double temp) {
    return ((temp - 32.0) * 5.0) / 9.0;
  }

  public static void main(String[] args){
    System.out.println( celsiusToFahrenheit(0));
    System.out.println( celsiusToFahrenheit(37));
    System.out.println( celsiusToFahrenheit(-40));
    System.out.println( fahrenheitToCelsius(212));
    System.out.println( fahrenheitToCelsius(50));
    System.out.println( fahrenheitToCelsius(-40));
  }
}
