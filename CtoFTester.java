public class CtoFTester{
  public static int celsiusToFahrenheit(temp) {
    return (1.8 * temp) + 32
  }
  public static int fahrenheitToCelsius(temp) {
    return ((temp - 32) * 5) / 9
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
