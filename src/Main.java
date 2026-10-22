public class Main
{
    void main()
    {
    double balence = 5000.0;
    double RATE = .17;

    // first month
    balence = balence + balence * RATE; //

    IO.println("The balence after one month is: " + balence);

    // second month

    IO.println("The balence after two months is : " + balence);
    
    }
}
